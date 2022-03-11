package com.projectone.service;


import com.projectone.model.Player;
import com.projectone.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlayerService {
    PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository)
    {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers()
    {
        return playerRepository.findAll();
    }

    public Player savePlayer(Player player)
    {
        return playerRepository.save(player);
    }

    public Player findPlayerByName(String name)
    {
        return playerRepository.findByName(name);
    }

    public void deletePlayer(Player player)
    {
        playerRepository.delete(player);
    }


    public void updatePlayer(Player player)
    {
        //if player is in DB, update the requested info based on provided
        if(playerRepository.findAll().contains(player))
        {
            player.setPlayerName(player.getPlayerName());
            player.setExperienceLevel(player.getExperienceLevel());
            player.setWeapon(player.getWeapon());
        }
        //player isn't in DB, go ahead and create one with provided info.
        else {
            savePlayer(player);
        }
    }

    public Player getHighestLevelPlayer(){
        return playerRepository.findHighestLevelPlayer();
    }
}
