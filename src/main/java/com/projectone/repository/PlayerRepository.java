package com.projectone.repository;

import com.projectone.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

    List<Player> getAllPlayers();
}
