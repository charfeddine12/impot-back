package com.dev.DeclarationOnImpots.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.DeclarationOnImpots.Entity.Contribuable;
import org.springframework.stereotype.Repository;

@Repository
public interface ContribuableRepository extends JpaRepository<Contribuable, Long> {
	@Query("select c from Contribuable c where c.username like :x")
	public Page<Contribuable> chercher(@Param("x") String mc, Pageable pageable);

	@Query("select c from Contribuable c where c.nif = ?1")
	Contribuable findOne(Long nif);


     Contribuable findUserWithName(String login);
 
 @Modifying
	@Query("update Contribuable c set c.status = status where c.nif = nif")


	void changeStatus(Long nif, String status);

	public Contribuable findByUsername(String username);
}
