package com.dev.DeclarationOnImpots.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
// @Inheritance(strategy=InheritanceType.table_per_class)
public class Loyer implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")

	private Long NumLoyer;
	private String Adresse;
	private Date DateDebutContrat;
	private Date DateFinContrat;
	private Double PrixBrut;
	@OneToOne
	private ImpotsSociete impotsSociete;

	public ImpotsSociete getImpotsSociete() {
		return impotsSociete;
	}

	public void setImpotsSociete(ImpotsSociete impotsSociete) {
		this.impotsSociete = impotsSociete;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public Date getDateDebutContrat() {
		return DateDebutContrat;
	}

	public void setDateDebutContrat(Date dateDebutContrat) {
		DateDebutContrat = dateDebutContrat;
	}

	public Date getDateFinContrat() {
		return DateFinContrat;
	}

	public void setDateFinContrat(Date dateFinContrat) {
		DateFinContrat = dateFinContrat;
	}

	public Double getPrixBrut() {
		return PrixBrut;
	}

	public void setPrixBrut(Double prixBrut) {
		PrixBrut = prixBrut;
	}

	public Long getNumLoyer() {
		return NumLoyer;
	}

	public void setNumLoyer(Long numLoyer) {
		NumLoyer = numLoyer;
	}

	public Loyer(Long numLoyer, String adresse, Date dateDebutContrat, Date dateFinContrat, Double prixBrut) {

		super();
		Adresse = adresse;
		DateDebutContrat = dateDebutContrat;
		DateFinContrat = dateFinContrat;
		PrixBrut = prixBrut;
		this.impotsSociete = impotsSociete;
	}

	public Loyer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
