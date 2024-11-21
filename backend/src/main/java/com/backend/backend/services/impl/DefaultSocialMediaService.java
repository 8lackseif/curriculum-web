package com.backend.backend.services.impl;

import com.backend.backend.daos.SocialMediaDao;
import com.backend.backend.models.SocialMediaModel;
import com.backend.backend.services.SocialMediaService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultSocialMediaService implements SocialMediaService {

    @Resource
    private SocialMediaDao socialMediaDao;

    @Override
    public List<SocialMediaModel> findAllByUserId(Integer id) {
        return socialMediaDao.getSocialMediaModelByUser_Id(id);
    }
}
