package com.projectone.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
//fix infinite hibernate loop
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "playerName")
public class Player {

    @Id
    private String playerName;
    @OneToOne
    @JoinColumn(name = "experienceLevel")
    private Experience experienceLevel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "weaponChoice")
    private Weapon weapon;
}
