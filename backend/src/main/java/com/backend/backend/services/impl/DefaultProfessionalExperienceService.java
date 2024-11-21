package com.backend.backend.services.impl;

import com.backend.backend.daos.OtherRecognitionDao;
import com.backend.backend.daos.ProfessionalExperienceDao;
import com.backend.backend.models.ProfessionalExperienceModel;
import com.backend.backend.services.ProfessionalExperienceService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultProfessionalExperienceService implements ProfessionalExperienceService {

    @Resource
    private ProfessionalExperienceDao professionalExperienceDao;

    @Override
    public List<ProfessionalExperienceModel> findAllByUserId(Integer id) {
        return professionalExperienceDao.getProfessionalExperienceModelByUser_Id(id);
    }
}
