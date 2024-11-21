package com.backend.backend.daos;

import com.backend.backend.models.OtherRecognitionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OtherRecognitionDao extends JpaRepository<OtherRecognitionModel, Long> {
    List<OtherRecognitionModel> getOtherRecognitionModelByUser_Id(Integer id);
}
