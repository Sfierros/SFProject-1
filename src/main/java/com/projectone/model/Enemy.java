package com.projectone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Enemy")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
//@NamedQuery(name= "Enemy.getRandomEnemy",
//        query= "SELECT TOP 1 enemy_name, experience_level" +
//                " FROM Enemy ORDER BY NEWID()")
public class Enemy {
    @Id
    private String enemyName;
    @OneToOne
    @JoinColumn(name = "experienceLevel")
    public Experience experienceLevel;
}