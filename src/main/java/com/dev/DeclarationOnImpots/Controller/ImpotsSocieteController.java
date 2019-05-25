package com.dev.DeclarationOnImpots.Controller;

import java.util.List;

import com.dev.DeclarationOnImpots.Service.impl.ImpotsSocieteServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev.DeclarationOnImpots.Entity.ImpotsSociete;


@RestController
@CrossOrigin
@RequestMapping(value="impotsSocietes",headers = "Accept=application/json")

public class ImpotsSocieteController {
	@Autowired
	private ImpotsSocieteServiceImp impotsSocieteService;

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
