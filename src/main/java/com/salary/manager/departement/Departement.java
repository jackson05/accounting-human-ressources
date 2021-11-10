package com.salary.manager.departement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designationDepartment;
	private int userCreatedDepartement;
	private int userModifiedDepartement;
	private String dateCreatedDepartement;
	private String dateModifiedDepartement;
	
	
	public Departement() {
		super();
	}


	public Departement(int id, String name, int userCreatedDepartement, int userModifiedDepartement, String dateCreatedDepartement,
			String dateModifiedDepartement) {
		super();
		this.id = id;
		this.designationDepartment = name;
		this.userCreatedDepartement = userCreatedDepartement;
		this.userModifiedDepartement = userModifiedDepartement;
		this.dateCreatedDepartement = dateCreatedDepartement;
		this.dateModifiedDepartement = dateModifiedDepartement;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesignationDepartment() {
		return designationDepartment;
	}


	public void setDesignationDepartment(String designationDepartment) {
		this.designationDepartment = designationDepartment;
	}


	public int getUserCreatedDepartement() {
		return userCreatedDepartement;
	}


	public void setUserCreatedDepartement(int userCreatedDepartement) {
		this.userCreatedDepartement = userCreatedDepartement;
	}


	public int getUserModifiedDepartement() {
		return userModifiedDepartement;
	}


	public void setUserModifiedDepartement(int userModifiedDepartement) {
		this.userModifiedDepartement = userModifiedDepartement;
	}


	public String getDateCreatedDepartement() {
		return dateCreatedDepartement;
	}


	public void setDateCreatedDepartement(String dateCreatedDepartement) {
		this.dateCreatedDepartement = dateCreatedDepartement;
	}


	public String getDateModifiedDepartement() {
		return dateModifiedDepartement;
	}


	public void setDateModifiedDepartement(String dateModifiedDepartement) {
		this.dateModifiedDepartement = dateModifiedDepartement;
	}

	
   
}
