package com.tushar.springjpaexample.OneToManyBidirectional.repository;

import com.tushar.springjpaexample.OneToManyBidirectional.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
}
