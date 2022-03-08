package com.projectone.service;


import com.projectone.model.Weapon;
import com.projectone.repository.WeaponRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WeaponService {
    WeaponRepository weaponRepository;

    public WeaponService(WeaponRepository weaponRepository){
        this.weaponRepository = weaponRepository;
    }

    public List<Weapon> getAllWeapons(){
        return weaponRepository.findAll();
    }

    public Weapon findWeaponByName(String name){
        return weaponRepository.findByName(name);
    }

    public Weapon saveWeapon(Weapon weapon){
        return weaponRepository.save(weapon);
    }

    public void deleteWeapon(Weapon weapon){
        weaponRepository.delete(weapon);
    }

}
