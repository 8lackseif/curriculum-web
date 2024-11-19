CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,                                     -- User name
    surname VARCHAR(255) NOT NULL,                                  -- User surname
    phone_number VARCHAR(20),                                       -- user phone number
    email VARCHAR(255) NOT NULL UNIQUE,                             -- User email
    summary TEXT,                                                   -- User summary
    CONSTRAINT unique_name_surname UNIQUE (name, surname)
);

CREATE TABLE skills (
    id INT AUTO_INCREMENT PRIMARY KEY,  
    skill VARCHAR(255) NOT NULL,                                    -- Skill name
    level ENUM('basic', 'intermediate', 'advanced') NOT NULL,       -- Level of the skill
    user_id INT,                                                    -- Foreign key to link the recognition to a user
    CONSTRAINT unique_skill UNIQUE (LOWER(skill)),
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE education (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,                                    -- Education title
    init_year INT NOT NULL,                                         -- Start year
    finish_year INT,                                                -- Finish year
    school VARCHAR(255) NOT NULL,                                   -- Educational center
    finished BOOLEAN NOT NULL,                                      -- If you finished the education
    user_id INT,                                                    -- Foreign key to link the recognition to a user
    CONSTRAINT unique_title_school_user UNIQUE (title, school, user_id),
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE professional_experience (
    id INT AUTO_INCREMENT PRIMARY KEY,                              
    job_title VARCHAR(255) NOT NULL,                                -- Job title/position
    start_year INT NOT NULL,                                        -- Start year
    end_year INT,                                                   -- End year
    company VARCHAR(255) NOT NULL,                                  -- Company name
    currently_employed BOOLEAN NOT NULL,                            -- If you are still employed there
    user_id INT,                                                    -- Foreign key to link the recognition to a user
    CONSTRAINT unique_job_title_company_user UNIQUE (job_title, company, user_id),
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE social_media (
    id INT AUTO_INCREMENT PRIMARY KEY,
    social_media_name VARCHAR(255) NOT NULL,                        -- Social media name
    link VARCHAR(255) NOT NULL,                                     -- Link to the social media profile
    user_id INT,                                                    -- Foreign key to link the recognition to a user
    CONSTRAINT unique_social_media_user UNIQUE (social_media_name, user_id),
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE languages (
    id INT AUTO_INCREMENT PRIMARY KEY,
    language VARCHAR(255) NOT NULL,                                 -- The language user knows
    level ENUM('Basic', 'Intermediate', 'Advanced') NOT NULL,       -- Level of the language
    user_id INT,                                                    -- Foreign key to link the recognition to a user
    CONSTRAINT unique_language_user UNIQUE (language, user_id),
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE other_recognitions (
    id INT AUTO_INCREMENT PRIMARY KEY,     
    name VARCHAR(255) NOT NULL,                                     -- Name of the recognition
    description TEXT,                                               -- Description of the recognition
    year INT NOT NULL,                                              -- Year that you earn the recognition
    user_id INT,                                                    -- Foreign key to link the recognition to a user
    CONSTRAINT unique_recognition_user UNIQUE (name, user_id),  
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE projects (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,                                    -- Project title
    description TEXT,                                               -- Description of the project
    project_link VARCHAR(255),                                      -- Link to the project (e.g., GitHub repo, live demo)
    user_id INT,                                                    -- Foreign key to link the project to a user
    CONSTRAINT unique_title_per_user UNIQUE (user_id, title)        -- Ensures title is unique for each user,
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);



