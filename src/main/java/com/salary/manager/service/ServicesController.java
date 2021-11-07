package com.salary.manager.service;

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
public class ServicesController {
	
	@Autowired
	private ServicesService ServicesService;
	 

	@RequestMapping(value = "/service", method = RequestMethod.POST)
	public Services addServices(@RequestBody Services Services) { 
		return ServicesService.addServices(Services);
	}
	
	@RequestMapping(value = "/service", method = RequestMethod.GET)
	public List<Services> listServices(){
		return ServicesService.getAllServices();
	}
	
	@RequestMapping(value = "/service/name/{designationServices}", method = RequestMethod.GET) 
	public Services ServicesByName(@PathVariable String designationServices) {
		return ServicesService.getByDesignationServices(designationServices);
	}
	
	@RequestMapping(value = "/service/id/{id}", method = RequestMethod.GET) 
	public Services ServicesByName(@PathVariable int id) {
		return ServicesService.getByIdServices(id);
	}
	
	@PutMapping("/service/{id}")
	public Services updateServices(@PathVariable int id,@RequestBody Services Services) {
		return ServicesService.updateServices(id, Services);
	}
	
	@DeleteMapping("/service/{id}")
	public void deleteServices(@PathVariable int id) {
		ServicesService.deleteServices(id);
	}
}
