package com.salary.manager.employee.salary.configuration;

import java.util.List;

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

	public SalaryConfig makeStoped(SalaryConfig salaryConfig){
		return null;
	}

}




