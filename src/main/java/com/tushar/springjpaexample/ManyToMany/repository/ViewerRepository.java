package com.tushar.springjpaexample.ManyToMany.repository;

import com.tushar.springjpaexample.ManyToMany.model.Viewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewerRepository extends JpaRepository<Viewer,Long> {
}
