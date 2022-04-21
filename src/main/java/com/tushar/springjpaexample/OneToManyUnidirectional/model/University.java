package com.tushar.springjpaexample.OneToManyUnidirectional.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "University")
@Data
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "student_id")
    private List<Student> students = new ArrayList<>();

    public University() {
    }

    public University(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }
}
