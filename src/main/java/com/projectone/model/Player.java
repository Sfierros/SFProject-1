package com.projectone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Player {

    @Id
    private String playerName;
    @OneToOne
    @JoinColumn(name = "experienceLevel")
    private Experience experience;

    @ManyToOne
    @JoinColumn(name = "weaponChoice")
    private Weapon Weapon;
}
