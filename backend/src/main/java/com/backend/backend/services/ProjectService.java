package com.backend.backend.services;

import com.backend.backend.models.ProjectModel;

import java.util.List;

public interface ProjectService {
    List<ProjectModel> findAllByUserId(Integer id);
}
