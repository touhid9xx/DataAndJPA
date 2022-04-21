package com.tushar.springjpaexample.OneToOneUnidirectional.repository;

import com.tushar.springjpaexample.OneToOneUnidirectional.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
