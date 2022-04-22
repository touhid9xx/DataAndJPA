package com.tushar.springjpaexample.InheriteJoinTable.repository;

import com.tushar.springjpaexample.InheriteJoinTable.model.Infantry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface InfantryRepository extends JpaRepository<Infantry,Long> {
}
