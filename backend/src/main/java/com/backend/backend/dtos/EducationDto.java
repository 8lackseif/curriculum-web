package com.backend.backend.dtos;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class EducationDto {
    String title;
    Integer startYear;
    Integer endYear;
    String school;
    Boolean finished;
    Integer user_id;
}