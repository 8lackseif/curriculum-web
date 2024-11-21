package com.backend.backend.daos;

import com.backend.backend.models.SocialMediaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SocialMediaDao extends JpaRepository<SocialMediaModel, Long> {
    List<SocialMediaModel> getSocialMediaModelByUser_Id(Integer id);
}
