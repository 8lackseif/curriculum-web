package com.backend.backend.facades;

import com.backend.backend.dtos.OtherRecognitionDto;

import java.util.List;

public interface OtherRecognitionFacade {
    List<OtherRecognitionDto> getAllByUserId(Integer id);
}
