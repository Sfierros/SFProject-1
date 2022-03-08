package com.projectone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Weapon")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Weapon {

    @Id
    private String weaponChoice;

    @OneToMany
    @JoinColumn(name = "weaponChoice")
    public List<Player> player;
}