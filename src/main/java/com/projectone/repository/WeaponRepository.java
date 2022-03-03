package com.projectone.repository;

import com.projectone.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, String> {

    List<Weapon> getAllWeapons();
}
