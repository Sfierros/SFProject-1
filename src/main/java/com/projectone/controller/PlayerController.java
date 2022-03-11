package com.projectone.controller;

import com.projectone.model.Player;
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


    //works
    @DeleteMapping("deletePlayer/{player}")
    public boolean deletePlayer(@PathVariable Player player)
    {
        playerService.deletePlayer(player);
        System.out.println(player.toString() + " was deleted.");
        return true;
    }

    //works!!
    @PutMapping("updatePlayer")
    public void updatePlayer(@RequestBody Player player){
        playerService.updatePlayer(player);
    }

    @GetMapping("highestLevelPlayer")
    public Player getHighestLevelPlayer()
    {
        return playerService.getHighestLevelPlayer();
    }
}
