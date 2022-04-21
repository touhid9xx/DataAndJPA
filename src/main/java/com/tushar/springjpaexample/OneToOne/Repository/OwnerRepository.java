package com.tushar.springjpaexample.OneToOne.Repository;


import com.tushar.springjpaexample.OneToOne.Models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
