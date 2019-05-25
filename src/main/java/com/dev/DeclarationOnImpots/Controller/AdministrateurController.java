package com.dev.DeclarationOnImpots.Controller;

import java.util.List;

import com.dev.DeclarationOnImpots.Service.IAdministrateur;
import com.dev.DeclarationOnImpots.Service.impl.AdministrateurServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev.DeclarationOnImpots.Entity.Administrateur;


@RestController
@CrossOrigin
@RequestMapping(value="administrateurs",headers = "Accept=application/json")
public class AdministrateurController {
@Autowired 
private IAdministrateur adminService;

@GetMapping(value = "/all")
public @ResponseBody List<Administrateur> getAllAdministrateurs() {
	return this.adminService.findAll();
}
@GetMapping(value = "/find/{CodeAdmin}")
public Administrateur findOne(@PathVariable Long CodeAdmin) {
	return this.adminService.findOne(CodeAdmin);
}
	@PostMapping(value = "/add")
	public void addAdministrateur(@RequestBody Administrateur l ) {
	this.adminService.add(l);
}

	@PutMapping(value = "/update")
	public Administrateur update(@RequestBody Administrateur l) {

	return this.adminService.update(l);
}

@DeleteMapping(value="/delete/{CodeAdmin}")
public boolean supmrimer(@PathVariable Long CodeAdmin) {
	adminService.supprimer(CodeAdmin);
	return true;
}



}
