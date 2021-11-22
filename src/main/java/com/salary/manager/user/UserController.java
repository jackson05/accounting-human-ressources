package com.salary.manager.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
//	@Autowired
//	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserService userDetailsService;
	
	@GetMapping("/hello")
	public String hello() {
		
		return "hello world";
	}
	
	@PostMapping("/user/register")
	public ResponseEntity<?> saveUser(@RequestBody User user) throws Exception {
		return ResponseEntity.ok(userDetailsService.save(user));
	}
	
	@PutMapping("/user")
	public ResponseEntity<?> editUser(@RequestBody User user) throws Exception {
		return ResponseEntity.ok(userDetailsService.save(user));
	}
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userDetailsService.loadUsers();
	}
	
	@DeleteMapping("/user/delete/{user}")
	public List<User> deleteUser(@PathVariable User user){
		 userDetailsService.delete(user);
		 return userDetailsService.loadUsers();
	}
	
	@DeleteMapping("/user/{id}")
	public List<User> deleteUser(@PathVariable int id){
		userDetailsService.deleteById(id);
		return userDetailsService.loadUsers();
	}
	
	

}
