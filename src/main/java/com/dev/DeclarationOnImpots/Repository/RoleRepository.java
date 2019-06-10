package com.dev.DeclarationOnImpots.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.DeclarationOnImpots.Entity.AppRole;

public interface RoleRepository extends JpaRepository<AppRole, Long>{
	
	public AppRole findByName(String name);

}
