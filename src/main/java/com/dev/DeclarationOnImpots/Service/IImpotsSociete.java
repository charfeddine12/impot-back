package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import com.dev.DeclarationOnImpots.Entity.ImpotsSociete;


public interface IImpotsSociete {
	void add(ImpotsSociete impotsSociete);
	ImpotsSociete update(ImpotsSociete impotsSociete);
	List<ImpotsSociete> findAll();
	ImpotsSociete findOne(Long ImpotsSocieteId);
	public boolean supprimer(Long ImpotsSociete);
}
