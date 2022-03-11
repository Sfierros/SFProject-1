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
public class Enemy {
    @Id
    private String enemyName;
    @OneToOne
    @JoinColumn(name = "experienceLevel")
    public Experience experienceLevel;
}