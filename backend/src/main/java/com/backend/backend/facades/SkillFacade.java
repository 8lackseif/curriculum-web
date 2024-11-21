package com.backend.backend.facades;

import com.backend.backend.dtos.SkillDto;

import java.util.List;

public interface SkillFacade {
    List<SkillDto> getAllByUserId(Integer id);
}
