package com.tushar.springjpaexample.InheriteSingleTable.repository;

import com.tushar.springjpaexample.InheriteSingleTable.model.ArtPiece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ArtPieceRepository extends JpaRepository<ArtPiece,Long> {
}
