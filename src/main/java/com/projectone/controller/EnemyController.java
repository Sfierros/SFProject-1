package com.projectone.controller;

import com.projectone.model.Enemy;
import com.projectone.service.EnemyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class EnemyController {
    EnemyService enemyService;

    @Autowired
    public EnemyController(EnemyService enemyService)
    {
        this.enemyService = enemyService;
    }

    @GetMapping
    public List<Enemy> getAllEnemies()
    {
        return enemyService.getAllEnemies();
    }

    /*
    Azure SQL Command
    SELECT TOP 1 enemy_name from enemy
    ORDER BY NEWID()

    @GetMapping
    public Enemy getRandomEnemy()
    {
        if(enemyService.getAllEnemies() == null)
        {
            return null;
        }
        return enemyService.getRandomEnemy();
    }
     */


    @PostMapping
    public Enemy createEnemy(@RequestBody Enemy enemy)
    {
        return enemyService.saveEnemy(enemy);
    }

    @GetMapping("name/{name}")
    public Enemy findByEnemyName(@PathVariable String name)
    {

        return enemyService.findEnemyByName(name);
    }

    //works
    @DeleteMapping("name/{e}")
    public boolean deleteEnemy(@PathVariable Enemy e)
    {
            enemyService.deleteEnemy(e);
            System.out.println(e.toString() + " was deleted.");
            return true;
    }

}
