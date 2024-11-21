package com.backend.backend.services.impl;

import com.backend.backend.daos.LanguageDao;
import com.backend.backend.models.LanguageModel;
import com.backend.backend.services.LanguageService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultLanguageService implements LanguageService {

    @Resource
    private LanguageDao languageDao;

    @Override
    public List<LanguageModel> findAllByUserId(Integer id) {
        return languageDao.getLanguageModelByUser_Id(id);
    }
}
