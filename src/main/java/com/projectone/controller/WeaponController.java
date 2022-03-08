package com.projectone.controller;

import com.projectone.model.Weapon;
import com.projectone.service.WeaponService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WeaponController {
    WeaponService weaponService;

    public WeaponController(WeaponService weaponService){
        this.weaponService = weaponService;
    }

    @GetMapping("getAllWeapons")
    public List<Weapon> getAllWeapons(){
        return weaponService.getAllWeapons();
    }

    @PostMapping("saveWeapon")
    public Weapon createWeapon(@RequestBody Weapon weapon){
        return weaponService.saveWeapon(weapon);
    }

    @GetMapping("weaponChoice/{w}")
    public Weapon findWeaponByName(@PathVariable String weaponName){
        return weaponService.findWeaponByName(weaponName);
    }

    @DeleteMapping("weaponChoice{w}")
    public boolean deleteWeapon(@PathVariable Weapon weapon){
        weaponService.deleteWeapon(weapon);
        System.out.println(weapon.toString() + " was deleted.");
        return true;
    }

}
