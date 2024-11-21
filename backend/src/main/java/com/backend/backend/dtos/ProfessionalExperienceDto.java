package com.backend.backend.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProfessionalExperienceDto {
    String jobTitle;
    Integer startYear;
    Integer endYear;
    String company;
    Boolean currentlyEmployed;
    Integer user_id;
}