//package com.salary.manager.user;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.salary.manager.user.role.Role;
//
//public class MyUserDetails implements UserDetails{
//
//	
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 7042904970302442941L;
//
//	public int getIdUser() {
//		return idUser;
//	}
//
//	public void setIdUser(int idUser) {
//		this.idUser = idUser;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	
//	public boolean isExpired() {
//		return expired;
//	}
//
//	public void setExpired(boolean expired) {
//		this.expired = expired;
//	}
//
//	public String getExpiredDate() {
//		return expiredDate;
//	}
//
//	public void setExpiredDate(String expiredDate) {
//		this.expiredDate = expiredDate;
//	}
//
//	public String getLastAcces() {
//		return lastAcces;
//	}
//
//	public void setLastAcces(String lastAcces) {
//		this.lastAcces = lastAcces;
//	}
//
//	public String getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(String createdDate) {
//		this.createdDate = createdDate;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
////	public void setAuthorities(List<GrantedAuthority> authorities) {
////		this.authorities = authorities.stream().map(role -> 
////		new SimpleGrantedAuthority(role.getRoleName()))
////				.collect(Collectors.toList());;
////	}
//
//	private int idUser;
//	private String userName;
//	private String password;
//	private boolean enabled;
//	private boolean expired;
//	private boolean locked;
//	private String expiredDate;
//	private String lastAcces;
//	private String createdDate;
//	
//	private List<Role>authorities;
//	
//	public MyUserDetails(User user) {
//		
//			this.idUser=user.getIdUser();
//			this.userName=user.getUserName();
//			this.password=user.getPassword();
//			this.enabled=user.isEnabled();
//			this.locked=user.isLocked();
//			this.expired=user.isAccountExpired();
//			this.expiredDate=user.getExpiredDate();
//			this.lastAcces=user.getLastAcces();
//			this.createdDate=user.getCreatedDate();
//			this.authorities=user.getRoles();
//	}
//	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		
//		return rolesToAuthorities(authorities);
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return password;
//	}
//
//	@Override
//	public String getUsername() {
//		return userName;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return expired;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return locked;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return expired;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return enabled;
//	}
//
//	
//	private Collection<? extends GrantedAuthority>rolesToAuthorities(List<Role> roles)
//	{
//		return roles.stream().map(role -> 
//		new SimpleGrantedAuthority(role.getRoleName()))
//				.collect(Collectors.toList());
//	}
//}