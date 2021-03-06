package com.dev.DeclarationOnImpots.Entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
//@Inheritance(strategy=InheritanceType.table_per_class)
public class ImpotsRPP /*extends DeclarationImpots */implements Serializable {
private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")

	private Long ImpotsRPPId;
	private Double BeneficeCommerciauxIndustriels;
	private Double BeneficeProfessionNonCommercial;
	private Double BeneficeActiviteAgricole;
	private Double RevenuImmobiliers;
	private Double AutreFraisHonoraires;


	@ManyToOne
	private PersonnePhyz personnePhyz;

	public PersonnePhyz getPersonnePhyz() {
		return personnePhyz;
	}

	public void setPersonnePhyz(PersonnePhyz personnePhyz) {
		this.personnePhyz = personnePhyz;
	}

	public Long getImpotsRPPId() {
		return ImpotsRPPId;
	}

	public void setImpotsRPPId(Long impotsRPPId) {
		ImpotsRPPId = impotsRPPId;
	}

	public Double getBeneficeCommerciauxIndustriels() {
		return BeneficeCommerciauxIndustriels;
	}

	public void setBeneficeCommerciauxIndustriels(Double beneficeCommerciauxIndustriels) {
		BeneficeCommerciauxIndustriels = beneficeCommerciauxIndustriels;
	}

	public Double getBeneficeProfessionNonCommercial() {
		return BeneficeProfessionNonCommercial;
	}

	public void setBeneficeProfessionNonCommercial(Double beneficeProfessionNonCommercial) {
		BeneficeProfessionNonCommercial = beneficeProfessionNonCommercial;
	}

	public Double getBeneficeActiviteAgricole() {
		return BeneficeActiviteAgricole;
	}

	public void setBeneficeActiviteAgricole(Double beneficeActiviteAgricole) {
		BeneficeActiviteAgricole = beneficeActiviteAgricole;
	}

	public Double getRevenuImmobiliers() {
		return RevenuImmobiliers;
	}

	public void setRevenuImmobiliers(Double revenuImmobiliers) {
		RevenuImmobiliers = revenuImmobiliers;
	}

	public Double getAutreFraisHonoraires() {
		return AutreFraisHonoraires;
	}

	public void setAutreFraisHonoraires(Double autreFraisHonoraires) {
		AutreFraisHonoraires = autreFraisHonoraires;
	}

	public ImpotsRPP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImpotsRPP(Double beneficeCommerciauxIndustriels, Double beneficeProfessionNonCommercial,
			Double beneficeActiviteAgricole, Double revenuImmobiliers, Double autreFraisHonoraires) {
		super();
		BeneficeCommerciauxIndustriels = beneficeCommerciauxIndustriels;
		BeneficeProfessionNonCommercial = beneficeProfessionNonCommercial;
		BeneficeActiviteAgricole = beneficeActiviteAgricole;
		RevenuImmobiliers = revenuImmobiliers;
		AutreFraisHonoraires = autreFraisHonoraires;
	}

}
