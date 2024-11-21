package com.backend.backend.facades.impl;

import com.backend.backend.converters.EducationDtoToModelConverter;
import com.backend.backend.converters.EducationModelToDtoConverter;
import com.backend.backend.dtos.EducationDto;
import com.backend.backend.facades.EducationFacade;
import com.backend.backend.services.impl.DefaultEducationService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DefaultEducationFacade implements EducationFacade {

    @Resource
    private DefaultEducationService educationService;

    @Resource
    private EducationDtoToModelConverter educationDtoToModelConverter;

    @Resource
    private EducationModelToDtoConverter educationModelToDtoConverter;


    @Override
    public List<EducationDto> getAllByUserId(Integer id) {
        return educationService
                .findAllByUserId(id)
                .stream()
                .map(educationModelToDtoConverter::convert)
                .collect(Collectors.toList());
    }
}
