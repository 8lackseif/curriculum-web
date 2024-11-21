package com.backend.backend.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.backend.backend.models.ProfessionalExperienceModel}
 */
@Value
public class ProfessionalExperienceDto implements Serializable {
    String jobTitle;
    Integer startYear;
    Integer endYear;
    String company;
    Boolean currentlyEmployed;
}