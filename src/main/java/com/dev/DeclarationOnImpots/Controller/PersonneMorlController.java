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

import com.dev.DeclarationOnImpots.Entity.PersonneMorl;
import com.dev.DeclarationOnImpots.Service.IPersonneMorl;

@RestController
@CrossOrigin
@RequestMapping(value="personneMorls",headers = "Accept=application/json")

public class PersonneMorlController {
	
	@Autowired
	private IPersonneMorl personneMorlService;
	
	
	@GetMapping(value = "/all")
	public @ResponseBody List<PersonneMorl> getAllPersonneMorls() {
		return this.personneMorlService.findAll();
	}

	@GetMapping(value = "/find/{RegistreCommerce}")
	public PersonneMorl findOne(@PathVariable Long RegistreCommerce) {
		return this.personneMorlService.findOne(RegistreCommerce);
	}

	@PostMapping(value = "/add")
	public void addPersonneMorl(@RequestBody PersonneMorl pm ) {
		this.personneMorlService.add(pm);
	}
	
	@PutMapping (value="/update")
	public PersonneMorl update(@RequestBody PersonneMorl pm) {
		return this.personneMorlService.update(pm);
	}

	@DeleteMapping (value="/delete/{RegistreCommerce}")
	public boolean supmrimer(@PathVariable Long RegistreCommerce) {
		personneMorlService.supprimer(RegistreCommerce);
		return true;
	}
	@PutMapping(value = "/updateStatus/{NIF}/{Status}")
	public List<PersonneMorl> changeStatus(@PathVariable long NIF, @PathVariable Boolean Status) {
		this.personneMorlService.changeStatus(NIF, Status);
		return this.personneMorlService.findAll();
	}
}
