package com.tushar.springjpaexample.OneToManyUnidirectional.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String indexNumber;

    public Student() {
    }

    public Student(String indexNumber) {
        this.indexNumber = indexNumber;
    }
}
