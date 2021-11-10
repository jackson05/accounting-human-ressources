package com.salary.manager.level;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Level {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designationLevel;
	private int userCreatedLevel;
	private int userModifiedLevel;
	private String dateCreatedLevel;
	private String dateModifiedLevel;
	
	
	public Level() {
		super();
	}


	public Level(int id, String name, int userCreatedLevel, int userModifiedLevel, String dateCreatedLevel,
			String dateModifiedLevel) {
		super();
		this.id = id;
		this.designationLevel = name;
		this.userCreatedLevel = userCreatedLevel;
		this.userModifiedLevel = userModifiedLevel;
		this.dateCreatedLevel = dateCreatedLevel;
		this.dateModifiedLevel = dateModifiedLevel;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesignationLevel() {
		return designationLevel;
	}


	public void setDesignationLevel(String designationLevel) {
		this.designationLevel = designationLevel;
	}


	public int getUserCreatedLevel() {
		return userCreatedLevel;
	}


	public void setUserCreatedLevel(int userCreatedLevel) {
		this.userCreatedLevel = userCreatedLevel;
	}


	public int getUserModifiedLevel() {
		return userModifiedLevel;
	}


	public void setUserModifiedLevel(int userModifiedLevel) {
		this.userModifiedLevel = userModifiedLevel;
	}


	public String getDateCreatedLevel() {
		return dateCreatedLevel;
	}


	public void setDateCreatedLevel(String dateCreatedLevel) {
		this.dateCreatedLevel = dateCreatedLevel;
	}


	public String getDateModifiedLevel() {
		return dateModifiedLevel;
	}


	public void setDateModifiedLevel(String dateModifiedLevel) {
		this.dateModifiedLevel = dateModifiedLevel;
	}

 
	
   
}
