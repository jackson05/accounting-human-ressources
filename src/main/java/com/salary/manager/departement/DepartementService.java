package com.salary.manager.departement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartementService {
 
	@Autowired
	private DepartementsRepository departementsRepository;
	
    public Departement addDepartement(Departement Departement) {
    	departementsRepository.save(Departement);
    	return Departement;
    }
    
    public List<Departement>  getAllDepartement() {
    	return departementsRepository.findAll();
    }
    
    public Departement getByIdDepartement(int id) {
    	return departementsRepository.findById(id).orElse(null);
    }
    
    public Departement getByDesignationDepartement(String designationDepartment) {
    	return departementsRepository.findByDesignationDepartment(designationDepartment);
    }
    
    public Departement updateDepartement(int id, Departement Departement) {
    	Departement oldDepartement = departementsRepository.findById(id).orElse(null);
    	oldDepartement.setDesignationDepartment(Departement.getDesignationDepartment());
    	oldDepartement.setUserModifiedDepartement(Departement.getUserModifiedDepartement());
    	oldDepartement.setDateModifiedDepartement(Departement.getDateModifiedDepartement()); 
    	departementsRepository.save(oldDepartement);
    	return oldDepartement;
    }
    
    public void deleteDepartement (int id) {
    	departementsRepository.deleteById(id);
    }
}


















