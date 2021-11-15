package com.salary.manager.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salary.manager.security.jwt.model.AuthenticationRequest;
import com.salary.manager.security.jwt.model.AuthenticationResponse;
import com.salary.manager.security.jwt.util.JwtUtil;

@RestController
public class UserController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserService userDetailsService;
	
	@GetMapping("/hello")
	public String hello() {
		
		return "hello world";
	}
	
	@Autowired
	private JwtUtil jwtTokenUtil;

	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody 
			AuthenticationRequest authenticationRequest)throws Exception {
		try {		
			authenticationManager
			.authenticate(
					new UsernamePasswordAuthenticationToken
					(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
			
		}catch (BadCredentialsException e) {
			throw new Exception("Incorrect userName and Password",e);
		}
		
		final UserDetails userDetails=userDetailsService
										.loadUserByUsername
										(authenticationRequest.getUsername());
		
		final String jwt=jwtTokenUtil.generateToken(userDetails);
		System.out.println("Token generated= "+jwt);
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt));

	}
	
	
	@PostMapping("/user/add/{user}")
	public User addUser(User user) {
		return userDetailsService.save(user);
	}
	
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userDetailsService.loadUsers();
	}
	
	@DeleteMapping("/user/delete/{user}")
	public List<User> deleteUser(User user){
		 userDetailsService.delete(user);
		 return userDetailsService.loadUsers();
	}
	
	@DeleteMapping("/user/{id}/delete")
	public List<User> deleteUser(int id){
		userDetailsService.deleteById(id);
		return userDetailsService.loadUsers();
	}
	
	
	

}
