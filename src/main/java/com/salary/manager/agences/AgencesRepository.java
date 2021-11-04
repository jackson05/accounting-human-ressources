package com.salary.manager.agences;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgencesRepository extends JpaRepository<Agence, Integer> {

	Agence findByName(String name);
  
}
