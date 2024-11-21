package com.backend.backend.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.backend.backend.models.EducationModel}
 */
@Value
public class EducationDto implements Serializable {
    String title;
    Integer startYear;
    Integer endYear;
    String school;
    Boolean finished;
}