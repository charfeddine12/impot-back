package com.dev.DeclarationOnImpots.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity

//@Inheritance(strategy=InheritanceType.table_per_class)
public class Exercice /*extends DeclarationImpots */implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
	
	private Long CodeEx;
	private Date DateOuverture;
	private Date DateCloture;
	private String CadreLegal;
	@OneToMany
	private Set<DeclarationImpots> declarationImpots = new HashSet<>();

	public Exercice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exercice(Long codeEx, Date dateOuverture, Date dateCloture, String cadreLegal) {
		super();
		CodeEx = codeEx;
		DateOuverture = dateOuverture;
		DateCloture = dateCloture;
		CadreLegal = cadreLegal;
	}

	public Long getCodeEx() {
		return CodeEx;
	}

	public void setCodeEx(Long codeEx) {
		CodeEx = codeEx;
	}

	public Date getDateOuverture() {
		return DateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		DateOuverture = dateOuverture;
	}

	public Date getDateCloture() {
		return DateCloture;
	}

	public void setDateCloture(Date dateCloture) {
		DateCloture = dateCloture;
	}

	public String getCadreLegal() {
		return CadreLegal;
	}

	public void setCadreLegal(String cadreLegal) {
		CadreLegal = cadreLegal;
	}

	public Set<DeclarationImpots> getDeclarationImpots() {
		return declarationImpots;
	}

	public void setDeclarationImpots(Set<DeclarationImpots> declarationImpots) {
		this.declarationImpots = declarationImpots;
	}
}
