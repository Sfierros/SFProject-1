package com.projectone.repository;

import com.projectone.model.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;



public interface EnemyRepository extends JpaRepository<Enemy, String> {

    @Query("from Enemy")
    List<Enemy> findALl();

    @Query("from Enemy where enemyName = :name")
    Enemy findByName(String name);

    Enemy save(Enemy enemy);

    void delete(Enemy enemy);
}
