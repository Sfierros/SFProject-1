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

    //works
    @GetMapping("getAllWeapons")
    public List<Weapon> getAllWeapons(){
        return weaponService.getAllWeapons();
    }

    //works
    @PostMapping("saveWeapon")
    public Weapon createWeapon(@RequestBody Weapon weapon){
        return weaponService.saveWeapon(weapon);
    }

    //works
    @GetMapping("weaponChoice/{weaponChoice}")
    public Weapon findWeaponByName(@PathVariable String weaponChoice){
        return weaponService.findWeaponByName(weaponChoice);
    }

    //works, returns true if delete is successful
    @DeleteMapping("deleteWeapon/{weapon}")
    public boolean deleteWeapon(@PathVariable Weapon weapon){
        weaponService.deleteWeapon(weapon);
        return true;
    }

}
