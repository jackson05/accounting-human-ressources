package com.salary.manager.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
 
	@Autowired
	private CategoryRepository categoryRepository;
	
    public Category addCategory(Category Category) {
    	categoryRepository.save(Category);
    	return Category;
    }
    
    public List<Category>  getAllCategory() {
    	return categoryRepository.findAll();
    }
    
    public Category getByIdCategory(int id) {
    	return categoryRepository.findById(id).orElse(null);
    }
    
    public Category getByDesignationCategory(String designationCategory) {
    	return categoryRepository.findByDesignationCategory(designationCategory);
    }
    
    public Category updateCategory(int id, Category Category) {
    	Category oldCategory = categoryRepository.findById(id).orElse(null);
    	oldCategory.setDesignationCategory(Category.getDesignationCategory());
    	oldCategory.setUserModifiedCategory(Category.getUserModifiedCategory());
    	oldCategory.setDateModifiedCategory(Category.getDateModifiedCategory()); 
    	categoryRepository.save(oldCategory);
    	return oldCategory;
    }
    
    public void deleteCategory (int id) {
    	categoryRepository.deleteById(id);
    }
}


















