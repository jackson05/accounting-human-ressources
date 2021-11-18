//package com.salary.manager.user;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService implements UserDetailsService {
//	
//	@Autowired
//	private UserRepository userRepo;
//	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//
//	@Override
//	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//		
//		 Optional<User> user=userRepo.findByUserName(userName);
//		 
//		 user.orElseThrow(()->new UsernameNotFoundException("L'utilisateur n'existe pas :"+userName));
//		 
//		 return user.map(MyUserDetails::new).get();
//	}
//	
//	public User save(User user) {
//		user.setPassword(passwordEncoder.encode(user.getPassword()));
//		return userRepo.save(user);
//	}
//	
//	public void delete(User user) {
//		userRepo.delete(user);
//	}
//	
//	public void deleteById(int id) {
//		userRepo.deleteById(id);
//	}
//	
//	public List<User>loadUsers(){
//		List<User>users=new ArrayList<>();
//		userRepo.findAll().forEach(users::add);
//		return users;
//	}
//	
//	
//	
//	
//
//}
