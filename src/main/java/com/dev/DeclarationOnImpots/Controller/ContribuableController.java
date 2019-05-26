package com.dev.DeclarationOnImpots.Controller;

import java.util.List;

import com.dev.DeclarationOnImpots.Service.IContribuable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev.DeclarationOnImpots.Entity.Contribuable;
import com.dev.DeclarationOnImpots.Service.impl.ContribuableServiceImp;





@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="contribuables",headers = "Accept=application/json")
public class ContribuableController {

	@Autowired
	private IContribuable contribuableService;

	@GetMapping(value = "/all")
	public @ResponseBody List<Contribuable> getAllContribuables() {
		return this.contribuableService.findAll();
	}

	@PutMapping(value = "/updateStatus/{NIF}/{Status}")
	public List<Contribuable> changeStatus(@PathVariable long NIF, @PathVariable String Status) {
		this.contribuableService.changeStatus(NIF, Status);
		return this.contribuableService.findAll();
	}

	@PutMapping (value="/update")
	public Contribuable update(@RequestBody Contribuable c) {
		System.out.println("update" +  c);
		return this.contribuableService.update(c);
	}

	@PostMapping(value = "/add")
	public void addContribuable(@RequestBody Contribuable c ) {
		
		

		this.contribuableService.add(c);

	}
	@DeleteMapping (value="/delete")
	public boolean supprimer(@PathVariable Long NIF) {
		contribuableService.supprimer(NIF);
		return true;
	}
	@GetMapping(value = "/find/{NIF}")
	public Contribuable findOne(@PathVariable Long NIF) {
		return this.contribuableService.findOne(NIF);
	}
}
