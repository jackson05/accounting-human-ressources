package com.salary.manager.user.role;

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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.salary.manager.user.User;
//
//import com.salary.manager.test.model.DAOUser;
//import com.salary.manager.user.User;

//import com.salary.manager.test.model.User;

@Entity
public class Role {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String roleName;
	private String createdDate;
	private String modifiedDate;

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
	@JsonBackReference
	private Set<User> user=new HashSet<>();

	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

}
