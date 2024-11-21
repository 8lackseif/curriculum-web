package com.backend.backend.converters;

import com.backend.backend.dtos.ProfessionalExperienceDto;
import com.backend.backend.models.ProfessionalExperienceModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProfessionalExperienceModelToDtoConverter implements Converter<ProfessionalExperienceModel, ProfessionalExperienceDto> {
    @Override
    public ProfessionalExperienceDto convert(ProfessionalExperienceModel professionalExperience) {
        return ProfessionalExperienceDto
                .builder()
                .startYear(professionalExperience.getStartYear())
                .endYear(professionalExperience.getEndYear())
                .company(professionalExperience.getCompany())
                .currentlyEmployed(professionalExperience.getCurrentlyEmployed())
                .jobTitle(professionalExperience.getJobTitle())
                .user_id(professionalExperience.getUser().getId())
                .build();
    }
}
