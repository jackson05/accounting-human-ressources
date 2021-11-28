package com.salary.manager.level;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepository extends JpaRepository<Level, Integer> {

	Level findByDesignationLevel(String designationLevel);
  
}
