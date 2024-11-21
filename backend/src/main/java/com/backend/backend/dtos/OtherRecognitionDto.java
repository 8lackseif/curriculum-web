package com.backend.backend.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OtherRecognitionDto {
    String name;
    String description;
    Integer year;
    Integer user_id;
}