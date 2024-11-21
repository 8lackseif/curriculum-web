package com.backend.backend.daos;

import com.backend.backend.models.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectDao extends JpaRepository<ProjectModel, Long> {
    List<ProjectModel> getProjectModelByUser_Id(Integer id);
}
