package com.backend.backend.controllers;


import com.backend.backend.dtos.*;
import com.backend.backend.facades.impl.*;
import jakarta.annotation.Resource;
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
    @ResponseBody
    public UserDto getUser(@RequestBody UserDto userDto) {
        return defaultUserFacade.findUserByName(userDto.getName(), userDto.getSurname());
    }

    @GetMapping("/education/get/{id}")
    public List<EducationDto> getEducation(@PathVariable Integer id) {
        return defaultEducationFacade.getAllByUserId(id);
    }

    @GetMapping("/language/get/{id}")
    public List<LanguageDto> getLanguage(@PathVariable Integer id) {
        return defaultLanguageFacade.getAllByUserId(id);
    }

    @GetMapping("/recognition/get/{id}")
    public List<OtherRecognitionDto> getRecognition(@PathVariable Integer id) {
        return defaultOtherRecognitionFacade.getAllByUserId(id);
    }

    @GetMapping("/professional_experience/get/{id}")
    public List<ProfessionalExperienceDto> getProfessionalExperience(@PathVariable Integer id) {
        return defaultProfessionalExperienceFacade.getAllByUserId(id);
    }

    @GetMapping("/project/get/{id}")
    public List<ProjectDto> getProject(@PathVariable Integer id) {
        return defaultProjectFacade.getAllByUserId(id);
    }

    @GetMapping("/skill/get/{id}")
    public List<SkillDto> getSkill(@PathVariable Integer id) {
        return defaultSkillFacade.getAllByUserId(id);
    }

    @GetMapping("/social_media/get/{id}")
    public List<SocialMediaDto> getSocialMedia(@PathVariable Integer id) {
        return defaultSocialMediaFacade.findAllByUserId(id);
    }

}
