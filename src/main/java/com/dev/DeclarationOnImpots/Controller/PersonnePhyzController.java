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

import com.dev.DeclarationOnImpots.Entity.PersonnePhyz;
import com.dev.DeclarationOnImpots.Service.impl.PersonnePhyzServiceImp;


@RestController
@CrossOrigin
@RequestMapping(value="personnePhyzs",headers = "Accept=application/json")

public class PersonnePhyzController {
	@Autowired
	private IPersonnePhyz personnePhyzService;
	
	
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
