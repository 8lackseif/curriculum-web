package com.backend.backend.services.impl;

import com.backend.backend.daos.SkillDao;
import com.backend.backend.models.SkillModel;
import com.backend.backend.services.SkillService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultSkillService implements SkillService {

    @Resource
    private SkillDao skillDao;


    @Override
    public List<SkillModel> findAllByUserId(Integer id) {
        return skillDao.getSkillModelByUser_Id(id);
    }
}
