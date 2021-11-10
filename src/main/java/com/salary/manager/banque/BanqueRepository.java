package com.salary.manager.banque;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanqueRepository extends JpaRepository<Banque, Integer> {

	Banque findByDesignationBanque(String designationBanque);
  
}
