package com.salary.manager.assurance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuranceRepository extends JpaRepository<Assurance, Integer> {

	Assurance findByDesignationAssurance(String designationAssurance);
  
}
