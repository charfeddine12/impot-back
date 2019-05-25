package com.dev.DeclarationOnImpots.Controller;

import java.util.List;

import com.dev.DeclarationOnImpots.Service.impl.PersonneMorlServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev.DeclarationOnImpots.Entity.PersonneMorl;

@RestController
@CrossOrigin
@RequestMapping(value="personneMorls",headers = "Accept=application/json")

public class PersonneMorlController {
	
	@Autowired
	private PersonneMorlServiceImp personneMorlService;
	
	
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

}
