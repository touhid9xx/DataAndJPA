package com.tushar.springjpaexample.mappedSuperClass.model;

import javax.persistence.*;

@Entity
@Table(name = "Tank")
public class Tank extends Vehicle{
   private Integer firePower;

    public Tank() {
    }

    public Tank(String name, Integer seats, Integer firePower) {
        super(name, seats);
        this.firePower = firePower;
    }
}
