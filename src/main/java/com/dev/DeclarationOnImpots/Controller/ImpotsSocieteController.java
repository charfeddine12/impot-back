package com.dev.DeclarationOnImpots.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.DeclarationOnImpots.Entity.ImpotsSociete;
import com.dev.DeclarationOnImpots.Service.IImpotsSociete;


@RestController
@CrossOrigin
@RequestMapping(value="impotsSocietes",headers = "Accept=application/json")

public class ImpotsSocieteController {
	@Autowired
	private IImpotsSociete impotsSocieteService;

	@GetMapping(value = "/all")
	public @ResponseBody List<ImpotsSociete> getAllImpotsSocietes() {
		return this.impotsSocieteService.findAll();
	}

	@GetMapping(value = "/find/{ImpotsSocieteId}")
	public ImpotsSociete findOne(@PathVariable Long ImpotsSocieteId) {
		return this.impotsSocieteService.findOne(ImpotsSocieteId);
	}
	@PostMapping(value = "/add")
	public void addImpotsSociete(@RequestBody ImpotsSociete l ) {
		
		

		this.impotsSocieteService.add(l);

	}
	
	@PutMapping (value="/update")
	public ImpotsSociete update(@RequestBody ImpotsSociete l) {
		return this.impotsSocieteService.update(l);
	}
	@DeleteMapping (value="/delete/{ImpotsSocieteId}")
	public boolean supmrimer(@PathVariable Long ImpotsSocieteId) {
		impotsSocieteService.supprimer(ImpotsSocieteId);
		return true;
	}
	
	
	
}
