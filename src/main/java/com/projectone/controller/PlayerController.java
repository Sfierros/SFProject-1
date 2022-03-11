package com.projectone.controller;

import com.projectone.model.Player;
import com.projectone.model.Weapon;
import com.projectone.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService)
    {
        this.playerService = playerService;
    }

    //works
    @GetMapping("getAllPlayers")
    public List<Player> getAllPlayers()
    {
        return playerService.getAllPlayers();
    }

    //works
    @PostMapping("savePlayer")
    public Player createPlayer(@RequestBody Player player){
        return playerService.savePlayer(player);
    }

    //works
    @GetMapping("playerName/{name}")
    public Player findPlayerByName(@PathVariable String name)
    {
        return playerService.findPlayerByName(name);
    }
//
//    @PostMapping("playerName/weaponChoice")
//    public void setPlayerWeapon(@RequestBody Player player, Weapon weapon)
//    {
//        playerService.savePlayerWeapon(player,weapon);
//    }


    //works
    @DeleteMapping("deletePlayer/{player}")
    public boolean deletePlayer(@PathVariable Player player)
    {
        playerService.deletePlayer(player);
        System.out.println(player.toString() + " was deleted.");
        return true;
    }

    //works with experience, need to test with Weapons
    @PutMapping("updatePlayer")
    public void updatePlayer(@RequestBody Player player){
        playerService.updatePlayer(player);
    }
}
