package com.backend.backend.converters;

import com.backend.backend.dtos.OtherRecognitionDto;
import com.backend.backend.models.OtherRecognitionModel;
import com.backend.backend.models.UserModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class OtherRecognitionDtoToModelConverter implements Converter<OtherRecognitionDto, OtherRecognitionModel> {
    @Override
    public OtherRecognitionModel convert(OtherRecognitionDto otherRecognition) {
        return OtherRecognitionModel
                .builder()
                .description(otherRecognition.getDescription())
                .year(otherRecognition.getYear())
                .name(otherRecognition.getName())
                .user(UserModel.builder().id(otherRecognition.getUser_id()).build())
                .build();
    }
}
