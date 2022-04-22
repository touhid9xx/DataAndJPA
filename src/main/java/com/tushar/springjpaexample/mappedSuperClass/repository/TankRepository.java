package com.tushar.springjpaexample.mappedSuperClass.repository;

import com.tushar.springjpaexample.mappedSuperClass.model.Tank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TankRepository extends VehicleRepository {
}
