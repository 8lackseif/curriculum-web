package com.backend.backend.converters;

import com.backend.backend.dtos.SkillDto;
import com.backend.backend.models.SkillModel;
import com.backend.backend.models.UserModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SkillDtoToModelConverter implements Converter<SkillDto, SkillModel> {
    @Override
    public SkillModel convert(SkillDto skill) {
        return SkillModel
                .builder()
                .level(skill.getLevel())
                .skill(skill.getSkill())
                .user(UserModel.builder().id(skill.getUser_id()).build())
                .build();
    }
}
