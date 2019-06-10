package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import com.dev.DeclarationOnImpots.Entity.DeclarationImpots;

public interface IDeclarationImpots {
	void add(DeclarationImpots dec);
	DeclarationImpots update(DeclarationImpots dec);
	List<DeclarationImpots> findAll();
	DeclarationImpots findOne(Long IdDeclarationImpots);
	public boolean supprimer(Long IdDeclarationImpots);
}
