package com.backend.backend.services;

import com.backend.backend.models.SocialMediaModel;

import java.util.List;

public interface SocialMediaService {
    List<SocialMediaModel> findAllByUserId(Integer id);
}
