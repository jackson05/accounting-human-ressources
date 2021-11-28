package com.salary.manager.indeminites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Indemnite {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String designationIndemnite;
	private int pourcentageIndemnite;
	private int montantIndemnite;
	private int userCreatedIndemnite;
	private int userModifiedIndemnite;
	private String dateCreatedIndemnite;
	private String dateModifiedIndemnite;
	
	
	public Indemnite(Indemnite indeminite) {
		super();
		this.id = indeminite.getId();
		this.designationIndemnite = indeminite.getDesignationIndemnite();
		this.pourcentageIndemnite = indeminite.getPourcentageIndemnite();
		this.montantIndemnite = indeminite.getMontantIndemnite();
		this.userCreatedIndemnite = indeminite.getUserCreatedIndemnite();
		this.userModifiedIndemnite = indeminite.getUserModifiedIndemnite();
		this.dateCreatedIndemnite = indeminite.getDateCreatedIndemnite();
		this.dateModifiedIndemnite = indeminite.getDateModifiedIndemnite();
	}
	
	
	public Indemnite() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignationIndemnite() {
		return designationIndemnite;
	}
	public void setDesignationIndemnite(String designationIndemnite) {
		this.designationIndemnite = designationIndemnite;
	}
	public int getPourcentageIndemnite() {
		return pourcentageIndemnite;
	}
	public void setPourcentageIndemnite(int pourcentageIndemnite) {
		this.pourcentageIndemnite = pourcentageIndemnite;
	}
	public int getMontantIndemnite() {
		return montantIndemnite;
	}
	public void setMontantIndemnite(int montantIndemnite) {
		this.montantIndemnite = montantIndemnite;
	}
	public int getUserCreatedIndemnite() {
		return userCreatedIndemnite;
	}
	public void setUserCreatedIndemnite(int userCreatedIndemnite) {
		this.userCreatedIndemnite = userCreatedIndemnite;
	}
	public int getUserModifiedIndemnite() {
		return userModifiedIndemnite;
	}
	public void setUserModifiedIndemnite(int userModifiedIndemnite) {
		this.userModifiedIndemnite = userModifiedIndemnite;
	}
	public String getDateCreatedIndemnite() {
		return dateCreatedIndemnite;
	}
	public void setDateCreatedIndemnite(String dateCreatedIndemnite) {
		this.dateCreatedIndemnite = dateCreatedIndemnite;
	}
	public String getDateModifiedIndemnite() {
		return dateModifiedIndemnite;
	}
	public void setDateModifiedIndemnite(String dateModifiedIndemnite) {
		this.dateModifiedIndemnite = dateModifiedIndemnite;
	}
	
	
}
