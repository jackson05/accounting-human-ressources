package com.salary.manager.employe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployesRepositorie extends JpaRepository<Employe, Integer> {

	Employe findEmployeByNom(String nom);

}
