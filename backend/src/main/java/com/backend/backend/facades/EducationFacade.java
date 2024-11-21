package com.backend.backend.facades;

import com.backend.backend.dtos.EducationDto;

import java.util.List;

public interface EducationFacade {
    List<EducationDto> getAllByUserId(Integer id);
}
