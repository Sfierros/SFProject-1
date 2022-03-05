package com.projectone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Experience")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Experience {

    @Id
    private int experienceLevel;

}