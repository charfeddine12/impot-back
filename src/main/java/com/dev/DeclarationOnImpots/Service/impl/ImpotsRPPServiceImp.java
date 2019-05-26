package com.dev.DeclarationOnImpots.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.DeclarationOnImpots.Entity.ImpotsRPP;
import com.dev.DeclarationOnImpots.Repository.ImpotsRPPRepository;
import com.dev.DeclarationOnImpots.Service.IImpotsRPP;
@Service
public class ImpotsRPPServiceImp implements IImpotsRPP {
@Autowired 
private ImpotsRPPRepository impotsRPPRepository;
	@Override
	public void add(ImpotsRPP impotsRPP) {
		this.impotsRPPRepository.save(impotsRPP);
		
	}

	@Override
	public ImpotsRPP update(ImpotsRPP impotsRPP) {
		
		return this.impotsRPPRepository.save(impotsRPP);
	}

	@Override
	public List<ImpotsRPP> findAll() {
		
		return (List<ImpotsRPP>) this.impotsRPPRepository.findAll();
	}

	@Override
	public ImpotsRPP findOne(Long ImpotsRPPId) {
	
		return this.impotsRPPRepository.findOne(ImpotsRPPId);
	}

	@Override
	public boolean supprimer(Long ImpotsRPP) {
		impotsRPPRepository.deleteById(ImpotsRPP);
		return true;
	}
}
