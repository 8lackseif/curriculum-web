package com.backend.backend.facades.impl;

import com.backend.backend.converters.ProfessionalExperienceDtoToModelConverter;
import com.backend.backend.converters.ProfessionalExperienceModelToDtoConverter;
import com.backend.backend.dtos.ProfessionalExperienceDto;
import com.backend.backend.facades.ProfessionalExperienceFacade;
import com.backend.backend.services.ProfessionalExperienceService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DefaultProfessionalExperienceFacade implements ProfessionalExperienceFacade {

    @Resource
    private ProfessionalExperienceService professionalExperienceService;

    @Resource
    private ProfessionalExperienceDtoToModelConverter professionalExperienceDtoToModelConverter;

    @Resource
    private ProfessionalExperienceModelToDtoConverter professionalExperienceModelToDtoConverter;

    @Override
    public List<ProfessionalExperienceDto> getAllByUserId(Integer id) {
        return professionalExperienceService
                .findAllByUserId(id)
                .stream()
                .map(professionalExperienceModelToDtoConverter::convert)
                .collect(Collectors.toList());
    }
}
