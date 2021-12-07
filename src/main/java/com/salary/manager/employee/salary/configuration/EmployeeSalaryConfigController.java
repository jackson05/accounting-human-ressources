package com.salary.manager.employee.salary.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeSalaryConfigController {
	
	@Autowired
	private EmployeeSalaryConfigService employeeSalaryConfigService;
	
	@PostMapping("/salary/configuration")
	public EmployeeSalaryConfig 
		saveEmployeeSalaryConfig(@RequestBody EmployeeSalaryConfig employeeSalaryConfig) {
		return employeeSalaryConfigService.save(employeeSalaryConfig);
	}
	
	@GetMapping("/salary/configuration")
	public List<EmployeeSalaryConfig> loadEmployeeSalaryConfig(){
		return employeeSalaryConfigService.loadEmployeeSalaryConfig();
	}
	
	

}
