package com.salary.manager.indeminites;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndemniteService {

	@Autowired
	private IndemniteRepository indemniteRepository;
	
	public List<Indemnite> getAllIndemnites() {
		return indemniteRepository.findAll();
	}
	
	public Indemnite addNewIndemnite(Indemnite nouveau) {
		return indemniteRepository.save(nouveau);
	}
	
	public List<Indemnite> getAllIndemnitesByListId(List<Integer> ids){
		return indemniteRepository.findAllById(ids);
	}
	
	public Indemnite getById(int id) {
		return indemniteRepository.findById(id).orElse(null);
	}
	
	public Indemnite getByDesignation(String name) {
		return indemniteRepository.findByDesignationIndemnite(name);
	}
	
	public Indemnite updateIndeminite(int id, Indemnite nouveau) {
		Indemnite oldIndemnite = indemniteRepository.findById(id).orElse(null);
		oldIndemnite.setDesignationIndemnite(nouveau.getDesignationIndemnite());
		oldIndemnite.setMontantIndemnite(nouveau.getMontantIndemnite());
		oldIndemnite.setPourcentageIndemnite(nouveau.getPourcentageIndemnite());
		oldIndemnite.setDateModifiedIndemnite(nouveau.getDateModifiedIndemnite());
		oldIndemnite.setUserModifiedIndemnite(nouveau.getUserModifiedIndemnite());
		indemniteRepository.save(oldIndemnite);
		return oldIndemnite;
	}
	
	public void deleteIndemnite(int id) {
		indemniteRepository.deleteById(id);
	}
	
	public void deleteAllIndeminite() {
		indemniteRepository.deleteAll();
	}
	
	public void deleteSpecificIndeminite(List<Integer>ids) {
		indemniteRepository.deleteAllById(ids);
	}
}
