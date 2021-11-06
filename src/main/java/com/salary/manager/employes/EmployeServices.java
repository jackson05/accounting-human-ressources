package com.salary.manager.employes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeServices {
	
	@Autowired
	private EmployesRepository employesRepository;

	public Employe addEmploye(Employe employe) {
		employesRepository.save(employe);
		return employe;
	}
	
	public List<Employe> addListEmploye(List<Employe> employe) {
		return employesRepository.saveAll(employe);
	}
	
	public List<Employe> getAllEmploye(){
		return employesRepository.findAll();
	}
	
	public Employe getEmployeByID(int id) {
		return employesRepository.findById(id).orElse(null);
	}
	
	public Employe getEmployeByName(String name) {
		return employesRepository.findEmployeByName(name);
	}
	
	public Employe updateEmploye(int id,Employe employe) {
		Employe oldData = employesRepository.findById(id).orElse(null);
		oldData.setAgenceId(employe.getAgenceId());
		oldData.setAnneeNaissance(employe.getAnneeNaissance());
		oldData.setBanqueId(employe.getBanqueId());
		
		oldData.setCategoryId(employe.getCategoryId());
		oldData.setCompte(employe.getCompte());
		oldData.setConjointFonction(employe.getConjointFonction());
		
		oldData.setDateEmbauche(employe.getDateEmbauche());
		oldData.setDateModified(employe.getDateModified());
		oldData.setNom(employe.getNom());
		
		oldData.setPrenom(employe.getPrenom());
		oldData.setEmail(employe.getEmail());
		oldData.setEtat(employe.getEtat());
		oldData.setEtatCivile(employe.getEtatCivile());
		
		oldData.setGenre(employe.getGenre());
		oldData.setMatricule(employe.getMatricule());
		oldData.setMatriculeInss(employe.getMatriculeInss());
		
		oldData.setNombreDenfant(employe.getNombreDenfant());
		oldData.setSalaireDeBase(employe.getSalaireDeBase());
		oldData.setLevelId(employe.getLevelId());
		
		oldData.setAgenceId(employe.getAgenceId());
		oldData.setServiceId(employe.getServiceId());
		oldData.setTelephone(employe.getTelephone());
		oldData.setUserModified(employe.getUserModified());
		
		employesRepository.save(oldData);
		return employe;
	}
}
