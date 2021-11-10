package com.salary.manager.category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designationCategory;
	private int userCreatedCategory;
	private int userModifiedCategory;
	private String dateCreatedCategory;
	private String dateModifiedCategory;
	
	
	public Category() {
		super();
	}


	public Category(int id, String name, int userCreatedCategory, int userModifiedCategory, String dateCreatedCategory,
			String dateModifiedCategory) {
		super();
		this.id = id;
		this.designationCategory = name;
		this.userCreatedCategory = userCreatedCategory;
		this.userModifiedCategory = userModifiedCategory;
		this.dateCreatedCategory = dateCreatedCategory;
		this.dateModifiedCategory = dateModifiedCategory;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesignationCategory() {
		return designationCategory;
	}


	public void setDesignationCategory(String designationCategory) {
		this.designationCategory = designationCategory;
	}


	public int getUserCreatedCategory() {
		return userCreatedCategory;
	}


	public void setUserCreatedCategory(int userCreatedCategory) {
		this.userCreatedCategory = userCreatedCategory;
	}


	public int getUserModifiedCategory() {
		return userModifiedCategory;
	}


	public void setUserModifiedCategory(int userModifiedCategory) {
		this.userModifiedCategory = userModifiedCategory;
	}


	public String getDateCreatedCategory() {
		return dateCreatedCategory;
	}


	public void setDateCreatedCategory(String dateCreatedCategory) {
		this.dateCreatedCategory = dateCreatedCategory;
	}


	public String getDateModifiedCategory() {
		return dateModifiedCategory;
	}


	public void setDateModifiedCategory(String dateModifiedCategory) {
		this.dateModifiedCategory = dateModifiedCategory;
	}

 
	
   
}
