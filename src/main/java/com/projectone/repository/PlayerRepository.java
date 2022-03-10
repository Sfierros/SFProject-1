package com.projectone.repository;

import com.projectone.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, String> {

    @Query("From Player")
    List<Player> findAll();

    @Query("from Player where playerName = :name")
    Player findByName(String name);

    Player save(Player player);

    void delete(Player player);
    /*
    tentative: player level up query
     */
}
