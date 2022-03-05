package com.projectone.repository;

import com.projectone.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience, Integer> {
    Experience save(Experience e);
}
