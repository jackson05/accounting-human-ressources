package com.salary.manager.departement;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.DeleteMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
public class DepartementController {
	
	@Autowired
	private DepartementService departementsService;
	 

	@RequestMapping(value = "/departement", method = RequestMethod.POST)
	public Departement adddepartement(@RequestBody Departement departement) { 
		return departementsService.addDepartement(departement);
	}
	
	@RequestMapping(value = "/departement", method = RequestMethod.GET)
	public List<Departement> listdepartement(){
		return departementsService.getAllDepartement();
	}
	
	@RequestMapping(value = "/departement/test/{id}", method = RequestMethod.GET)
	public List<Departement> listdepartementTest(@PathVariable int id){
		return departementsService.getDep(id);
	}
	@RequestMapping(value = "/departement/name/{designationDepartment}", method = RequestMethod.GET) 
	public Departement departementByName(@PathVariable String designationDepartment) {
		return departementsService.getByDesignationDepartement(designationDepartment);
	}
	
	@RequestMapping(value = "/departement/id/{id}", method = RequestMethod.GET) 
	public Departement departementByName(@PathVariable int id) {
		return departementsService.getByIdDepartement(id);
	}
	
	@PutMapping("/departement/{id}")
	public Departement updatedepartement(@PathVariable int id,@RequestBody Departement des) {
		return departementsService.updateDepartement(id, des);
	}
	
//	@PutMapping("/departement/{id}")
//	public Departement updatedepartement(@PathVariable int id,@RequestBody Departement des) {
//		return departementsService.miseAjour(id, des);
//	}
	
	@DeleteMapping("/departement/{id}")
	public void deletedepartement(@PathVariable int id) {
		departementsService.deleteDepartement(id);
	}
}
