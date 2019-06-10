package com.dev.DeclarationOnImpots.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev.DeclarationOnImpots.Entity.DeclarationImpots;

@Repository
public interface DeclarationImpotsRepository extends JpaRepository<DeclarationImpots,Long>{
	
	 @Query("select c from DeclarationImpots c where c.IdDeclarationImpots = ?1")
	 DeclarationImpots findOne(Long IdDeclarationImpots);
	 @Modifying
		@Query("update DeclarationImpots c set c.status = status where c.IdDeclarationImpots = IdDeclarationImpots")
		void changeStatus(Long nif, String status);
	}


