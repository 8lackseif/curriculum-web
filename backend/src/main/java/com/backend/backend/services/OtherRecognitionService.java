package com.backend.backend.services;

import com.backend.backend.models.OtherRecognitionModel;

import java.util.List;

public interface OtherRecognitionService {
    List<OtherRecognitionModel> findAllByUserId(Integer id);
}
