package com.tushar.springjpaexample.InheriteJoinTable.model;

import com.tushar.springjpaexample.InheriteJoinTable.Enums.InfantryType;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Infantry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private InfantryType infantryType;

    private Integer moveSpeed;
    private Integer durability;
    private Integer attack;

    public Infantry() {
    }

    public Infantry(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer attack) {
        this.infantryType = infantryType;
        this.moveSpeed = moveSpeed;
        this.durability = durability;
        this.attack = attack;
    }
}
