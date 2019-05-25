package com.dev.DeclarationOnImpots.Service;

import java.util.List;


import com.dev.DeclarationOnImpots.Entity.Loyer;

public interface ILoyer{
	void add(Loyer loyer);
	Loyer update(Loyer loyer);
	List<Loyer> findAll();
	Loyer findOne(Long NumLoyer);
	public boolean supprimer(Long NumLoyer);
	
}
