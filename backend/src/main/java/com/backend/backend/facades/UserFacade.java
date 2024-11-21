package com.backend.backend.facades;

import com.backend.backend.dtos.UserDto;

public interface UserFacade {
    UserDto findUserByName(String name, String surname);
}
