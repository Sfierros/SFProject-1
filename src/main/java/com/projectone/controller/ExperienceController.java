package com.projectone.controller;

import com.projectone.model.Experience;
import com.projectone.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ExperienceController {

    ExperienceService experienceService;

    @Autowired
    public ExperienceController(ExperienceService experienceService)
    {
        this.experienceService = experienceService;
    }

    @PostMapping("saveLevel")
    public Experience createLevels(@RequestBody Experience experience){
        return experienceService.saveExperience(experience);
    }
}
