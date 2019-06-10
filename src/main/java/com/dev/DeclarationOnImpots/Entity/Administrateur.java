package com.dev.DeclarationOnImpots.Entity;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity 
//@Inheritance(strategy=InheritanceType.table_per_class)
public class Administrateur /* extends Contribuable*/ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long CodeAdmin;
	private String Mission;
	public Long getCodeAdmin() {
		return CodeAdmin;
	}
	public void setCodeAdmin(Long codeAdmin) {
		CodeAdmin = codeAdmin;
	}
	public String getMission() {
		return Mission;
	}
	public void setMission(String mission) {
		Mission = mission;
	}
	public Administrateur(Long codeAdmin, String mission) {
		super();
		CodeAdmin = codeAdmin;
		Mission = mission;
	}
	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
