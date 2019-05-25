package com.dev.DeclarationOnImpots.Service.impl;

import java.util.List;

import com.dev.DeclarationOnImpots.Service.IDeclarationImpots;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.DeclarationOnImpots.Entity.DeclarationImpots;
import com.dev.DeclarationOnImpots.Entity.Employee;
import com.dev.DeclarationOnImpots.Repository.DeclarationImpotsRepository;

@Service
public class DeclarationImpotsServiceImp implements IDeclarationImpots {
	@Autowired 
	private DeclarationImpotsRepository decRepository;

	@Override
	public void add(DeclarationImpots dec) {
		this.decRepository.save(dec);
		
	}

	@Override
	public DeclarationImpots update(DeclarationImpots dec) {
	
		return this.decRepository.save(dec);
	}

	@Override
	public List<DeclarationImpots> findAll() {
		
		return (List<DeclarationImpots>) this.decRepository.findAll();
	}

	@Override
	public DeclarationImpots findOne(Long IdDeclarationImpots) {
		
		return this.decRepository.findOne(IdDeclarationImpots);
	}

	@Override
	public boolean supprimer(Long IdDeclarationImpots) {
	  decRepository.deleteById(IdDeclarationImpots);
		return true;
	}
	
}
