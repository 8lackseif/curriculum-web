package com.backend.backend.converters;


import com.backend.backend.dtos.UserDto;
import com.backend.backend.models.UserModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserModelToDtoConverter implements Converter<UserModel, UserDto> {
    @Override
    public UserDto convert(UserModel userModel) {
        return UserDto
                    .builder()
                    .id(userModel.getId())
                    .name(userModel.getName())
                    .surname(userModel.getSurname())
                    .email(userModel.getEmail())
                    .phoneNumber(userModel.getPhoneNumber())
                    .build();
    }
}
