package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import com.dev.DeclarationOnImpots.Entity.Employee;



public interface IEmployee {
	void add(Employee employee);
	Employee update(Employee employee);
	List<Employee> findAll();
	Employee findOne(Long NumEmployee);
	public boolean supprimer(Long NumEmployee);
}
