package com.salary.manager.departement;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nkeshicar
 *
 */
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
    
    /*
     * custom query of update
     * 1er etapes creation de l'objet EntityManager
    */
    EntityManager ent;
    public Departement customUpdateDepartement(Departement departement) {
    	
    	ent.createNativeQuery("UPDATE departement SET date_created_departement=?1,date_modified_departement=?2,"
    			+ "designation_department=?3,user_created_departement=?4,user_modified_departement=?5 WHERE id=?6")
    		.setParameter(1, departement.getDateCreatedDepartement())
    		.setParameter(2, departement.getDateModifiedDepartement())
    		.setParameter(3, departement.getDesignationDepartment())
    		.setParameter(4, departement.getUserCreatedDepartement())
    		.setParameter(5, departement.getUserModifiedDepartement())
    		.setParameter(6, departement.getId())
    		.executeUpdate();
    	 
    	return departement;
    }
    
    public Departement miseAjour(int id, Departement des) {
    	System.out.println("--"+des.getDesignationDepartment());
    	departementsRepository.updateDepartementById(des.getDesignationDepartment(), id);
    	return des;
    }
    
    public List<Departement> getDep(int id) { 
    	return departementsRepository.selectDepId(id);
    }
}


















