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

import com.dev.DeclarationOnImpots.Entity.Loyer;
import com.dev.DeclarationOnImpots.Service.ILoyer;


@RestController
@CrossOrigin
@RequestMapping(value="loyers",headers = "Accept=application/json")

public class LoyerController {
	@Autowired
	private ILoyer loyerService;

	@GetMapping(value = "/all")
	public @ResponseBody List<Loyer> getAllLoyers() {
		return this.loyerService.findAll();
	}

	@GetMapping(value = "/find/{NumLoyer}")
	public Loyer findOne(@PathVariable Long NumLoyer) {
		return this.loyerService.findOne(NumLoyer);
	}

	@PostMapping(value = "/add")
	public void addLoyer(@RequestBody Loyer l ) {

		this.loyerService.add(l);

	}
	
	@PutMapping (value="/update")
	public Loyer update(@RequestBody Loyer l) {
		return this.loyerService.update(l);
	}

	@DeleteMapping (value="/delete/{NumLoyer}")
	public boolean supmrimer(@PathVariable Long NumLoyer) {
		loyerService.supprimer(NumLoyer);
		return true;
	}
}
