package com.backend.backend.daos;

import com.backend.backend.models.LanguageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageDao extends JpaRepository<LanguageModel, Long> {
    List<LanguageModel> getLanguageModelByUser_Id(Integer id);
}
