package com.projectone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Weapon {

    @Id
    private String weapon_choice;

}