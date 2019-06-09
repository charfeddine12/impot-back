package com.dev.DeclarationOnImpots.Service;

import java.util.List;


import com.dev.DeclarationOnImpots.Entity.PersonnePhyz;

public interface IPersonnePhyz {
	void add(PersonnePhyz personnePhyz);
	PersonnePhyz update(PersonnePhyz personnePhyz);
	List<PersonnePhyz> findAll();
	PersonnePhyz findOne(Long Cin);
	public boolean supprimer(Long Cin);
	void changeStatus(long NIF, Boolean status);

}
