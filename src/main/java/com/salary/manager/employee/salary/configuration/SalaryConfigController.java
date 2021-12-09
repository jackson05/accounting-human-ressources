package com.salary.manager.employee.salary.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryConfigController {
	
	@Autowired
	private SalaryConfigService salaryConfigService;
	
	@PostMapping("/salary/configuration")
	public SalaryConfig 
		saveEmployeeSalaryConfig(@RequestBody SalaryConfig salaryConfig) {
		return salaryConfigService.save(salaryConfig);
	}
	
	@GetMapping("/salary/configurations")
	public List<SalaryConfig> loadSalaryConfig(){
		return salaryConfigService.loadSalaryConfig();
	}

	
}
