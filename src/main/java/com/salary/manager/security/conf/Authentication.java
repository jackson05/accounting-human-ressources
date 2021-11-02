package com.salary.manager.security.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salary.manager.security.jwt.model.AuthenticationRequest;
import com.salary.manager.security.jwt.model.AuthenticationResponse;
import com.salary.manager.security.jwt.util.JwtUtil;

@RestController
public class Authentication {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserDetailsServices userDetailsService;
	
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
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt));

	}
}
