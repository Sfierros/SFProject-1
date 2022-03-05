package com.projectone.service;


import com.projectone.model.Experience;
import com.projectone.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ExperienceService {
    ExperienceRepository experienceRepository;


    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository)
    {
        this.experienceRepository = experienceRepository;
    }

    public Experience saveExperience(Experience e)
    {
        return experienceRepository.save(e);
    }

}
