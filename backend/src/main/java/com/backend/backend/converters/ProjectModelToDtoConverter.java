package com.backend.backend.converters;

import com.backend.backend.dtos.ProjectDto;
import com.backend.backend.models.ProjectModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProjectModelToDtoConverter implements Converter<ProjectModel, ProjectDto> {
    @Override
    public ProjectDto convert(ProjectModel project) {
        return ProjectDto
                .builder()
                .title(project.getTitle())
                .description(project.getDescription())
                .projectLink(project.getProjectLink())
                .user_id(project.getUser().getId())
                .build();
    }
}
