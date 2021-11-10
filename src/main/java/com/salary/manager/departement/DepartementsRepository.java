package com.salary.manager.departement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface DepartementsRepository extends JpaRepository<Departement, Integer> {

	Departement findByDesignationDepartment(String designationDepartment);
    
	@Modifying
	@Query(value = "UPDATE departement set designation_department= :designation WHERE id= :id", nativeQuery = true)
	void updateDepartementById(String designation, int id);
	
	@Query(value = "SELECT * FROM departement WHERE id=:id", nativeQuery = true)
	List<Departement> selectDepId(@Param("id") int id);
}
