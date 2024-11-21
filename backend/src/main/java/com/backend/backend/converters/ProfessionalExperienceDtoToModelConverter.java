package com.backend.backend.converters;

import com.backend.backend.dtos.ProfessionalExperienceDto;
import com.backend.backend.models.ProfessionalExperienceModel;
import com.backend.backend.models.UserModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProfessionalExperienceDtoToModelConverter implements Converter<ProfessionalExperienceDto, ProfessionalExperienceModel> {
    @Override
    public ProfessionalExperienceModel convert(ProfessionalExperienceDto professionalExperience) {
        return ProfessionalExperienceModel
                .builder()
                .startYear(professionalExperience.getStartYear())
                .endYear(professionalExperience.getEndYear())
                .company(professionalExperience.getCompany())
                .currentlyEmployed(professionalExperience.getCurrentlyEmployed())
                .jobTitle(professionalExperience.getJobTitle())
                .user(UserModel.builder().id(professionalExperience.getUser_id()).build())
                .build();
    }
}
