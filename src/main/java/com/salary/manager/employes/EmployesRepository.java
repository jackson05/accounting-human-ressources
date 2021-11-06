package com.salary.manager.employes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployesRepository extends JpaRepository<Employe, Integer> {

	Employe findEmployeByName(String name);

}
