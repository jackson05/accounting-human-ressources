package com.salary.manager.assurance;

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
public class AssurenceController {
	
	@Autowired
	private AssuranceService assuranceService;
	 

	@RequestMapping(value = "/assurance", method = RequestMethod.POST)
	public Assurance addAssurance(@RequestBody Assurance assurance) { 
		return assuranceService.addAssurance(assurance);
	}
	
	@RequestMapping(value = "/assurance", method = RequestMethod.GET)
	public List<Assurance> listAssurance(){
		return assuranceService.getAllAssurance();
	}
	
	@RequestMapping(value = "/assurance/name/{name}", method = RequestMethod.GET) 
	public Assurance AssuranceByName(@PathVariable String name) {
		return assuranceService.getByDesignationAssurance(name);
	}
	
	@RequestMapping(value = "/assurance/id/{id}", method = RequestMethod.GET) 
	public Assurance AssuranceByName(@PathVariable int id) {
		return assuranceService.getByIdAssurance(id);
	}
	
	@PutMapping("/assurance/{id}")
	public Assurance updateAssurance(@PathVariable int id,@RequestBody Assurance Assurance) {
		return assuranceService.updateAssurance(id, Assurance);
	}
	
	@DeleteMapping("/assurance/{id}")
	public void deleteAssurance(@PathVariable int id) {
		assuranceService.deleteAssurance(id);
	}
}
