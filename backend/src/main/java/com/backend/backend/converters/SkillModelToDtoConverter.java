package com.backend.backend.converters;

import com.backend.backend.dtos.SkillDto;
import com.backend.backend.models.SkillModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SkillModelToDtoConverter implements Converter<SkillModel, SkillDto> {
    @Override
    public SkillDto convert(SkillModel skill) {
        return SkillDto
                .builder()
                .level(skill.getLevel())
                .skill(skill.getSkill())
                .user_id(skill.getUser().getId())
                .build();
    }
}
