package com.backend.backend.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.backend.backend.models.OtherRecognitionModel}
 */
@Value
public class OtherRecognitionDto implements Serializable {
    String name;
    String description;
    Integer year;
}