package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import com.dev.DeclarationOnImpots.Entity.PersonneMorl;


public interface IPersonneMorl {
	void add(PersonneMorl personneMorl);
	PersonneMorl update(PersonneMorl personneMorl);
	List<PersonneMorl> findAll();
	PersonneMorl findOne(Long RegistreCommerce);
	public boolean supprimer(Long RegistreCommerce);
	void changeStatus(long NIF, Boolean status);

}
