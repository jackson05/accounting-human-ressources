package com.salary.manager.fonction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FonctionService {
 
	@Autowired
	private FonctionRepository FonctionRepository;
	
    public Fonction addFonction(Fonction Fonction) {
    	FonctionRepository.save(Fonction);
    	return Fonction;
    }
    
    public List<Fonction>  getAllFonction() {
    	return FonctionRepository.findAll();
    }
    
    public Fonction getByIdFonction(int id) {
    	return FonctionRepository.findById(id).orElse(null);
    }
    
    public Fonction getByDesignationFonction(String designationFonction) {
    	return FonctionRepository.findByDesignationFonction(designationFonction);
    }
    
    public Fonction updateFonction(int id, Fonction Fonction) {
    	Fonction oldFonction = FonctionRepository.findById(id).orElse(null);
    	oldFonction.setDesignationFonction(Fonction.getDesignationFonction());
    	oldFonction.setUserModifiedFonction(Fonction.getUserModifiedFonction());
    	oldFonction.setDateModifiedFonction(Fonction.getDateModifiedFonction()); 
    	FonctionRepository.save(oldFonction);
    	return oldFonction;
    }
    
    public void deleteFonction (int id) {
    	FonctionRepository.deleteById(id);
    }
}


















