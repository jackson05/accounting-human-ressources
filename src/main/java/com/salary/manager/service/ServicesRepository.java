package com.salary.manager.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Integer> {

	Services findByDesignationServices(String designationServices);
  
}
