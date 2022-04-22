package com.tushar.springjpaexample.InheriteJoinTable.model;

import com.tushar.springjpaexample.InheriteJoinTable.Enums.InfantryType;

import javax.persistence.Entity;

@Entity
public class Knight extends Infantry {
    private Boolean sheild;

    public Knight() {
    }

    public Knight(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer attack, Boolean sheild) {
        super(infantryType, moveSpeed, durability, attack);
        this.sheild = sheild;
    }
}
