package com.salary.manager.user.role;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class RoleService {
	
	@Autowired
	private RoleRepository roleRepo;
	
	public Role save(Role role) {		
		return roleRepo.save(role);
	}
	
	public Role delete(Role role) {
		roleRepo.delete(role);
		return role;
	}
	
	public List<Role> findAllRoles(){
		List<Role> roles=new ArrayList<>();
		roleRepo.findAll().forEach(roles::add);
		return roles;			
	}
}
