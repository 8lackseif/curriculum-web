package com.backend.backend.services.impl;

import com.backend.backend.daos.EducationDao;
import com.backend.backend.models.EducationModel;
import com.backend.backend.services.EducationService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultEducationService implements EducationService {

    @Resource
    private EducationDao educationDao;
    @Override
    public List<EducationModel> findAllByUserId(Integer id) {
        return educationDao.findAllByUser_Id(id);
    }
}
