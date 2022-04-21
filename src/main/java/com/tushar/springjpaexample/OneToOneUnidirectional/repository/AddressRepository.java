package com.tushar.springjpaexample.OneToOneUnidirectional.repository;

import com.tushar.springjpaexample.OneToOneUnidirectional.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
