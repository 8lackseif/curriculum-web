package com.backend.backend.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.backend.backend.models.LanguageModel}
 */
@Value
public class LanguageDto implements Serializable {
    String language;
    String level;
}