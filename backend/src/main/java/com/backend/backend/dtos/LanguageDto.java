package com.backend.backend.dtos;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LanguageDto {
    String language;
    String level;
    Integer user_id;
}