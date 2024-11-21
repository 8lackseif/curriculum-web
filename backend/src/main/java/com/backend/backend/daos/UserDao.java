package com.backend.backend.daos;

import com.backend.backend.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserModel, Long> {
    UserModel findByNameAndSurname(String name, String surname);
}
