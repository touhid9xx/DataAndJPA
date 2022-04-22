package com.tushar.springjpaexample.InheriteTablePerClass.repository;

import com.tushar.springjpaexample.InheriteTablePerClass.model.Spell;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository @Primary
public interface SpellRepository extends JpaRepository<Spell,Long> {
}
