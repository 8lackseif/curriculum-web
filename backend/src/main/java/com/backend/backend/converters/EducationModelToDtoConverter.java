package com.backend.backend.converters;

import com.backend.backend.dtos.EducationDto;
import com.backend.backend.models.EducationModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EducationModelToDtoConverter implements Converter<EducationModel, EducationDto> {
    @Override
    public EducationDto convert(EducationModel education) {
        return EducationDto
                        .builder()
                        .title(education.getTitle())
                        .endYear(education.getEndYear())
                        .startYear(education.getStartYear())
                        .finished(education.getFinished())
                        .school(education.getSchool())
                        .user_id(education.getUser().getId())
                        .build();
    }
}
