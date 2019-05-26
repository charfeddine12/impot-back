package com.dev.DeclarationOnImpots.Entity;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


@Entity 
//@Inheritance(strategy=InheritanceType.table_per_class)
public class PersonnePhyz extends Contribuable  {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String Nom;
	String Prenom;
	Date DateNaissance;
	String Profession;
	String EtatCivil;
	int NbrEnfHandicapeEncharge;
	int NbreAutreEnf;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "personnePhyz")
	Set<ImpotsRPP> impotsRPPS = new HashSet<>();


	public Set<ImpotsRPP> getImpotsRPPS() {
		return impotsRPPS;
	}

	public void setImpotsRPPS(Set<ImpotsRPP> impotsRPPS) {
		this.impotsRPPS = impotsRPPS;
	}

	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Date getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}
	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	public String getEtatCivil() {
		return EtatCivil;
	}
	public void setEtatCivil(String etatCivil) {
		EtatCivil = etatCivil;
	}
	public int getNbrEnfHandicapeEncharge() {
		return NbrEnfHandicapeEncharge;
	}
	public void setNbrEnfHandicapeEncharge(int nbrEnfHandicapeEncharge) {
		NbrEnfHandicapeEncharge = nbrEnfHandicapeEncharge;
	}
	public int getNbreAutreEnf() {
		return NbreAutreEnf;
	}
	public void setNbreAutreEnf(int nbreAutreEnf) {
		NbreAutreEnf = nbreAutreEnf;
	}
	
	
	public PersonnePhyz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
