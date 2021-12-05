package com.salary.manager.employee.salary.conf;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class SalaryPartitionService {
	
	@Autowired
	private SalaryPartitionRepository salaryConfigurationRepository;
	
	public SalaryPartition save(SalaryPartition salaryPartition ) {
		return salaryConfigurationRepository.save(salaryPartition) ;
	}
	
	public void delete(SalaryPartition salaryPartition) {
		salaryConfigurationRepository.delete(salaryPartition);
	}
	
	public void deleteById(long id) {
		salaryConfigurationRepository.deleteById(id);
	}
	
	public Optional<SalaryPartition> getConfiguration(long id) {
		return salaryConfigurationRepository.findById(id);
	}
	
	public List<SalaryPartition> getSalaryConfigurations(){
		return salaryConfigurationRepository.findAll();
	}
}
