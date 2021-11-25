package com.salary.manager.salaires;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaireBuckupRepository extends JpaRepository<SalaireBuckup, Integer> {

}
