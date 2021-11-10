package com.salary.manager.employe;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 

@Repository
@Transactional
public interface EmployesRepositorie extends JpaRepository<Employe, Integer> {

	Employe findEmployeByNom(String nom);
	
	@Modifying
	@Query(value = "UPDATE employe set version= :version WHERE id= :id", nativeQuery = true)
	void updateDepartementById(String version, int id);
	
	@Modifying
	@Query(value = "INSERT into employe_buckup VALUES (:employee)", nativeQuery = true)
	void insertIntoBuckup(Employe employee);
	
	@Query(value = "SELECT * FROM empoyee WHERE id=:id", nativeQuery = true)
	List<Employe> selectEmployeId(@Param("id") int id);

}
