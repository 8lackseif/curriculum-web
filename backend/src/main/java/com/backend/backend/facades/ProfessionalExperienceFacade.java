package com.backend.backend.facades;

import com.backend.backend.dtos.ProfessionalExperienceDto;

import java.util.List;

public interface ProfessionalExperienceFacade {
    List<ProfessionalExperienceDto> getAllByUserId(Integer id);
}
