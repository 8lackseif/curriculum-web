SET NAMES utf8mb4 COLLATE utf8mb4_unicode_ci;
SET CHARACTER SET utf8mb4;

-- Inserting into the 'users' table
INSERT INTO users (name, surname, phone_number, email, summary)
VALUES ('Bin', 'Chen', '+34688001661', 'bchen01w@gmail.com', 'Full Stack Developer');

-- Inserting into the 'skills' table
INSERT INTO skills (skill, level, user_id)
VALUES 
    ('Java', 'Intermediate', 1),
    ('C++', 'Basic', 1),
    ('JavaScript', 'Intermediate', 1),
    ('Kotlin', 'Intermediate', 1),
    ('HTML', 'Intermediate', 1),
    ('CSS', 'Intermediate', 1),
    ('Go', 'Basic', 1),
    ('Rust', 'Basic', 1),
    ('C', 'Basic', 1),
    ('Bash', 'Basic', 1),
    ('ABAP', 'Basic', 1),
    ('SQL', 'Intermediate', 1),
    ('SpringBoot', 'Basic', 1),
    ('Vue', 'Basic', 1),
    ('Git', 'Intermediate', 1);

-- Inserting into the 'education' table
INSERT INTO education (title, start_year, end_year, school, finished, user_id)
VALUES
    ('Desarrollo de Aplicaciones Multiplataforma', 2022, 2024, 'IES El Lago', TRUE, 1),
    ('Ingeniería Software', 2019, 2022, 'Universidad Complutense de Madrid', FALSE, 1);

-- Inserting into the 'professional_experience' table
INSERT INTO professional_experience (job_title, start_year, end_year, company, currently_employed, user_id)
VALUES 
    ('Estudiante Prácticas FP', 2024, 2024, 'AspaNETCONOMY', FALSE, 1);

-- Inserting into the 'social_media' table
INSERT INTO social_media (social_media, link, user_id)
VALUES
    ('LinkedIn', 'www.linkedin.com/in/binchen20014475', 1),
    ('GitHub', 'https://github.com/8lackseif', 1);

-- Inserting into the 'languages' table
INSERT INTO languages (language, level, user_id)
VALUES 
    ('Inglés', 'Intermediate', 1),
    ('Español', 'Advanced', 1),
    ('Chino', 'Advanced', 1);

-- Inserting into the 'other_recognitions' table
INSERT INTO other_recognitions (name, description, year, user_id)
VALUES 
    ('Concurso Programame 2024', 'Primer puesto concurso de programación Programame 2024 Regional de Villaviciosa de Odón, equipo barrabinbarrabashh.', 2024, 1);

-- Inserting into the 'projects' table
INSERT INTO projects (title, description, project_link, user_id)
VALUES
    ('Mi curriculum Web', 'Página web con mi curriculum digital(hecho con angular y springboot)','por hacer', 1),
    ('Bot de Discord', 'Bot de discord hecho con Golang','https://github.com/8lackseif/GOtWebo2', 1),
    ('Trabajo fin de curso', 'Aplicación web para gestionar inventario hecho con Vue.js y Rust(Rocket APIRest)','https://github.com/8lackseif/TFC-DAM', 1);

