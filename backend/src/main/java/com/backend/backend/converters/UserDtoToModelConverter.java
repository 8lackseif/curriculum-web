package com.backend.backend.converters;

import com.backend.backend.dtos.UserDto;
import com.backend.backend.models.UserModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserDtoToModelConverter implements Converter<UserDto, UserModel> {

    @Override
    public UserModel convert(UserDto userDto) {
        return UserModel
                .builder()
                .id(userDto.getId())
                .name(userDto.getName())
                .surname(userDto.getSurname())
                .email(userDto.getEmail())
                .phoneNumber(userDto.getPhoneNumber())
                .summary(userDto.getSummary())
                .build();
    }
}
