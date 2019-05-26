package com.dev.DeclarationOnImpots.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev.DeclarationOnImpots.Entity.PersonneMorl;

@Repository
public interface PersonneMorlRepository extends JpaRepository<PersonneMorl,Long>{
	 
	 @Query(" select c from PersonneMorl c " +
	         " where c.RaisonSocial= ?1")


	 PersonneMorl findUserWithName(String RaisonSocial);
	 @Query("select c from PersonneMorl c where c.nif = ?1")
	 PersonneMorl findOne(Long RegistreCommerce);


	
	
}
