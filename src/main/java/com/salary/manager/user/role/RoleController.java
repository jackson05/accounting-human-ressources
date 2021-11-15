package com.salary.manager.user.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/role")
public class RoleController {
	
	@Autowired
	private RoleRepository roleRepo;
	
	public Role addRole(@RequestBody Role role) {
		return roleRepo.save(role);
	}
	

}
