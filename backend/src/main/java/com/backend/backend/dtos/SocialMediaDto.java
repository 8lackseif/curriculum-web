package com.backend.backend.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.backend.backend.models.SocialMediaModel}
 */
@Value
public class SocialMediaDto implements Serializable {
    String socialMedia;
    String link;
}