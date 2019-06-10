package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import com.dev.DeclarationOnImpots.Entity.Contribuable;

public interface IContribuable {
	void add(Contribuable contribuable);

	Contribuable update(Contribuable contribuable);

	List<Contribuable> findAll();

	Contribuable findOne(Long NIF);

	public boolean supprimer(Long NIF);

	void changeStatus(long NIF, String status);

	Contribuable findByLogin(String string);

	void addRoleToUser(String login, String role);
}
