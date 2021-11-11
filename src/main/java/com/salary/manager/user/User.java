package com.salary.manager.user;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.salary.manager.user.role.Role;

@Entity
public class User {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int idUser;
	private String userName;
	private String password;
	private boolean isEnabled;
	private boolean isAccountExpired;
	private boolean isLocked;
	private Date createdDate;
	private Date modifiedDate;
	private Date lastAcces;
	private Date expiredDate;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name="user_roles",
			joinColumns = @JoinColumn(
					name="role_id",
					referencedColumnName = "id"
					),
			inverseJoinColumns = @JoinColumn(
					name="user_id",
					referencedColumnName="id")
			
			)
	private List<Role> roles=new ArrayList<>();
	
	public int getIdUser() {
		return idUser;
	}
	
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	public Date getLastAcces() {
		return lastAcces;
	}
	
	public void setLastAcces(Date lastAcces) {
		this.lastAcces = lastAcces;
	}
	
	public Date getExpiredDate() {
		return expiredDate;
	}
	
	
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
