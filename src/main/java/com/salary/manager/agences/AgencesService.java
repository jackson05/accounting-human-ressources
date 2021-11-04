package com.salary.manager.agences;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgencesService {
 
	@Autowired
	private AgencesRepository agencesRepository;
	
    public Agence addAgence(Agence agence) {
    	agencesRepository.save(agence);
    	return agence;
    }
    
    public List<Agence>  getAllAgence() {
    	return agencesRepository.findAll();
    }
    
    public Agence getByIdAgence(int id) {
    	return agencesRepository.findById(id).orElse(null);
    }
    
    public Agence getByNameAgence(String name) {
    	return agencesRepository.findByName(name);
    }
    
    public Agence updateAgence(int id, Agence agence) {
    	Agence oldAgence = agencesRepository.findById(id).orElse(null);
    	oldAgence.setName(agence.getName());
    	oldAgence.setUserModifiedAgence(agence.getUserModifiedAgence());
    	oldAgence.setDateModifiedAgence(agence.getDateModifiedAgence()); 
    	agencesRepository.save(oldAgence);
    	return oldAgence;
    }
    
    public void deleteAgence (int id) {
    	agencesRepository.deleteById(id);
    }
}


















