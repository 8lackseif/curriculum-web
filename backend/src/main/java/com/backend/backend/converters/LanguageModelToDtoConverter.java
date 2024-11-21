package com.backend.backend.converters;

import com.backend.backend.dtos.LanguageDto;
import com.backend.backend.models.LanguageModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LanguageModelToDtoConverter implements Converter<LanguageModel, LanguageDto> {

    @Override
    public LanguageDto convert(LanguageModel language) {
        return LanguageDto
                .builder()
                .level(language.getLevel())
                .language(language.getLanguage())
                .user_id(language.getUser().getId())
                .build();
    }
}
