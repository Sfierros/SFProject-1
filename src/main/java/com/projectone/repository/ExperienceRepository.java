package com.projectone.repository;

import com.projectone.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Integer> {

}
