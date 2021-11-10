package com.salary.manager.assurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssuranceService {
 
	@Autowired
	private AssuranceRepository assuranceRepository;
	
    public Assurance addAssurance(Assurance Assurance) {
    	assuranceRepository.save(Assurance);
    	return Assurance;
    }
    
    public List<Assurance>  getAllAssurance() {
    	return assuranceRepository.findAll();
    }
    
    public Assurance getByIdAssurance(int id) {
    	return assuranceRepository.findById(id).orElse(null);
    }
    
    public Assurance getByDesignationAssurance(String designationAssurance) {
    	return assuranceRepository.findByDesignationAssurance(designationAssurance);
    }
    
    public Assurance updateAssurance(int id, Assurance Assurance) {
    	Assurance oldAssurance = assuranceRepository.findById(id).orElse(null);
    	oldAssurance.setDesignationAssurance(Assurance.getDesignationAssurance());
    	oldAssurance.setUserModifiedAssurance(Assurance.getUserModifiedAssurance());
    	oldAssurance.setDateModifiedAssurance(Assurance.getDateModifiedAssurance()); 
    	assuranceRepository.save(oldAssurance);
    	return oldAssurance;
    }
    
    public void deleteAssurance (int id) {
    	assuranceRepository.deleteById(id);
    }
}


















