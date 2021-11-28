package com.salary.manager.contributionSocial;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContributionSocial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String designationContributionSocial;
	private int pourcentageContributionSocial;
	private int montantContributionSocial;
	private int userCreatedContributionSocial;
	private int userModifiedContributionSocial;
	private String dateCreatedContributionSocial;
	private String dateModifiedContributionSocial;
	
	
	public ContributionSocial() {
		super();
	}
	public ContributionSocial(ContributionSocial contributionSocial) {
		super();
		this.id = contributionSocial.getId();
		this.designationContributionSocial = contributionSocial.getDesignationContributionSocial();
		this.pourcentageContributionSocial = contributionSocial.getPourcentageContributionSocial();
		this.montantContributionSocial = contributionSocial.getMontantContributionSocial();
		this.userCreatedContributionSocial = contributionSocial.getUserCreatedContributionSocial();
		this.userModifiedContributionSocial = contributionSocial.getUserModifiedContributionSocial();
		this.dateCreatedContributionSocial = contributionSocial.getDateCreatedContributionSocial();
		this.dateModifiedContributionSocial = contributionSocial.getDateModifiedContributionSocial();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignationContributionSocial() {
		return designationContributionSocial;
	}
	public void setDesignationContributionSocial(String designationContributionSocial) {
		this.designationContributionSocial = designationContributionSocial;
	}
	public int getPourcentageContributionSocial() {
		return pourcentageContributionSocial;
	}
	public void setPourcentageContributionSocial(int pourcentageContributionSocial) {
		this.pourcentageContributionSocial = pourcentageContributionSocial;
	}
	public int getMontantContributionSocial() {
		return montantContributionSocial;
	}
	public void setMontantContributionSocial(int montantContributionSocial) {
		this.montantContributionSocial = montantContributionSocial;
	}
	public int getUserCreatedContributionSocial() {
		return userCreatedContributionSocial;
	}
	public void setUserCreatedContributionSocial(int userCreatedContributionSocial) {
		this.userCreatedContributionSocial = userCreatedContributionSocial;
	}
	public int getUserModifiedContributionSocial() {
		return userModifiedContributionSocial;
	}
	public void setUserModifiedContributionSocial(int userModifiedContributionSocial) {
		this.userModifiedContributionSocial = userModifiedContributionSocial;
	}
	public String getDateCreatedContributionSocial() {
		return dateCreatedContributionSocial;
	}
	public void setDateCreatedContributionSocial(String dateCreatedContributionSocial) {
		this.dateCreatedContributionSocial = dateCreatedContributionSocial;
	}
	public String getDateModifiedContributionSocial() {
		return dateModifiedContributionSocial;
	}
	public void setDateModifiedContributionSocial(String dateModifiedContributionSocial) {
		this.dateModifiedContributionSocial = dateModifiedContributionSocial;
	}
	
	
	
}
