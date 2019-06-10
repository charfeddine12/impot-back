package com.dev.DeclarationOnImpots.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import net.minidev.json.annotate.JsonIgnore;
import org.springframework.data.jpa.repository.Temporal;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.web.bind.annotation.CrossOrigin;


@Entity


//@Inheritance(strategy=InheritanceType.table_per_class)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS )
public class Contribuable implements Serializable, UserDetails {
 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")

	protected long nif;

	 private String login;
	 private String password;
	 private String email;
	 private Long tel;
	public enum  categorie {personnePhysique, personneMorale};
	@Column(unique=true)
	protected String username;
	protected int numCnss;
	protected String nationnalite;
	protected String adresse;
	protected Boolean status;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "contribuable")
	protected Set<DeclarationImpots> declarationImpots = new HashSet<>();
	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="roles")
	protected Collection<AppRole> roles=new ArrayList<>();


	public Contribuable() {
		// TODO Auto-generated constructor stub
	}
	public Contribuable(long nif, String login, String password, String email, Long tel, int numCnss,
			String nationnalite, String adresse, Boolean status) {
		super();
		this.nif = nif;
		this.username = login;
		this.password = password;
		this.email = email;
		this.tel = tel;
		this.numCnss = numCnss;
		this.nationnalite = nationnalite;
		this.adresse = adresse;
		this.status = status;
	}
	public long getNif() {
		return nif;
	}
	public void setNif(long nif) {
		this.nif = nif;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getNumCnss() {
		return numCnss;
	}
	public void setNumCnss(int numCnss) {
		this.numCnss = numCnss;
	}
	public String getNationnalite() {
		return nationnalite;
	}
	public void setNationnalite(String nationnalite) {
		this.nationnalite = nationnalite;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Set<DeclarationImpots> getDeclarationImpots() {
		return declarationImpots;
	}
	public void setDeclarationImpots(Set<DeclarationImpots> declarationImpots) {
		this.declarationImpots = declarationImpots;
	}
	public Collection<AppRole> getRoles() {
		return roles;
	}
	public void setRoles(Collection<AppRole> roles) {
		this.roles = roles;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
