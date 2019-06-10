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

import com.dev.DeclarationOnImpots.Entity.Contribuable;
import com.dev.DeclarationOnImpots.Entity.DeclarationImpots;
import com.dev.DeclarationOnImpots.Service.IDeclarationImpots;


@RestController
@CrossOrigin
@RequestMapping(value="declarationImpotss",headers = "Accept=application/json")

public class DeclarationImpotsController {
@Autowired 
private IDeclarationImpots decService;
@GetMapping(value = "/all")
public @ResponseBody List<DeclarationImpots> getAllDeclarationImpotss() {
	return this.decService.findAll();
}


@GetMapping(value = "/find/{IdDeclarationImpots}")
public DeclarationImpots findOne(@PathVariable Long IdDeclarationImpots) {
	return this.decService.findOne(IdDeclarationImpots);
}
@PostMapping(value = "/add")
public void addDeclarationImpots(@RequestBody DeclarationImpots l ) {

	this.decService.add(l);
}
@PutMapping(value = "/updateStatus/{IdDeclarationImpots}/{Status}")
public List<DeclarationImpots> changeStatus(@PathVariable long IdDeclarationImpots, @PathVariable String Status) {
	this.decService.changeStatus(IdDeclarationImpots, Status);
	return this.decService.findAll();
}

@PutMapping (value="/update")
public DeclarationImpots update(@RequestBody DeclarationImpots l) {
	return this.decService.update(l);
}
@DeleteMapping (value="/delete/{IdDeclarationImpots}")
public boolean supmrimer(@PathVariable Long IdDeclarationImpots) {
	decService.supprimer(IdDeclarationImpots);
	return true;
}

}
