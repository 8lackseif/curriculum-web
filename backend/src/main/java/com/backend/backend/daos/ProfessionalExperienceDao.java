package com.backend.backend.daos;

import com.backend.backend.models.ProfessionalExperienceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessionalExperienceDao extends JpaRepository<ProfessionalExperienceModel, Long> {
    List<ProfessionalExperienceModel> getProfessionalExperienceModelByUser_Id(Integer id);
}
