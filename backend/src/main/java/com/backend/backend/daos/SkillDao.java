package com.backend.backend.daos;

import com.backend.backend.models.SkillModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillDao extends JpaRepository<SkillModel, Long> {
    List<SkillModel> getSkillModelByUser_Id(Integer id);
}
