package com.salary.manager.categorie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designationCategorie;
	private int userCreatedCategorie;
	private int userModifiedCategorie;
	private String dateCreatedCategorie;
	private String dateModifiedCategorie;
	
	
	public Categorie() {
		super();
	}


	public Categorie(int id, String name, int userCreatedCategorie, int userModifiedCategorie, String dateCreatedCategorie,
			String dateModifiedCategorie) {
		super();
		this.id = id;
		this.designationCategorie = name;
		this.userCreatedCategorie = userCreatedCategorie;
		this.userModifiedCategorie = userModifiedCategorie;
		this.dateCreatedCategorie = dateCreatedCategorie;
		this.dateModifiedCategorie = dateModifiedCategorie;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesignationCategorie() {
		return designationCategorie;
	}


	public void setDesignationCategorie(String designationCategorie) {
		this.designationCategorie = designationCategorie;
	}


	public int getUserCreatedCategorie() {
		return userCreatedCategorie;
	}


	public void setUserCreatedCategorie(int userCreatedCategorie) {
		this.userCreatedCategorie = userCreatedCategorie;
	}


	public int getUserModifiedCategorie() {
		return userModifiedCategorie;
	}


	public void setUserModifiedCategorie(int userModifiedCategorie) {
		this.userModifiedCategorie = userModifiedCategorie;
	}


	public String getDateCreatedCategorie() {
		return dateCreatedCategorie;
	}


	public void setDateCreatedCategorie(String dateCreatedCategorie) {
		this.dateCreatedCategorie = dateCreatedCategorie;
	}


	public String getDateModifiedCategorie() {
		return dateModifiedCategorie;
	}


	public void setDateModifiedCategorie(String dateModifiedCategorie) {
		this.dateModifiedCategorie = dateModifiedCategorie;
	}

 
	
   
}
