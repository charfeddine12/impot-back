package com.dev.DeclarationOnImpots.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.dev.DeclarationOnImpots.Entity.AppRole;
import com.dev.DeclarationOnImpots.Entity.Contribuable;
import com.dev.DeclarationOnImpots.Repository.ContribuableRepository;
import com.dev.DeclarationOnImpots.Repository.RoleRepository;
import com.dev.DeclarationOnImpots.Service.IContribuable;

@Service
public class ContribuableServiceImp implements IContribuable {
	@Autowired
	private ContribuableRepository contribuableRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void add(Contribuable contribuable) {
		String hashPW=bCryptPasswordEncoder.encode(contribuable.getPassword());
		contribuable.setPassword(hashPW);
		this.contribuableRepository.save(contribuable);

	}

	@Override
	public Contribuable update(Contribuable contribuable) {
		String hashPW=bCryptPasswordEncoder.encode(contribuable.getPassword());
		contribuable.setPassword(hashPW);
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

	@Override
	public Contribuable findByLogin(String login) {
		return contribuableRepository.findByUsername(login);
	}

	@Override
	public void addRoleToUser(String login, String roleName) {
		AppRole role=roleRepository.findByName(roleName);
		Contribuable cmpt=contribuableRepository.findByUsername(login);
		cmpt.getRoles().add(role);
	}
}
