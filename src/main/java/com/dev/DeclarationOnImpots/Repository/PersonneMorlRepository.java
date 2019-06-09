package com.dev.DeclarationOnImpots.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.dev.DeclarationOnImpots.Entity.PersonneMorl;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneMorlRepository extends JpaRepository<PersonneMorl,Long>{
	 
	 @Query(" select c from PersonneMorl c " +
	         " where c.RaisonSocial= ?1")


	 PersonneMorl findUserWithName(String RaisonSocial);
	 @Query("select c from PersonneMorl c where c.nif = ?1")
	 PersonneMorl findOne(Long RegistreCommerce);


	
	
}
