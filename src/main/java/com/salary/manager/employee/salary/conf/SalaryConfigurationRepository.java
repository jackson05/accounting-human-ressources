package com.salary.manager.employee.salary.conf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryConfigurationRepository extends 
				JpaRepository<SalaryConfiguration, Long> {

	
}
