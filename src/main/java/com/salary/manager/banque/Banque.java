package com.salary.manager.banque;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designationBanque;
	private int userCreatedBanque;
	private int userModifiedBanque;
	private String dateCreatedBanque;
	private String dateModifiedBanque;
	
	
	public Banque() {
		super();
	}


	public Banque(int id, String name, int userCreatedBanque, int userModifiedBanque, String dateCreatedBanque,
			String dateModifiedBanque) {
		super();
		this.id = id;
		this.designationBanque = name;
		this.userCreatedBanque = userCreatedBanque;
		this.userModifiedBanque = userModifiedBanque;
		this.dateCreatedBanque = dateCreatedBanque;
		this.dateModifiedBanque = dateModifiedBanque;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesignationBanque() {
		return designationBanque;
	}


	public void setDesignationBanque(String designationBanque) {
		this.designationBanque = designationBanque;
	}


	public int getUserCreatedBanque() {
		return userCreatedBanque;
	}


	public void setUserCreatedBanque(int userCreatedBanque) {
		this.userCreatedBanque = userCreatedBanque;
	}


	public int getUserModifiedBanque() {
		return userModifiedBanque;
	}


	public void setUserModifiedBanque(int userModifiedBanque) {
		this.userModifiedBanque = userModifiedBanque;
	}


	public String getDateCreatedBanque() {
		return dateCreatedBanque;
	}


	public void setDateCreatedBanque(String dateCreatedBanque) {
		this.dateCreatedBanque = dateCreatedBanque;
	}


	public String getDateModifiedBanque() {
		return dateModifiedBanque;
	}


	public void setDateModifiedBanque(String dateModifiedBanque) {
		this.dateModifiedBanque = dateModifiedBanque;
	}

 
	
   
}
