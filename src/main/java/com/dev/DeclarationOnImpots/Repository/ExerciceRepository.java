package com.dev.DeclarationOnImpots.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev.DeclarationOnImpots.Entity.Exercice;

@Repository
public interface ExerciceRepository extends JpaRepository<Exercice,Long>{
	
	 @Query("select c from Exercice c where c.CodeEx = ?1")
	 Exercice findOne(Long CodeEx);

}
