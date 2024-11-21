package com.backend.backend.facades.impl;

import com.backend.backend.converters.SkillDtoToModelConverter;
import com.backend.backend.converters.SkillModelToDtoConverter;
import com.backend.backend.dtos.SkillDto;
import com.backend.backend.facades.SkillFacade;
import com.backend.backend.services.SkillService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DefaultSkillFacade implements SkillFacade {

    @Resource
    private SkillService skillService;

    @Resource
    private SkillDtoToModelConverter skillDtoToModelConverter;

    @Resource
    private SkillModelToDtoConverter skillModelToDtoConverter;

    @Override
    public List<SkillDto> getAllByUserId(Integer id) {
        return skillService
                .findAllByUserId(id)
                .stream()
                .map(skillModelToDtoConverter::convert)
                .collect(Collectors.toList());
    }
}
