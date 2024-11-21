package com.backend.backend.services;

import com.backend.backend.models.LanguageModel;
import java.util.List;

public interface LanguageService {
    List<LanguageModel> findAllByUserId(Integer id);
}
