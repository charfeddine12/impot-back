package com.dev.DeclarationOnImpots.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
// @Inheritance(strategy=InheritanceType.table_per_class)
public class DeclarationImpots implements Serializable {
	private static final long serialVersionUID = 1L;

 @Id
 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
 @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")


	private Long IdDeclarationImpots;
	private String TypeDeclarationImpots;
	private String Obligation;
	private Date DateDeclarationImpots;
	@ManyToOne
	private Contribuable contribuable;

 public Boolean status;
public Boolean getStatus() {
	return status;
}
public void setStatus(Boolean status) {
	this.status = status;
}

	@ManyToOne
	private Exercice exercices;

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
			Date dateDeclarationImpots, Boolean status, Contribuable contribuable, Exercice exercices) {

		super();
		IdDeclarationImpots = idDeclarationImpots;
		TypeDeclarationImpots = typeDeclarationImpots;
		Obligation = obligation;
		DateDeclarationImpots = dateDeclarationImpots;
		this.status = status;
		this.contribuable = contribuable;
		this.exercices = exercices;
	}


}