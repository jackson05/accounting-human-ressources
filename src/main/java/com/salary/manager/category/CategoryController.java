package com.salary.manager.category;

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
public class CategoryController {
	
	@Autowired
	private CategoryService CategoryService;
	 

	@RequestMapping(value = "/category", method = RequestMethod.POST)
	public Category addCategory(@RequestBody Category Category) { 
		return CategoryService.addCategory(Category);
	}
	
	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public List<Category> listCategory(){
		return CategoryService.getAllCategory();
	}
	
	@RequestMapping(value = "/category/name/{designationCategory}", method = RequestMethod.GET) 
	public Category CategoryByName(@PathVariable String designationCategory) {
		return CategoryService.getByDesignationCategory(designationCategory);
	}
	
	@RequestMapping(value = "/category/id/{id}", method = RequestMethod.GET) 
	public Category CategoryByName(@PathVariable int id) {
		return CategoryService.getByIdCategory(id);
	}
	
	@PutMapping("/category/{id}")
	public Category updateCategory(@PathVariable int id,@RequestBody Category Category) {
		return CategoryService.updateCategory(id, Category);
	}
	
	@DeleteMapping("/category/{id}")
	public void deleteCategory(@PathVariable int id) {
		CategoryService.deleteCategory(id);
	}
}
