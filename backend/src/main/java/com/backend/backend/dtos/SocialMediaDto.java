package com.backend.backend.dtos;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SocialMediaDto {
    String socialMedia;
    String link;
    Integer user_id;
}