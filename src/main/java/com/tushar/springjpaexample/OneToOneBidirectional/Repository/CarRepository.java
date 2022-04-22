package com.tushar.springjpaexample.OneToOneBidirectional.Repository;

import com.tushar.springjpaexample.OneToOneBidirectional.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
}
