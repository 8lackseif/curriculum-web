package com.backend.backend.facades.impl;

import com.backend.backend.converters.SocialMediaDtoToModelConverter;
import com.backend.backend.converters.SocialMediaModelToDtoConverter;
import com.backend.backend.dtos.SocialMediaDto;
import com.backend.backend.facades.SocialMediaFacade;
import com.backend.backend.services.SocialMediaService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DefaultSocialMediaFacade implements SocialMediaFacade {

     @Resource
     private SocialMediaService socialMediaService;

     @Resource
     private SocialMediaModelToDtoConverter socialMediaModelToDtoConverter;

     @Resource
     private SocialMediaDtoToModelConverter socialMediaDtoToModelConverter;

     @Override
     public List<SocialMediaDto> findAllByUserId(Integer id) {
         return socialMediaService
                 .findAllByUserId(id)
                 .stream()
                 .map(socialMediaModelToDtoConverter::convert)
                 .collect(Collectors.toList());
     }
}
