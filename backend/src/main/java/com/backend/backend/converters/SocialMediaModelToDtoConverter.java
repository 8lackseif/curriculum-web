package com.backend.backend.converters;

import com.backend.backend.dtos.SocialMediaDto;
import com.backend.backend.models.SocialMediaModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SocialMediaModelToDtoConverter implements Converter<SocialMediaModel, SocialMediaDto> {
    @Override
    public SocialMediaDto convert(SocialMediaModel socialMedia) {
        return SocialMediaDto
                .builder()
                .link(socialMedia.getLink())
                .socialMedia(socialMedia.getSocialMedia())
                .user_id(socialMedia.getUser().getId())
                .build();
    }
}
