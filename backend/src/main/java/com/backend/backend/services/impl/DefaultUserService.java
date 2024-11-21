package com.backend.backend.services.impl;

import com.backend.backend.daos.UserDao;
import com.backend.backend.models.UserModel;
import com.backend.backend.services.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DefaultUserService implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserModel findByUsername(String name, String surname) {
        return userDao.findByNameAndSurname(name, surname);
    }
}
