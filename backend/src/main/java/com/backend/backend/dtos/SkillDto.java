package com.backend.backend.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SkillDto {
    String skill;
    String level;
    Integer user_id;
}