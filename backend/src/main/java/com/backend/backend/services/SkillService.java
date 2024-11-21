package com.backend.backend.services;

import com.backend.backend.models.SkillModel;

import java.util.List;

public interface SkillService {
    List<SkillModel> findAllByUserId(Integer id);
}
