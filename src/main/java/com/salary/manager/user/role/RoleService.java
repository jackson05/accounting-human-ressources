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
	
	public void delete(Role role) {
		roleRepo.delete(role);
	}
	
	public void deleteById(int id) {
		roleRepo.deleteById(id);
	}
	
	public List<Role> findAllRoles(){
		List<Role> roles=new ArrayList<>();
		roleRepo.findAll().forEach(roles::add);
		return roles;			
	}
}
