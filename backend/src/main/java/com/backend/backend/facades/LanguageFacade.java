package com.backend.backend.facades;

import com.backend.backend.dtos.LanguageDto;

import java.util.List;

public interface LanguageFacade {
    List<LanguageDto> getAllByUserId(Integer id);
}
