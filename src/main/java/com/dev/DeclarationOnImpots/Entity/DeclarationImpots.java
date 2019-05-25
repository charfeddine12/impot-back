package com.dev.DeclarationOnImpots.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
//@Inheritance(strategy=InheritanceType.table_per_class)
public class DeclarationImpots implements Serializable {
 @Id Long IdDeclarationImpots ; 
 String TypeDeclarationImpots;
 String Obligation;
 Date DateDeclarationImpots;
@ManyToOne
Contribuable contribuable;
	@ManyToOne
	Exercice exercices ;

public String getTypeDeclarationImpots() {
	return this.TypeDeclarationImpots;
}
public Long getIdDeclarationImpots() {
	return this.IdDeclarationImpots;
}
public void setIdDeclarationImpots(Long idDeclarationImpots) {
	IdDeclarationImpots = idDeclarationImpots;
}
public void setTypeDeclarationImpots(String typeDeclarationImpots) {
	TypeDeclarationImpots = typeDeclarationImpots;
}
public String getObligation() {
	return this.Obligation;
}
public void setObligation(String obligation) {
	Obligation = obligation;
}
public Date getDateDeclarationImpots() {
	return this.DateDeclarationImpots;
}
public void setDateDeclarationImpots(Date dateDeclarationImpots) {
	DateDeclarationImpots = dateDeclarationImpots;
}

	public Contribuable getContribuable() {
		return contribuable;
	}

	public void setContribuable(Contribuable contribuable) {
		this.contribuable = contribuable;
	}

	public Exercice getExercices() {
		return exercices;
	}

	public void setExercices(Exercice exercices) {
		this.exercices = exercices;
	}

	public DeclarationImpots() {
	super();
	// TODO Auto-generated constructor stub
}
public DeclarationImpots(Long idDeclarationImpots, String typeDeclarationImpots, String obligation,
		Date dateDeclarationImpots) {
	super();
	IdDeclarationImpots = idDeclarationImpots;
	TypeDeclarationImpots = typeDeclarationImpots;
	Obligation = obligation;
	DateDeclarationImpots = dateDeclarationImpots;
}

 
}