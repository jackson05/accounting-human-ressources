package com.salary.manager.user;


import java.util.HashSet;
import java.util.Set;

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
	
//	@ManyToMany(fetch =FetchType.EAGER ,mappedBy= "user",cascade = CascadeType.ALL)
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name="user_roles",
			joinColumns = @JoinColumn(
					name="role_id"
					,
					referencedColumnName = "id"
					),
			inverseJoinColumns = @JoinColumn(
					name="user_id"
					,
					referencedColumnName="id"
					)
			
			)
	private Set<Role> roles=new HashSet<>();
	
	public int getIdUser() {
		return id;
	}
	
	public void setIdUser(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	
	
	public Set<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
