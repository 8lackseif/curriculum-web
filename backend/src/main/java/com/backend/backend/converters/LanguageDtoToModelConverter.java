package com.backend.backend.converters;

import com.backend.backend.dtos.LanguageDto;
import com.backend.backend.models.LanguageModel;
import com.backend.backend.models.UserModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LanguageDtoToModelConverter implements Converter<LanguageDto, LanguageModel> {
    @Override
    public LanguageModel convert(LanguageDto language) {
        return LanguageModel
                .builder()
                .level(language.getLevel())
                .language(language.getLanguage())
                .user(UserModel.builder().id(language.getUser_id()).build())
                .build();
    }
}
