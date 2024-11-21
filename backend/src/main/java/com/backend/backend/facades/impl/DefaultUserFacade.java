package com.backend.backend.facades.impl;

import com.backend.backend.converters.UserDtoToModelConverter;
import com.backend.backend.converters.UserModelToDtoConverter;
import com.backend.backend.dtos.UserDto;
import com.backend.backend.facades.UserFacade;
import com.backend.backend.services.impl.DefaultUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class DefaultUserFacade implements UserFacade {

    @Resource
    private DefaultUserService userService;

    @Resource
    private UserDtoToModelConverter userDtoToModelConverter;

    @Resource
    private UserModelToDtoConverter userModelToDtoConverter;

    @Override
    public UserDto findUserByName(String name, String surname) {
        return userModelToDtoConverter.convert(userService.findByUsername(name, surname));
    }
}
