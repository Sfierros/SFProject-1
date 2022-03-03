package com.projectone.service;

import com.projectone.model.*;
import com.projectone.repository.*;
import com.projectone.util.SpringUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;

@Service
public class ExperienceService {
    ExperienceRepository experienceRepository;

    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository){
        this.experienceRepository = experienceRepository;
    }

    public boolean levelUp(String name) throws EntityNotFoundException{
        if(name.length() <= 0 )
        {
            return false;
        }
        setNextExperienceLevel(name);
        return true;
    }

    private void setNextExperienceLevel(String player){
        Session session = SpringUtil.getSession();
        String hql = "Update player set experience_level = experience_level + 1 where player_name = ?";
        Query query = session.createQuery(hql);

    }
}
