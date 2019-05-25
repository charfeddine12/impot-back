package com.dev.DeclarationOnImpots.Controller;

import java.util.List;

import com.dev.DeclarationOnImpots.Service.impl.PersonnePhyzServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev.DeclarationOnImpots.Entity.Contribuable;
import com.dev.DeclarationOnImpots.Entity.PersonnePhyz;


@RestController
@CrossOrigin
@RequestMapping(value="personnePhyzs",headers = "Accept=application/json")

public class PersonnePhyzController {
	@Autowired
	private PersonnePhyzServiceImp personnePhyzService;
	
	
	@GetMapping(value = "/all")
	public @ResponseBody List<PersonnePhyz> getAllPersonnePhyzs() {
		return this.personnePhyzService.findAll();
	}

	@GetMapping(value = "/find/{Cin}")
	public PersonnePhyz findOne(@PathVariable Long Cin) {
		return this.personnePhyzService.findOne(Cin);
	}

	@PostMapping(value = "/add")
	public void addPersonnePhyz(@RequestBody PersonnePhyz pp ) {
		
		this.personnePhyzService.add(pp);

	}
	
	@PutMapping (value="/update")
	public PersonnePhyz update(@RequestBody PersonnePhyz pp) {
		return this.personnePhyzService.update(pp);
	}

	@DeleteMapping (value="/personnePhyzs/{Cin}")
	public boolean supprimer(@PathVariable Long Cin) {
		personnePhyzService.supprimer(Cin);
		return true;
	}
}
