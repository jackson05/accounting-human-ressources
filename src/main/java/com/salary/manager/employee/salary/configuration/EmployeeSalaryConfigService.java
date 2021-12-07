package com.salary.manager.employee.salary.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeSalaryConfigService {

	@Autowired
	private EmployeeSalaryConfigRepository employeeSalaryConfigRep;

	public EmployeeSalaryConfig save(EmployeeSalaryConfig employeeSalaryConfig) {
		return employeeSalaryConfigRep.save(employeeSalaryConfig);
	}

	public List<EmployeeSalaryConfig> loadEmployeeSalaryConfig() {
		return employeeSalaryConfigRep.findAll();
	}

	public EmployeeSalaryConfig makeStoped(EmployeeSalaryConfig employeeSalaryConfig){
		return null;
	}

}




