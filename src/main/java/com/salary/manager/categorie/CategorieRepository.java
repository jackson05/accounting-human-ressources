package com.salary.manager.categorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

	Categorie findByDesignationCategorie(String designationCategory);
  
}
