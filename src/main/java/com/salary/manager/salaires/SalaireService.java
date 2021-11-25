package com.salary.manager.salaires;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaireService {

	@Autowired
	private SalaireRepository salaireRepository;
	
	public Salaire addSalaireNouveau(Salaire nouveau) {
		return salaireRepository.save(nouveau);
	}
	
	public Salaire getSalaireById(int id) {
		return salaireRepository.findById(id).orElse(null);
	}
	
	public List<Salaire> getAllSalaire(){
		return salaireRepository.findAll();
	}
	
	public List<Salaire> getAllSalireById(List<Integer> ids){
		return salaireRepository.findAllById(ids);
	}
	
	
	public List<Salaire> getSalaireByEmployeId(int employeId) {
		return salaireRepository.getByEmployeeIdInSalaire(employeId);
	}
	
	public Salaire updateSalaire(int id, Salaire nouveau) {
		Salaire oldSalaire = salaireRepository.findById(id).orElse(null);
		salaireRepository.InsertBuckUPsalaire(
				oldSalaire.getAutrePension(), oldSalaire.getContributionSocial(), oldSalaire.getCreatedBySalaire(), 
				oldSalaire.getCreatedDateSalaire(), oldSalaire.getEmployeeIdInSalaire(), oldSalaire.getHeureParJour(), 
				oldSalaire.getIndeminiteTransport(), oldSalaire.getJourParMois(), oldSalaire.getJoursOuvrable(), oldSalaire.getModifiedBySalaire(), 
				oldSalaire.getModifiedDateSalaire(), oldSalaire.getSalaireDeBase(), oldSalaire.getSalaireId(), oldSalaire.getSalaireNet(), 
				oldSalaire.getStatusSalarie(), oldSalaire.getTypePaiment(), oldSalaire.getVersion());
		
		oldSalaire.setEmployeeIdInSalaire(nouveau.getEmployeeIdInSalaire());
		oldSalaire.setSalaireDeBase(nouveau.getSalaireDeBase());
		oldSalaire.setAutrePension(nouveau.getAutrePension());
		oldSalaire.setContributionSocial(nouveau.getContributionSocial());
		oldSalaire.setHeureParJour(nouveau.getHeureParJour());
		oldSalaire.setIndeminiteTransport(nouveau.getIndeminiteTransport());
		oldSalaire.setJourParMois(nouveau.getJourParMois());
		oldSalaire.setJoursOuvrable(nouveau.getJoursOuvrable());
		oldSalaire.setSalaireDeBase(nouveau.getSalaireDeBase());
		oldSalaire.setSalaireNet(nouveau.getSalaireDeBase());
		oldSalaire.setTypePaiment(nouveau.getTypePaiment()); 
		oldSalaire.setModifiedDateSalaire(nouveau.getModifiedDateSalaire());
		oldSalaire.setModifiedBySalaire(nouveau.getModifiedBySalaire());
		salaireRepository.save(oldSalaire);
		return oldSalaire;
	}
	
	
	public void deleteSalaire(int id) {
		Salaire oldSalaire = salaireRepository.findById(id).orElse(null);
		salaireRepository.InsertBuckUPsalaire(
				oldSalaire.getAutrePension(), oldSalaire.getContributionSocial(), oldSalaire.getCreatedBySalaire(), 
				oldSalaire.getCreatedDateSalaire(), oldSalaire.getEmployeeIdInSalaire(), oldSalaire.getHeureParJour(), 
				oldSalaire.getIndeminiteTransport(), oldSalaire.getJourParMois(), oldSalaire.getJoursOuvrable(), oldSalaire.getModifiedBySalaire(), 
				oldSalaire.getModifiedDateSalaire(), oldSalaire.getSalaireDeBase(), oldSalaire.getSalaireId(), oldSalaire.getSalaireNet(), 
				oldSalaire.getStatusSalarie(), oldSalaire.getTypePaiment(), oldSalaire.getVersion());
		salaireRepository.deleteById(id);
	}
	
	public void deleteListSalaire(List<Integer> ids) {
		List<Salaire> allSalaire = salaireRepository.findAllById(ids);
		for (Iterator iterator = allSalaire.iterator(); iterator.hasNext();) {
			Salaire oldSalaire = (Salaire) iterator.next();
			salaireRepository.InsertBuckUPsalaire(
					oldSalaire.getAutrePension(), oldSalaire.getContributionSocial(), oldSalaire.getCreatedBySalaire(), 
					oldSalaire.getCreatedDateSalaire(), oldSalaire.getEmployeeIdInSalaire(), oldSalaire.getHeureParJour(), 
					oldSalaire.getIndeminiteTransport(), oldSalaire.getJourParMois(), oldSalaire.getJoursOuvrable(), oldSalaire.getModifiedBySalaire(), 
					oldSalaire.getModifiedDateSalaire(), oldSalaire.getSalaireDeBase(), oldSalaire.getSalaireId(), oldSalaire.getSalaireNet(), 
					oldSalaire.getStatusSalarie(), oldSalaire.getTypePaiment(), oldSalaire.getVersion());
		}
       
		salaireRepository.deleteAllById(ids);
	}
	
	
}
