package com.salary.manager.employee.salary.partition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryPartitionRepository extends 
				JpaRepository<SalaryPartition, Long> {

	
}
