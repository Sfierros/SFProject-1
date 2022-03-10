package com.projectone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Player {

    @Id
    private String playerName;
    @OneToOne
    @JoinColumn(name = "experienceLevel")
    private Experience experienceLevel;

    @ManyToOne
    @JoinColumn(name = "weaponChoice")
    private Weapon weapon;
}
