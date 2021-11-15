package com.salary.manager.user.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/role")
public class RoleController {
	
	@Autowired
	private RoleService rolesService;
	
	@PostMapping("/add/{role}")
	public Role addRole(@RequestBody Role role) {
		return rolesService.save(role);
	}
	
	@GetMapping("/roles")
	public List<Role> getRoles(){
		return rolesService.findAllRoles();
	}
	
	
	

}
