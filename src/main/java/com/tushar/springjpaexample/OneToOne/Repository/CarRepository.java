package com.tushar.springjpaexample.OneToOne.Repository;

import com.tushar.springjpaexample.OneToOne.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
}
