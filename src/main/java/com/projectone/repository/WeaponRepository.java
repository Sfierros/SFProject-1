package com.projectone.repository;

import com.projectone.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WeaponRepository extends JpaRepository<Weapon, String> {

    @Query("From Player")
    List<Weapon> findAll();

    @Query("From Weapon where weaponChoice = :name")
    Weapon findByName(String name);

    Weapon save(Weapon weapon);

    void delete(Weapon weapon);
}
