package com.tushar.springjpaexample.InheriteJoinTable.model;

import com.tushar.springjpaexample.InheriteJoinTable.Enums.InfantryType;

import javax.persistence.Entity;

@Entity
public class Archer extends Infantry {
    private Integer range;

    public Archer() {
    }

    public Archer(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer attack, Integer range) {
        super(infantryType, moveSpeed, durability, attack);
        this.range = range;
    }
}
