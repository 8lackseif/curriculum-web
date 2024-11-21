package com.backend.backend.services;

import com.backend.backend.models.ProfessionalExperienceModel;

import java.util.List;

public interface ProfessionalExperienceService {
    List<ProfessionalExperienceModel> findAllByUserId(Integer id);
}
