
//package com.salary.manager.authentication;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.DisabledException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.salary.manager.security.jwt.model.AuthenticationRequest;
//import com.salary.manager.security.jwt.model.AuthenticationResponse;
//import com.salary.manager.security.jwt.util.JwtTokenUtil;
//import com.salary.manager.user.User;
//import com.salary.manager.user.UserService;
//
//@RestController
//@CrossOrigin
//public class AuthenticationController {
//
//	@Autowired
//	private AuthenticationManager authenticationManager;
//
//	@Autowired
//	private JwtTokenUtil jwtTokenUtil;
//
//	@Autowired
//	private UserService userDetailsServices;
//
//	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
//	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
//
//		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
//
//		final UserDetails userDetails = userDetailsServices
//				.loadUserByUsername(authenticationRequest.getUsername());
//
//		final String token = jwtTokenUtil.generateToken(userDetails);
//
//		return ResponseEntity.ok(new AuthenticationResponse(token));
//	}
//	
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public ResponseEntity<?> saveUser(@RequestBody User user) throws Exception {
//		return ResponseEntity.ok(userDetailsServices.save(user));
//	}
//
//	private void authenticate(String username, String password) throws Exception {
//		try {
//			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//		} catch (DisabledException e) {
//			throw new Exception("USER_DISABLED", e);
//		} catch (BadCredentialsException e) {
//			throw new Exception("INVALID_CREDENTIALS", e);
//		}
//	}
//}