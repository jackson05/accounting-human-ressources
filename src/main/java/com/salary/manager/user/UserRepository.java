package com.salary.manager.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salary.manager.test.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
	User findByUsername(String name);

}
