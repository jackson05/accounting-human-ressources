package com.salary.manager.test.model;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import com.salary.manager.user.role.Role;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	private boolean isEnabled;
	private boolean isAccountExpired;
	private boolean isLocked;
	private String createdDate;
	private String modifiedDate;
	private String lastAcces;
	private String expiredDate;
	
	@ManyToMany(mappedBy = "user")
	private List<Role> roles=new ArrayList<>();
	
	public int getIdUser() {
		return id;
	}
	
	public void setIdUser(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	
	public boolean isEnabled() {
		return isEnabled;
	}
	
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAccountExpired() {
		return isAccountExpired;
	}
	public void setAccountExpired(boolean isAccountExpired) {
		this.isAccountExpired = isAccountExpired;
	}
	public boolean isLocked() {
		return isLocked;
	}
	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	public String getLastAcces() {
		return lastAcces;
	}
	
	public void setLastAcces(String lastAcces) {
		this.lastAcces = lastAcces;
	}
	
	public String getExpiredDate() {
		return expiredDate;
	}
	
	
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}
	
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id;
//	@Column
//	private String username;
//	@Column
//	@JsonIgnore
//	private String password;
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	

}