package com.tushar.springjpaexample.OneToManyUnidirectional.repository;

import com.tushar.springjpaexample.OneToManyUnidirectional.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long> {
}
