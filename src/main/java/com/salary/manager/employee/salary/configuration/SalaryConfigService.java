package com.salary.manager.employee.salary.configuration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryConfigService {

	@Autowired
	private SalaryConfigRepository salaryConfigRep;

	public SalaryConfig save(SalaryConfig salaryConfig) {
		return salaryConfigRep.save(salaryConfig);
	}

	public List<SalaryConfig> loadSalaryConfig() {
		return salaryConfigRep.findAll();
	}
	
	public Optional<SalaryConfig> findById(long id) {
		return salaryConfigRep.findById(id);
	}
	
	public SalaryConfig hide(SalaryConfig salaryConfig){
		return null;
	}

}




