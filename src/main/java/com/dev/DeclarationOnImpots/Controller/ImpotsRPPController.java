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

import com.dev.DeclarationOnImpots.Entity.ImpotsRPP;
import com.dev.DeclarationOnImpots.Service.IImpotsRPP;


@RestController
@CrossOrigin
@RequestMapping(value="impotsRPPs",headers = "Accept=application/json")

public class ImpotsRPPController {
	@Autowired
	private IImpotsRPP impotsRPPService;

	@GetMapping(value = "/all")
	public @ResponseBody List<ImpotsRPP> getAllImpotsRPPs() {
		return this.impotsRPPService.findAll();
	}

	@GetMapping(value = "/find/{ImpotsRPPId}")
	public ImpotsRPP findOne(@PathVariable Long ImpotsRPPId) {
		return this.impotsRPPService.findOne(ImpotsRPPId);
	}
	@PostMapping(value = "/add")
	public void addImpotsRPP(@RequestBody ImpotsRPP l ) {
		
		

		this.impotsRPPService.add(l);

	}
	
	@PutMapping (value="/update")
	public ImpotsRPP update(@RequestBody ImpotsRPP l) {
		return this.impotsRPPService.update(l);
	}
	@DeleteMapping (value="/delete/{ImpotsRPPId}")
	public boolean supmrimer(@PathVariable Long ImpotsRPPId) {
		impotsRPPService.supprimer(ImpotsRPPId);
		return true;
	}
	
	
	
}
