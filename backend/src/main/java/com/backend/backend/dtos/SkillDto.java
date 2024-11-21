package com.backend.backend.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SkillModelDto {
    String skill;
    String level;
}