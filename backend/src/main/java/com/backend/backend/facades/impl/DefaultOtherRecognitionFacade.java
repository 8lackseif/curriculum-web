package com.backend.backend.facades.impl;

import com.backend.backend.converters.OtherRecognitionDtoToModelConverter;
import com.backend.backend.converters.OtherRecognitionModelToDtoConverter;
import com.backend.backend.dtos.OtherRecognitionDto;
import com.backend.backend.facades.OtherRecognitionFacade;
import com.backend.backend.services.OtherRecognitionService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DefaultOtherRecognitionFacade implements OtherRecognitionFacade {

    @Resource
    private OtherRecognitionService otherRecognitionService;

    @Resource
    private OtherRecognitionDtoToModelConverter otherRecognitionDtoToModelConverter;

    @Resource
    private OtherRecognitionModelToDtoConverter otherRecognitionModelToDtoConverter;

    @Override
    public List<OtherRecognitionDto> getAllByUserId(Integer id) {
        return otherRecognitionService
                .findAllByUserId(id)
                .stream()
                .map(otherRecognitionModelToDtoConverter::convert)
                .collect(Collectors.toList());
    }
}
