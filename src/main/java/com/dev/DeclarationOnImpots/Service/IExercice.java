package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import com.dev.DeclarationOnImpots.Entity.Exercice;


public interface IExercice {
	void add(Exercice exercice);
	Exercice update(Exercice exercice);
	List<Exercice> findAll();
	Exercice findOne(Long CodeEx);
	public boolean supprimer(Long CodeEx);
}
