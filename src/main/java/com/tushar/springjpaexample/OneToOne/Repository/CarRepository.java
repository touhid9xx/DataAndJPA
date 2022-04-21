package com.tushar.springjpaexample.OneToOne.Repository;

import com.tushar.springjpaexample.OneToOne.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
