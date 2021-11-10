package com.salary.manager.fonction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FonctionRepository extends JpaRepository<Fonction, Integer> {

	Fonction findByDesignationFonction(String designationFonction);
  
}
