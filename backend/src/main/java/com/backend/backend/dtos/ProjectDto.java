package com.backend.backend.dtos;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProjectDto {
    String title;
    String description;
    String projectLink;
    Integer user_id;
}