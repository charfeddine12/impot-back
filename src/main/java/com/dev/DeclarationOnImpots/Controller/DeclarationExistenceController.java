package com.dev.DeclarationOnImpots.Controller;

import java.util.List;

import com.dev.DeclarationOnImpots.Service.impl.DeclarationExistenceServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev.DeclarationOnImpots.Entity.DeclarationExistence;



@RestController
@CrossOrigin
@RequestMapping(value="declarationExistences",headers = "Accept=application/json")

public class DeclarationExistenceController {
	@Autowired 
	private DeclarationExistenceServiceImp decService;
	
	@GetMapping(value = "/all")
	public @ResponseBody List<DeclarationExistence> getAllDeclarationExistences() {
		return this.decService.findAll();
	}


	@GetMapping(value = "/find/{CodeDE}")
	public DeclarationExistence findOne(@PathVariable Long CodeDE) {
		return this.decService.findOne(CodeDE);
	}
	@PostMapping(value = "/add")
	public void addDeclarationExistence(@RequestBody DeclarationExistence l ) {

		this.decService.add(l);

	}

	@PutMapping (value="/update")
	public DeclarationExistence update(@RequestBody DeclarationExistence l) {
		return this.decService.update(l);
	}
	@DeleteMapping (value="/delete/{CodeDE}")
	public boolean supmrimer(@PathVariable Long CodeDE) {
		decService.supprimer(CodeDE);
		return true;
	}

}
