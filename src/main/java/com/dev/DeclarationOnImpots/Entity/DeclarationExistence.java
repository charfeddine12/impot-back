package com.dev.DeclarationOnImpots.Entity;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity 
//@Inheritance(strategy=InheritanceType.table_per_class)
public class DeclarationExistence /*extends DeclarationImpots*/ implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id Long CodeDE;
String RegimeImpots;
String CodeTva;
String AssujettissementTva;
String FaitGenerateurTva;
String PeriodiciteActivite;
String PeriodiciteDeclarationImpots;
String AssujettissementImpots;
public String getRegimeImpots() {
	return RegimeImpots;
}
public void setRegimeImpots(String regimeImpots) {
	RegimeImpots = regimeImpots;
}
public String getCodeTva() {
	return CodeTva;
}
public void setCodeTva(String codeTva) {
	CodeTva = codeTva;
}
public String getAssujettissementTva() {
	return AssujettissementTva;
}
public void setAssujettissementTva(String assujettissementTva) {
	AssujettissementTva = assujettissementTva;
}
public String getFaitGenerateurTva() {
	return FaitGenerateurTva;
}
public void setFaitGenerateurTva(String faitGenerateurTva) {
	FaitGenerateurTva = faitGenerateurTva;
}
public String getPeriodiciteActivite() {
	return PeriodiciteActivite;
}
public void setPeriodiciteActivite(String periodiciteActivite) {
	PeriodiciteActivite = periodiciteActivite;
}
public String getPeriodiciteDeclarationImpots() {
	return PeriodiciteDeclarationImpots;
}
public void setPeriodiciteDeclarationImpots(String periodiciteDeclarationImpots) {
	PeriodiciteDeclarationImpots = periodiciteDeclarationImpots;
}
public String getAssujettissementImpots() {
	return AssujettissementImpots;
}
public void setAssujettissementImpots(String assujettissementImpots) {
	AssujettissementImpots = assujettissementImpots;
}
public Long getCodeDE() {
	return CodeDE;
}
public void setCodeDE(Long codeDE) {
	CodeDE = codeDE;
}

public DeclarationExistence() {
	super();
	// TODO Auto-generated constructor stub
}
public DeclarationExistence(Long codeDE, String regimeImpots, String codeTva, String assujettissementTva,
		String faitGenerateurTva, String periodiciteActivite, String periodiciteDeclarationImpots,
		String assujettissementImpots) {
	super();
	CodeDE = codeDE;
	RegimeImpots = regimeImpots;
	CodeTva = codeTva;
	AssujettissementTva = assujettissementTva;
	FaitGenerateurTva = faitGenerateurTva;
	PeriodiciteActivite = periodiciteActivite;
	PeriodiciteDeclarationImpots = periodiciteDeclarationImpots;
	AssujettissementImpots = assujettissementImpots;
}

}
