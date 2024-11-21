package com.backend.backend.converters;

import com.backend.backend.dtos.SocialMediaDto;
import com.backend.backend.models.SocialMediaModel;
import com.backend.backend.models.UserModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SocialMediaDtoToModelConverter implements Converter<SocialMediaDto, SocialMediaModel> {
    @Override
    public SocialMediaModel convert(SocialMediaDto socialMedia) {
        return SocialMediaModel
                .builder()
                .link(socialMedia.getLink())
                .socialMedia(socialMedia.getSocialMedia())
                .user(UserModel.builder().id(socialMedia.getUser_id()).build())
                .build();
    }
}
