package com.salary.manager.user;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.salary.manager.user.role.Role;

@Service
public class UserService  implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(userName);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + userName);
		}
		return new org.springframework
				.security
				.core
				.userdetails
				.User(user.getUsername(), user.getPassword(),
						rolesToAuthorities(user.getRoles())
//						new ArrayList<>()
						);
	}
	
	
	
	
	private Collection<? extends GrantedAuthority>rolesToAuthorities(Set<Role> roles)
	{
		return roles.stream().map(role -> 
		new SimpleGrantedAuthority(role.getRoleName()))
				.collect(Collectors.toList());
	}
	
	private Set<Role>authorities;
	
	public Collection<? extends GrantedAuthority> getAuthorities() {
		authorities=new HashSet<>();
		return rolesToAuthorities(authorities);
	}
	
/*
 * SECTION DE GESTION DES CRUD POUR L'UTILISATEUR
 * ===================================================
 */
	
	public User save(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepo.save(user);
	}
	
	public List<User> getUsers() {
		List<User> list=new ArrayList<>();
		userRepo.findAll().forEach(list::add);
		 return list;
		 
	}
	
	public Optional<User> getUserById(int id) {
		return	userRepo.findById(id);
	}
	
	public User getUserByUsername(String userName) {
		return	userRepo.findByUsername(userName);
	}
	
	public void delete(User user) {
		userRepo.delete(user);
	}
	
	public void deleteById(int id) {
		userRepo.deleteById(id);
	}
	
	public List<User>loadUsers(){
		List<User>users=new ArrayList<>();
		userRepo.findAll().forEach(users::add);
		return users;
	}
	
//	@Query("insert into user_roles values(role_id,user_id)")
	public Optional<User> addUserAndRoles(User user,Set<Role> role) {
		return  userRepo.findById(user.getIdUser());
	}
	

}
