package com.projectone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Enemy")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Enemy {


    @Id
    private String enemyName;
    @Column
    private int experienceLevel;

}