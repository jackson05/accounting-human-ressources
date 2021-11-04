package com.salary.manager.service;

import javax.persistence.CascadeType;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
 

import com.salary.manager.departement.Departement;


@Entity
public class Services {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Departement.class) 
//	@JoinColumn(name="id", referencedColumnName = "id", insertable = false, updatable = false)  
//	@SortNatural
	private int departementService;
	
	private String designationServices;
	private int userCreatedServices;
	private int userModifiedServices;
	private String dateCreatedServices;
	private String dateModifiedServices;
	
	
	public Services() {
		super();
	}


	public Services(int id, String name, int userCreatedServices, int userModifiedServices, String dateCreatedServices,
			String dateModifiedServices) {
		super();
		this.id = id;
		this.designationServices = name;
		this.userCreatedServices = userCreatedServices;
		this.userModifiedServices = userModifiedServices;
		this.dateCreatedServices = dateCreatedServices;
		this.dateModifiedServices = dateModifiedServices;
	}


	public int getId() {
		return id;
	}


	public int getDepartementService() {
		return departementService;
	}


	public void setDepartementService(int departementService) {
		this.departementService = departementService;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesignationServices() {
		return designationServices;
	}


	public void setDesignationServices(String designationServices) {
		this.designationServices = designationServices;
	}


	public int getUserCreatedServices() {
		return userCreatedServices;
	}


	public void setUserCreatedServices(int userCreatedServices) {
		this.userCreatedServices = userCreatedServices;
	}


	public int getUserModifiedServices() {
		return userModifiedServices;
	}


	public void setUserModifiedServices(int userModifiedServices) {
		this.userModifiedServices = userModifiedServices;
	}


	public String getDateCreatedServices() {
		return dateCreatedServices;
	}


	public void setDateCreatedServices(String dateCreatedServices) {
		this.dateCreatedServices = dateCreatedServices;
	}


	public String getDateModifiedServices() {
		return dateModifiedServices;
	}


	public void setDateModifiedServices(String dateModifiedServices) {
		this.dateModifiedServices = dateModifiedServices;
	}

 
	
   
}
