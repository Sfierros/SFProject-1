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

    @GetMapping("getAllPlayers")
    public List<Player> getAllPlayers()
    {
        return playerService.getAllPlayers();
    }

    @PostMapping("savePlayer")
    public Player createPlayer(@RequestBody Player player){
        return playerService.savePlayer(player);
    }

    @GetMapping("playerName/{name}")
    public Player findPlayerByName(@PathVariable String name)
    {
        return playerService.findPlayerByName(name);
    }

    @DeleteMapping("playerName/{p}")
    public boolean deletePlayer(@PathVariable Player player)
    {
        playerService.deletePlayer(player);
        System.out.println(player.toString() + " was deleted.");
        return true;
    }
}
