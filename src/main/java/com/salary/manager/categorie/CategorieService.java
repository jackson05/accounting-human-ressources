package com.salary.manager.categorie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {
 
	@Autowired
	private CategorieRepository categorieRepository;
	
    public Categorie addCategorie(Categorie categorie) {
    	categorieRepository.save(categorie);
    	return categorie;
    }
    
    public List<Categorie>  getAllCategorie() {
    	return categorieRepository.findAll();
    }
    
    public Categorie getByIdCategorie(int id) {
    	return categorieRepository.findById(id).orElse(null);
    }
    
    public Categorie getByDesignationCategorie(String designationcategorie) {
    	return categorieRepository.findByDesignationCategorie(designationcategorie);
    }
    
    public Categorie updateCategorie(int id, Categorie categorie) {
    	Categorie oldcategorie = categorieRepository.findById(id).orElse(null);
    	oldcategorie.setDesignationCategorie(categorie.getDesignationCategorie());
    	oldcategorie.setUserModifiedCategorie(categorie.getUserModifiedCategorie());
    	oldcategorie.setDateModifiedCategorie(categorie.getDateModifiedCategorie()); 
    	categorieRepository.save(oldcategorie);
    	return oldcategorie;
    }
    
    public void deleteCategorie (int id) {
    	categorieRepository.deleteById(id);
    }
}


















