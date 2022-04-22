package com.tushar.springjpaexample.OneToOneBidirectional.Repository;


import com.tushar.springjpaexample.OneToOneBidirectional.Models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
