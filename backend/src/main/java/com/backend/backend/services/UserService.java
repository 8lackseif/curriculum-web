package com.backend.backend.services;

import com.backend.backend.models.UserModel;

public interface UserService {
    UserModel findByUsername(String name, String surname);
}
