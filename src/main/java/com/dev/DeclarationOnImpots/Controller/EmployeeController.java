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

import com.dev.DeclarationOnImpots.Entity.Employee;
import com.dev.DeclarationOnImpots.Service.IEmployee;


@RestController
@CrossOrigin
@RequestMapping(value="employees",headers = "Accept=application/json")

public class EmployeeController {
 @Autowired
 private IEmployee employeeService;
 
 @GetMapping(value = "/all")
	public @ResponseBody List<Employee> getAllEmployees() {
		return this.employeeService.findAll();
	}
	@GetMapping(value = "/find/{NumEmployee}")
	public Employee findOne(@PathVariable Long NumEmployee) {
		return this.employeeService.findOne(NumEmployee);
	}
	@PostMapping(value = "/add")
	public void addEmployee(@RequestBody Employee l ) {
		this.employeeService.add(l);
	}
	
	@PutMapping (value="/update")
	public Employee update(@RequestBody Employee l) {
		return this.employeeService.update(l);
	}
	@DeleteMapping (value="/delete/{NumEmployee}")
	public boolean supmrimer(@PathVariable Long NumEmployee) {
		employeeService.supprimer(NumEmployee);
		return true;
	}

}
