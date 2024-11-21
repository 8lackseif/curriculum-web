package com.backend.backend.converters;

import com.backend.backend.dtos.EducationDto;
import com.backend.backend.models.EducationModel;
import com.backend.backend.models.UserModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EducationDtoToModelConverter implements Converter<EducationDto, EducationModel> {
    @Override
    public EducationModel convert(EducationDto education) {
        return EducationModel
                        .builder()
                        .startYear(education.getStartYear())
                        .endYear(education.getEndYear())
                        .finished(education.getFinished())
                        .title(education.getTitle())
                        .school(education.getSchool())
                        .user(UserModel.builder().id(education.getUser_id()).build())
                        .build();
    }
}
