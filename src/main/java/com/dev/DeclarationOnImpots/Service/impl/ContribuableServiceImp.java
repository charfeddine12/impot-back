package com.dev.DeclarationOnImpots.Service.impl;

import java.util.List;

import com.dev.DeclarationOnImpots.Service.IContribuable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.dev.DeclarationOnImpots.Entity.Contribuable;
import com.dev.DeclarationOnImpots.Repository.ContribuableRepository;


@Service
public class ContribuableServiceImp implements IContribuable {
	@Autowired
	private ContribuableRepository contribuableRepository;
	@Override
	public void add(Contribuable contribuable) {
		this.contribuableRepository.save(contribuable);
		
	}

	@Override
	public Contribuable update(Contribuable contribuable) {
		return this.contribuableRepository.save(contribuable);
		
	}

	@Override
	public List<Contribuable> findAll() {
		return (List<Contribuable>) this.contribuableRepository.findAll();
	}

	

	@Override
	public void changeStatus(long NIF, String status) {
		this.contribuableRepository.changeStatus(NIF, status);
		
	}

	@Override
	public Contribuable findOne(Long NIF) {
		return this.contribuableRepository.findOne(NIF);
	}
@Override 
	public boolean supprimer(@PathVariable Long NIF) {
		contribuableRepository.deleteById(NIF);
		return true;
	}
}
