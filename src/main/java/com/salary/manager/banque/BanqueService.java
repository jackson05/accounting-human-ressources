package com.salary.manager.banque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BanqueService {
 
	@Autowired
	private BanqueRepository banqueRepository;
	
    public Banque addBanque(Banque Banque) {
    	banqueRepository.save(Banque);
    	return Banque;
    }
    
    public List<Banque>  getAllBanque() {
    	return banqueRepository.findAll();
    }
    
    public Banque getByIdBanque(int id) {
    	return banqueRepository.findById(id).orElse(null);
    }
    
    public Banque getByDesignationBanque(String designationBanque) {
    	return banqueRepository.findByDesignationBanque(designationBanque);
    }
    
    public Banque updateBanque(int id, Banque Banque) {
    	Banque oldBanque = banqueRepository.findById(id).orElse(null);
    	oldBanque.setDesignationBanque(Banque.getDesignationBanque());
    	oldBanque.setUserModifiedBanque(Banque.getUserModifiedBanque());
    	oldBanque.setDateModifiedBanque(Banque.getDateModifiedBanque()); 
    	banqueRepository.save(oldBanque);
    	return oldBanque;
    }
    
    public void deleteBanque (int id) {
    	banqueRepository.deleteById(id);
    }
}


















