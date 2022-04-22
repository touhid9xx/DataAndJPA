package com.tushar.springjpaexample.ManyToMany.repository;

import com.tushar.springjpaexample.ManyToMany.model.Stream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRepository extends JpaRepository<Stream,Long> {
}
