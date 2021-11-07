package com.salary.manager.level;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LevelService {
 
	@Autowired
	private LevelRepository LevelRepository;
	
    public Level addLevel(Level Level) {
    	LevelRepository.save(Level);
    	return Level;
    }
    
    public List<Level>  getAllLevel() {
    	return LevelRepository.findAll();
    }
    
    public Level getByIdLevel(int id) {
    	return LevelRepository.findById(id).orElse(null);
    }
    
    public Level getByDesignationLevel(String designationLevel) {
    	return LevelRepository.findByDesignationLevel(designationLevel);
    }
    
    public Level updateLevel(int id, Level Level) {
    	Level oldLevel = LevelRepository.findById(id).orElse(null);
    	oldLevel.setDesignationLevel(Level.getDesignationLevel());
    	oldLevel.setUserModifiedLevel(Level.getUserModifiedLevel());
    	oldLevel.setDateModifiedLevel(Level.getDateModifiedLevel()); 
    	LevelRepository.save(oldLevel);
    	return oldLevel;
    }
    
    public void deleteLevel (int id) {
    	LevelRepository.deleteById(id);
    }
}


















