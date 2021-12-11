package com.salary.manager.employee.salaryconfig;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryConfigRepository extends JpaRepository<SalaryConfig, Long> {

//	@Query("UPDATE")
	public List<SalaryConfig> findByStoped(boolean stoped);
//	public SalaryConfig findBySalaryConfig(SalaryConfig salaryConfig);
}
