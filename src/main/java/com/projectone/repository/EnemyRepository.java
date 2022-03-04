package com.projectone.repository;

import com.projectone.model.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface EnemyRepository extends JpaRepository<Enemy, String> {

    @Query("from Enemy")
    List<Enemy> findALl();

//    @Query("Select TOP 1 enemy_name from Enemy Order BY NEWID()")
//    Enemy getRandomEnemy();

    @Query("from Enemy where enemyName = :name")
    Enemy findByName(String name);

    Enemy save(Enemy e);

    void delete(Enemy e);
}
