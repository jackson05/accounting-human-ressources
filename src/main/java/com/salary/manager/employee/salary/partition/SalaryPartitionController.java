package com.salary.manager.employee.salary.partition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryPartitionController {

	@Autowired
	private SalaryPartitionService salaryPartitionservice;
	
	@PostMapping("/salary/patition")
	public SalaryPartition addNewPartition(@RequestBody SalaryPartition salaryPartition) {
		return salaryPartitionservice.save(salaryPartition);
	}
	
	@GetMapping("/salary/patition")
	public List<SalaryPartition> getPartitions(){
		return salaryPartitionservice.getSalaryConfigurations();
	}
}
