package com.dev.DeclarationOnImpots;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.dev.DeclarationOnImpots.Entity.AppRole;
import com.dev.DeclarationOnImpots.Entity.Contribuable;
import com.dev.DeclarationOnImpots.Repository.RoleRepository;
import com.dev.DeclarationOnImpots.Service.IContribuable;

@SpringBootApplication
@EnableJpaRepositories("com.dev.DeclarationOnImpots.Repository")
public class DeclarationOnImpotsApplication implements CommandLineRunner{
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private IContribuable service;

	public static void main(String[] args) {
		SpringApplication.run(DeclarationOnImpotsApplication.class, args);
	}
	
	
	@Override
	public void run(String ...args)throws Exception{
		AppRole role1=new AppRole();
		role1.setName("RESPONSABLE");
		AppRole role1cmp = roleRepository.findByName("ADMIN");
		if(role1cmp==null) {
			roleRepository.save(role1);
			System.out.println("Création du role responsable");
		}
		Contribuable contribuable=new Contribuable();
		contribuable.setUsername("admin");
		contribuable.setPassword("admin");
		Contribuable cmpContribuable=service.findByLogin("admin");
		if(cmpContribuable==null) {
			service.add(contribuable);
			service.addRoleToUser(contribuable.getUsername(), "ADMIN");
			System.out.println("Création du responsable admin");
			}
		}
	
	@Bean //will be executed when the application is running
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}

}
