package com.backend.backend.converters;

import com.backend.backend.dtos.OtherRecognitionDto;
import com.backend.backend.models.OtherRecognitionModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class OtherRecognitionModelToDtoConverter implements Converter<OtherRecognitionModel, OtherRecognitionDto> {
    @Override
    public OtherRecognitionDto convert(OtherRecognitionModel otherRecognition) {
        return OtherRecognitionDto
                .builder()
                .description(otherRecognition.getDescription())
                .name(otherRecognition.getName())
                .year(otherRecognition.getYear())
                .user_id(otherRecognition.getUser().getId())
                .build();
    }
}
