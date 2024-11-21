package com.backend.backend.facades;

import com.backend.backend.dtos.ProjectDto;

import java.util.List;

public interface ProjectFacade {
    List<ProjectDto> getAllByUserId(Integer id);
}
