package com.salary.manager.indeminites;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndemniteRepository extends JpaRepository<Indemnite, Integer> {

	Indemnite findByDesignationIndemnite(String name);

}
