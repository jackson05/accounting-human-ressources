package com.salary.manager.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
	User findByUsername(String name);
	
	@Modifying
	@Query(value="insert into user_roles(role_id,user_id) values(?,?)",nativeQuery = true)
	public void saveUserRole(int roleId,int userId );
}
