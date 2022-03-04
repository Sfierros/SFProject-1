package com.projectone.entityManager;

import com.projectone.model.Enemy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository
public class EnemyEntityManager {

    @Autowired
    private EntityManager entityManager;

    public Enemy findOne(){
        Query q = entityManager.createNamedQuery("SELECT TOP 1 * FROM Enemy ORDER BY NEWID()");

        return (Enemy) q.getSingleResult();
    }

}
