package com.tushar.springjpaexample.OneToManyBidirectional.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name= "Item")
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String serialNumber;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public Item() {
    }

    public Item(String serialNumber, Cart cart) {
        this.serialNumber = serialNumber;
        this.cart = cart;
    }
}
