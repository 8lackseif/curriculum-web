package com.backend.backend.facades;

import com.backend.backend.dtos.SocialMediaDto;

import java.util.List;

public interface SocialMediaFacade {
    List<SocialMediaDto> findAllByUserId(Integer id);
}
