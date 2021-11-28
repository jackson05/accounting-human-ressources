package com.salary.manager.categorie;

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
public class CategorieController {
	
	@Autowired
	private CategorieService CategorieService;
	 

	@RequestMapping(value = "/categorie", method = RequestMethod.POST)
	public Categorie addCategorie(@RequestBody Categorie Categorie) { 
		return CategorieService.addCategorie(Categorie);
	}
	
	@RequestMapping(value = "/categorie", method = RequestMethod.GET)
	public List<Categorie> listCategorie(){
		return CategorieService.getAllCategorie();
	}
	
	@RequestMapping(value = "/categorie/name/{designationCategorie}", method = RequestMethod.GET) 
	public Categorie CategorieByName(@PathVariable String designationCategorie) {
		return CategorieService.getByDesignationCategorie(designationCategorie);
	}
	
	@RequestMapping(value = "/categorie/id/{id}", method = RequestMethod.GET) 
	public Categorie CategorieByName(@PathVariable int id) {
		return CategorieService.getByIdCategorie(id);
	}
	
	@PutMapping("/categorie/{id}")
	public Categorie updateCategorie(@PathVariable int id,@RequestBody Categorie Categorie) {
		return CategorieService.updateCategorie(id, Categorie);
	}
	
	@DeleteMapping("/categorie/{id}")
	public void deleteCategorie(@PathVariable int id) {
		CategorieService.deleteCategorie(id);
	}
}
