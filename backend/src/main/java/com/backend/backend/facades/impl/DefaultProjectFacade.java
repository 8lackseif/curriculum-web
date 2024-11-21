package com.backend.backend.facades.impl;

import com.backend.backend.converters.ProjectDtoToModelConverter;
import com.backend.backend.converters.ProjectModelToDtoConverter;
import com.backend.backend.dtos.ProjectDto;
import com.backend.backend.facades.ProjectFacade;
import com.backend.backend.services.ProjectService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DefaultProjectFacade implements ProjectFacade {

    @Resource
    private ProjectService projectService;

    @Resource
    private ProjectDtoToModelConverter projectDtoToModelConverter;

    @Resource
    private ProjectModelToDtoConverter projectModelToDtoConverter;


    @Override
    public List<ProjectDto> getAllByUserId(Integer id) {
        return projectService
                .findAllByUserId(id)
                .stream()
                .map(projectModelToDtoConverter::convert)
                .collect(Collectors.toList());
    }
}
