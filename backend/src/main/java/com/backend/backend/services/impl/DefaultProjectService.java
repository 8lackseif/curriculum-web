package com.backend.backend.services.impl;

import com.backend.backend.daos.ProjectDao;
import com.backend.backend.models.ProjectModel;
import com.backend.backend.services.ProjectService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultProjectService implements ProjectService {

    @Resource
    private ProjectDao projectDao;

    @Override
    public List<ProjectModel> findAllByUserId(Integer id) {
        return projectDao.getProjectModelByUser_Id(id);
    }
}
