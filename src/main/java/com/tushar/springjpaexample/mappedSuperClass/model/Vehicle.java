package com.tushar.springjpaexample.mappedSuperClass.model;
// This is the superclass

import javax.persistence.*;

@MappedSuperclass
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer seats;

    public Vehicle() { // hibernate required default constructor for delete
    }

    public Vehicle(String name, Integer seats) {
        this.name = name;
        this.seats = seats;
    }
}
