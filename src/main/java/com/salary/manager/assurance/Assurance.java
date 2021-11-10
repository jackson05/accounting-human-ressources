package com.salary.manager.assurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Assurance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designationAssurance;
	private int userCreatedAssurance;
	private int userModifiedAssurance;
	private String dateCreatedAssurance;
	private String dateModifiedAssurance;
	
	
	public Assurance() {
		super();
	}


	public Assurance(int id, String name, int userCreatedAssurance, int userModifiedAssurance, String dateCreatedAssurance,
			String dateModifiedAssurance) {
		super();
		this.id = id;
		this.designationAssurance = name;
		this.userCreatedAssurance = userCreatedAssurance;
		this.userModifiedAssurance = userModifiedAssurance;
		this.dateCreatedAssurance = dateCreatedAssurance;
		this.dateModifiedAssurance = dateModifiedAssurance;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesignationAssurance() {
		return designationAssurance;
	}


	public void setDesignationAssurance(String name) {
		this.designationAssurance = name;
	}


	public int getUserCreatedAssurance() {
		return userCreatedAssurance;
	}


	public void setUserCreatedAssurance(int userCreatedAssurance) {
		this.userCreatedAssurance = userCreatedAssurance;
	}


	public int getUserModifiedAssurance() {
		return userModifiedAssurance;
	}


	public void setUserModifiedAssurance(int userModifiedAssurance) {
		this.userModifiedAssurance = userModifiedAssurance;
	}


	public String getDateCreatedAssurance() {
		return dateCreatedAssurance;
	}


	public void setDateCreatedAssurance(String dateCreatedAssurance) {
		this.dateCreatedAssurance = dateCreatedAssurance;
	}


	public String getDateModifiedAssurance() {
		return dateModifiedAssurance;
	}


	public void setDateModifiedAssurance(String dateModifiedAssurance) {
		this.dateModifiedAssurance = dateModifiedAssurance;
	}

 
	
   
}
