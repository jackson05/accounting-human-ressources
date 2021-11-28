package com.salary.manager.salaires;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class SalaireController {

	@Autowired
	private SalaireService salaireService;
	
	@RequestMapping(value = "/salaire", method = RequestMethod.POST)
	public Salaire AddData(@RequestBody Salaire nouveau) {
		return  salaireService.addSalaireNouveau(nouveau);
	}
	
	@RequestMapping(value = "/salaire/{id}", method = RequestMethod.PUT)
	public Salaire updateData(@PathVariable int id,@RequestBody Salaire nouveau) {
		return salaireService.updateSalaire(id, nouveau);
	}
	
	@RequestMapping(value = "/salaire", method = RequestMethod.GET)
	public List<Salaire> getAllData(){
		return salaireService.getAllSalaire();
	}
	
	@RequestMapping(value = "/salaire/id", method = RequestMethod.GET)
	public Salaire getDataById(@PathVariable int id) {
		return salaireService.getSalaireById(id);
	}
	
	@RequestMapping(value = "/salaire/employe/{employeeId}", method = RequestMethod.GET)
	public List<Salaire> getDataByEmploye(@PathVariable int employeeId) {
		return salaireService.getSalaireByEmployeId(employeeId);
	}
	
	@RequestMapping(value = "/salaire/{id}", method = RequestMethod.DELETE)
	public void deleteDataById(@PathVariable int id) {
		salaireService.deleteSalaire(id);
	}
	
	@RequestMapping(value = "/salaire", method = RequestMethod.DELETE)
	public void deleteDataByList(@RequestBody List<Integer> ids) {
		salaireService.deleteListSalaire(ids);
	}
}
