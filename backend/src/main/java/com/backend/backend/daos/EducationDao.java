package com.backend.backend.daos;

import com.backend.backend.models.EducationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationDao extends JpaRepository<EducationModel, Long> {
    List<EducationModel> findAllByUser_Id(Integer id);
}
