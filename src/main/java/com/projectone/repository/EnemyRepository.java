package com.projectone.repository;

import com.projectone.model.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EnemyRepository extends JpaRepository<Enemy, String> {

    List<Enemy> getAllEnemies();
    void getRandomEnemy(Enemy e);
}
