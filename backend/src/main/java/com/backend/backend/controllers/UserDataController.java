package com.backend.backend.controllers;


import com.backend.backend.dtos.*;
import com.backend.backend.facades.impl.*;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserDataController {

    @Resource
    private DefaultUserFacade defaultUserFacade;

    @Resource
    private DefaultEducationFacade defaultEducationFacade;

    @Resource
    private DefaultSkillFacade defaultSkillFacade;

    @Resource
    private DefaultLanguageFacade defaultLanguageFacade;

    @Resource
    private DefaultOtherRecognitionFacade defaultOtherRecognitionFacade;

    @Resource
    private DefaultProfessionalExperienceFacade defaultProfessionalExperienceFacade;

    @Resource
    private DefaultProjectFacade defaultProjectFacade;

    @Resource
    private DefaultSocialMediaFacade defaultSocialMediaFacade;

    @PostMapping("/user/get")
    public ResponseEntity<UserDto> getUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(defaultUserFacade.findUserByName(userDto.getName(), userDto.getSurname()));
    }

    @GetMapping("/education/get/{id}")
    public ResponseEntity<List<EducationDto>> getEducation(@PathVariable Integer id) {
        return ResponseEntity.ok(defaultEducationFacade.getAllByUserId(id));
    }

    @GetMapping("/language/get/{id}")
    public ResponseEntity<List<LanguageDto>> getLanguage(@PathVariable Integer id) {
        return ResponseEntity.ok(defaultLanguageFacade.getAllByUserId(id));
    }

    @GetMapping("/recognition/get/{id}")
    public ResponseEntity<List<OtherRecognitionDto>> getRecognition(@PathVariable Integer id) {
        return ResponseEntity.ok(defaultOtherRecognitionFacade.getAllByUserId(id));
    }

    @GetMapping("/professional_experience/get/{id}")
    public ResponseEntity<List<ProfessionalExperienceDto>> getProfessionalExperience(@PathVariable Integer id) {
        return ResponseEntity.ok(defaultProfessionalExperienceFacade.getAllByUserId(id));
    }

    @GetMapping("/project/get/{id}")
    public ResponseEntity<List<ProjectDto>> getProject(@PathVariable Integer id) {
        return ResponseEntity.ok(defaultProjectFacade.getAllByUserId(id));
    }

    @GetMapping("/skill/get/{id}")
    public ResponseEntity<List<SkillDto>> getSkill(@PathVariable Integer id) {
        return ResponseEntity.ok(defaultSkillFacade.getAllByUserId(id));
    }

    @GetMapping("/social_media/get/{id}")
    public ResponseEntity<List<SocialMediaDto>> getSocialMedia(@PathVariable Integer id) {
        return ResponseEntity.ok(defaultSocialMediaFacade.findAllByUserId(id));
    }

}
