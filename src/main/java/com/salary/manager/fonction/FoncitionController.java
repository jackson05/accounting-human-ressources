package com.salary.manager.fonction;

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
public class FoncitionController {
	
	@Autowired
	private FonctionService FonctionService;
	 

	@RequestMapping(value = "/fonction", method = RequestMethod.POST)
	public Fonction addFonction(@RequestBody Fonction Fonction) { 
		return FonctionService.addFonction(Fonction);
	}
	
	@RequestMapping(value = "/fonction", method = RequestMethod.GET)
	public List<Fonction> listFonction(){
		return FonctionService.getAllFonction();
	}
	
	@RequestMapping(value = "/fonction/name/{designationFonction}", method = RequestMethod.GET) 
	public Fonction FonctionByName(@PathVariable String designationFonction) {
		return FonctionService.getByDesignationFonction(designationFonction);
	}
	
	@RequestMapping(value = "/fonction/id/{id}", method = RequestMethod.GET) 
	public Fonction FonctionByName(@PathVariable int id) {
		return FonctionService.getByIdFonction(id);
	}
	
	@PutMapping("/fonction/{id}")
	public Fonction updateFonction(@PathVariable int id,@RequestBody Fonction Fonction) {
		return FonctionService.updateFonction(id, Fonction);
	}
	
	@DeleteMapping("/fonction/{id}")
	public void deleteFonction(@PathVariable int id) {
		FonctionService.deleteFonction(id);
	}
}
