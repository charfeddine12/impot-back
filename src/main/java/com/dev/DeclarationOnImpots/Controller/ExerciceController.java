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

import com.dev.DeclarationOnImpots.Entity.Exercice;
import com.dev.DeclarationOnImpots.Service.IExercice;



@RestController
@CrossOrigin
@RequestMapping(value="exercices",headers = "Accept=application/json")

public class ExerciceController {
	@Autowired
	private IExercice exerciceService;
	@GetMapping(value = "/all")
	public @ResponseBody List<Exercice> getAllExercices() {
		return this.exerciceService.findAll();
	}
	
	
	@GetMapping(value = "/find/{CodeEx}")
	public Exercice findOne(@PathVariable Long CodeEx) {
		return this.exerciceService.findOne(CodeEx);
	}
	@PostMapping(value = "/add")
	public void addExercice(@RequestBody Exercice l ) {
		
		

		this.exerciceService.add(l);

	}
	
	@PutMapping (value="/update")
	public Exercice update(@RequestBody Exercice l) {
		return this.exerciceService.update(l);
	}
	@DeleteMapping (value="/delete/{CodeEx}")
	public boolean supmrimer(@PathVariable Long CodeEx) {
		exerciceService.supprimer(CodeEx);
		return true;
	}

}
