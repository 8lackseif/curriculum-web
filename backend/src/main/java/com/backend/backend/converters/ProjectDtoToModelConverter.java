package com.backend.backend.converters;

import com.backend.backend.dtos.ProjectDto;
import com.backend.backend.models.ProjectModel;
import com.backend.backend.models.UserModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProjectDtoToModelConverter implements Converter<ProjectDto, ProjectModel> {
    @Override
    public ProjectModel convert(ProjectDto project) {
        return ProjectModel
                .builder()
                .description(project.getDescription())
                .title(project.getTitle())
                .projectLink(project.getProjectLink())
                .user(UserModel.builder().id(project.getUser_id()).build())
                .build();
    }
}
