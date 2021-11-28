package com.salary.manager.fonction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fonction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designationFonction;
	private int userCreatedFonction;
	private int userModifiedFonction;
	private String dateCreatedFonction;
	private String dateModifiedFonction;
	
	
	public Fonction() {
		super();
	}


	public Fonction(int id, String name, int userCreatedFonction, int userModifiedFonction, String dateCreatedFonction,
			String dateModifiedFonction) {
		super();
		this.id = id;
		this.designationFonction = name;
		this.userCreatedFonction = userCreatedFonction;
		this.userModifiedFonction = userModifiedFonction;
		this.dateCreatedFonction = dateCreatedFonction;
		this.dateModifiedFonction = dateModifiedFonction;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesignationFonction() {
		return designationFonction;
	}


	public void setDesignationFonction(String designationFonction) {
		this.designationFonction = designationFonction;
	}


	public int getUserCreatedFonction() {
		return userCreatedFonction;
	}


	public void setUserCreatedFonction(int userCreatedFonction) {
		this.userCreatedFonction = userCreatedFonction;
	}


	public int getUserModifiedFonction() {
		return userModifiedFonction;
	}


	public void setUserModifiedFonction(int userModifiedFonction) {
		this.userModifiedFonction = userModifiedFonction;
	}


	public String getDateCreatedFonction() {
		return dateCreatedFonction;
	}


	public void setDateCreatedFonction(String dateCreatedFonction) {
		this.dateCreatedFonction = dateCreatedFonction;
	}


	public String getDateModifiedFonction() {
		return dateModifiedFonction;
	}


	public void setDateModifiedFonction(String dateModifiedFonction) {
		this.dateModifiedFonction = dateModifiedFonction;
	}

 
	
   
}
