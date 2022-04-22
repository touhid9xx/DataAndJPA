package com.tushar.springjpaexample.mappedSuperClass.repository;

import com.tushar.springjpaexample.mappedSuperClass.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
