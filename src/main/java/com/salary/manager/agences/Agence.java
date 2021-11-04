package com.salary.manager.agences;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designationAgence;
	private int userCreatedAgence;
	private int userModifiedAgence;
	private String dateCreatedAgence;
	private String dateModifiedAgence;
	
	
	public Agence() {
		super();
	}


	public Agence(int id, String name, int userCreatedAgence, int userModifiedAgence, String dateCreatedAgence,
			String dateModifiedAgence) {
		super();
		this.id = id;
		this.designationAgence = name;
		this.userCreatedAgence = userCreatedAgence;
		this.userModifiedAgence = userModifiedAgence;
		this.dateCreatedAgence = dateCreatedAgence;
		this.dateModifiedAgence = dateModifiedAgence;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesignationAgence() {
		return designationAgence;
	}


	public void setDesignationAgence(String name) {
		this.designationAgence = name;
	}


	public int getUserCreatedAgence() {
		return userCreatedAgence;
	}


	public void setUserCreatedAgence(int userCreatedAgence) {
		this.userCreatedAgence = userCreatedAgence;
	}


	public int getUserModifiedAgence() {
		return userModifiedAgence;
	}


	public void setUserModifiedAgence(int userModifiedAgence) {
		this.userModifiedAgence = userModifiedAgence;
	}


	public String getDateCreatedAgence() {
		return dateCreatedAgence;
	}


	public void setDateCreatedAgence(String dateCreatedAgence) {
		this.dateCreatedAgence = dateCreatedAgence;
	}


	public String getDateModifiedAgence() {
		return dateModifiedAgence;
	}


	public void setDateModifiedAgence(String dateModifiedAgence) {
		this.dateModifiedAgence = dateModifiedAgence;
	}

 
	
   
}
