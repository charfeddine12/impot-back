package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import com.dev.DeclarationOnImpots.Entity.Administrateur;



public interface IAdministrateur {
	void add(Administrateur admin);
	Administrateur update(Administrateur admin);
	List<Administrateur> findAll();
	Administrateur findOne(Long CodeAdmin);
	public boolean supprimer(Long CodeAdmin);
}
