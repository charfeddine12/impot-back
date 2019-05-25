package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import com.dev.DeclarationOnImpots.Entity.ImpotsRPP;



public interface IImpotsRPP {
	void add(ImpotsRPP impotsRPP);
	ImpotsRPP update(ImpotsRPP impotsRPP);
	List<ImpotsRPP> findAll();
	ImpotsRPP findOne(Long ImpotsRPPId);
	public boolean supprimer(Long ImpotsRPP);
}
