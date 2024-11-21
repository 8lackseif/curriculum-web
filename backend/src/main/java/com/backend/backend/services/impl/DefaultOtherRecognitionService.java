package com.backend.backend.services.impl;

import com.backend.backend.daos.OtherRecognitionDao;
import com.backend.backend.models.OtherRecognitionModel;
import com.backend.backend.services.OtherRecognitionService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultOtherRecognitionService implements OtherRecognitionService {

    @Resource
    private OtherRecognitionDao otherRecognitionDao;

    @Override
    public List<OtherRecognitionModel> findAllByUserId(Integer id) {
        return otherRecognitionDao.getOtherRecognitionModelByUser_Id(id);
    }
}
