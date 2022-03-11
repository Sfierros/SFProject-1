package com.projectone.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
//fix infinite hibernate loops
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "weaponChoice")
public class Weapon {

    @Id
    private String weaponChoice;

//I didn't seem to need this, I will ask Ted about this. It prints out nicer on Postman without it and my
//relationship isn't tied down by it either.
//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "weaponChoice")
//    public List<Player> player;

}