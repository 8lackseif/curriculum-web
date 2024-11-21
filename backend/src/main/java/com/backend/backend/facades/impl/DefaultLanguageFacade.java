package com.backend.backend.facades.impl;

import com.backend.backend.converters.LanguageDtoToModelConverter;
import com.backend.backend.converters.LanguageModelToDtoConverter;
import com.backend.backend.dtos.LanguageDto;
import com.backend.backend.facades.LanguageFacade;
import com.backend.backend.services.LanguageService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DefaultLanguageFacade implements LanguageFacade {

    @Resource
    private LanguageService languageService;

    @Resource
    private LanguageDtoToModelConverter languageDtoToModelConverter;

    @Resource
    private LanguageModelToDtoConverter languageModelToDtoConverter;

    @Override
    public List<LanguageDto> getAllByUserId(Integer id) {
        return languageService
                .findAllByUserId(id)
                .stream()
                .map(languageModelToDtoConverter::convert)
                .collect(Collectors.toList());
    }
}
