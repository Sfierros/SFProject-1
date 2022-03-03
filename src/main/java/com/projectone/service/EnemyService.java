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
        return enemyRepository.getAllEnemies();
    }

    //TODO later
    public void getRandomEnemy(Enemy e)
    {

    }
    public Enemy createEnemy(Enemy e)
    {
        return null;
    }
}
