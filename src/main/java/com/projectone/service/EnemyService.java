package com.projectone.service;

import com.projectone.model.*;
import com.projectone.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EnemyService{
    EnemyRepository enemyRepository;

    @Autowired
    public EnemyService(EnemyRepository enemyRepository)
    {
        this.enemyRepository = enemyRepository;
    }

    public List<Enemy> getAllEnemies() {
        return enemyRepository.findALl();
    }

//    public Enemy getRandomEnemy()
//    {
//        return enemyRepository.getRandomEnemy();
//    }
    public Enemy saveEnemy(Enemy e)
    {
        return enemyRepository.save(e);
    }

    public Enemy findEnemyByName(String name)
    {
        return enemyRepository.findByName(name);
    }

    public void deleteEnemy(Enemy e)
    {
        enemyRepository.delete(e);
    }
}
