package com.backend.backend.services;

import com.backend.backend.models.EducationModel;

import java.util.List;

public interface EducationService {
    List<EducationModel> findAllByUserId(Integer id);
}
