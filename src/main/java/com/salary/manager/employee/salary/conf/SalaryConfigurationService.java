package com.salary.manager.employee.salary.conf;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class SalaryConfigurationService {
	
	@Autowired
	private SalaryConfigurationRepository salaryConfigurationRepository;
	
	public SalaryConfiguration save(SalaryConfiguration salaryConfiguration ) {
		return salaryConfigurationRepository.save(salaryConfiguration) ;
	}
	
	public void delete(SalaryConfiguration salaryConfiguration) {
		salaryConfigurationRepository.delete(salaryConfiguration);
	}
	
	public void deleteById(long id) {
		salaryConfigurationRepository.deleteById(id);
	}
	
	public Optional<SalaryConfiguration> getConfiguration(long id) {
		return salaryConfigurationRepository.findById(id);
	}
	
	public List<SalaryConfiguration> getSalaryConfigurations(){
		return salaryConfigurationRepository.findAll();
	}
}
