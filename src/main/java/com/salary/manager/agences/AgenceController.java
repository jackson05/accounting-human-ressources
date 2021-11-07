package com.salary.manager.agences;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.DeleteMapping; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgenceController {
	
	@Autowired
	private AgencesService agencesService;
	 

	@RequestMapping(value = "/agence", method = RequestMethod.POST)
	public Agence addAgence(@RequestBody Agence agence) { 
		return agencesService.addAgence(agence);
	}
	
	@RequestMapping(value = "/agence", method = RequestMethod.GET)
	public List<Agence> listAgence(){
		return agencesService.getAllAgence();
	}
	
	@RequestMapping(value = "/agence/name/{name}", method = RequestMethod.GET) 
	public Agence agenceByName(@PathVariable String name) {
		return agencesService.getByDesignationAgence(name);
	}
	
	@RequestMapping(value = "/agence/id/{id}", method = RequestMethod.GET) 
	public Agence agenceByName(@PathVariable int id) {
		return agencesService.getByIdAgence(id);
	}
	
	@PutMapping("/agence/{id}")
	public Agence updateAgence(@PathVariable int id,@RequestBody Agence agence) {
		return agencesService.updateAgence(id, agence);
	}
	
	@DeleteMapping("/agence/{id}")
	public void deleteAgence(@PathVariable int id) {
		agencesService.deleteAgence(id);
	}
}
