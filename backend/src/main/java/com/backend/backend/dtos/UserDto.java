package com.backend.backend.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.backend.backend.models.UserModel}
 */
@Value
public class UserDto implements Serializable {
    Integer id;
    String name;
    String surname;
    String phoneNumber;
    String email;
    String summary;
}