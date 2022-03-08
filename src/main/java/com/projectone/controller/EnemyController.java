package com.projectone.controller;

import com.projectone.model.Enemy;
import com.projectone.service.EnemyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnemyController {
    EnemyService enemyService;

    @Autowired
    public EnemyController(EnemyService enemyService)
    {
        this.enemyService = enemyService;
    }

    //works
    @GetMapping
    public List<Enemy> getAllEnemies()
    {
        return enemyService.getAllEnemies();
    }

    /*
    Azure SQL Command
    SELECT TOP 1 enemy_name from enemy
    ORDER BY NEWID()

    @GetMapping("random")
    public Enemy getRandomEnemy()
    {
        return enemyService.getRandomEnemy();
    }
    */

    //works
    @PostMapping("saveEnemy")
    public Enemy createEnemy(@RequestBody Enemy enemy)
    {
        return enemyService.saveEnemy(enemy);
    }

    //works! Do not enter enemy name with " "
    @GetMapping("name/{name}")
    public Enemy findByEnemyName(@PathVariable String name)
    {
        return enemyService.findEnemyByName(name);
    }

    //works, returns true if delete is successful
    @DeleteMapping("name/{e}")
    public boolean deleteEnemy(@PathVariable Enemy enemy)
    {
            enemyService.deleteEnemy(enemy);
            System.out.println(enemy.toString() + " was deleted.");
            return true;
    }
}
