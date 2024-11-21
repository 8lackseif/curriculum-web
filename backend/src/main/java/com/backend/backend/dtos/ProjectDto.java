package com.backend.backend.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.backend.backend.models.ProjectModel}
 */
@Value
public class ProjectDto implements Serializable {
    String title;
    String description;
    String projectLink;
}