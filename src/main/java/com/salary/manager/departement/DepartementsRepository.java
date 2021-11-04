package com.salary.manager.departement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementsRepository extends JpaRepository<Departement, Integer> {

	Departement findByDesignationDepartment(String designationDepartment);
  
}
