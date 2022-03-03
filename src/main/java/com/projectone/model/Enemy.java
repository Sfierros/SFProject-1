package com.projectone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Enemy {

    @Column
    private String enemy_name;
    @Column
    private int experience_level;

}