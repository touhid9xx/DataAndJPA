package com.tushar.springjpaexample.OneToOneUnidirectional.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;

    public Address() {
    }

    public Address(String street) {
        this.street = street;
    }
}
