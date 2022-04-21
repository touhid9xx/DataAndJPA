package com.tushar.springjpaexample.OneToManyUnidirectional.repository;

import com.tushar.springjpaexample.OneToManyUnidirectional.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
