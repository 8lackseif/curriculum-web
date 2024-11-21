package com.backend.backend.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserDto {
    Integer id;
    String name;
    String surname;
    String phoneNumber;
    String email;
    String summary;
}