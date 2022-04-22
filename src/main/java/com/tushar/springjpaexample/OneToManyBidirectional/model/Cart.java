package com.tushar.springjpaexample.OneToManyBidirectional.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cart")
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @OneToMany(
            mappedBy = "cart",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Item> items = new ArrayList<>();

    public Cart() {
    }

    public Cart(String name) {
        this.name = name;

    }
}
