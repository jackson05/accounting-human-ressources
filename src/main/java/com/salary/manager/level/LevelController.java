package com.salary.manager.level;

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
public class LevelController {
	
	@Autowired
	private LevelService LevelService;
	 

	@RequestMapping(value = "/level", method = RequestMethod.POST)
	public Level addLevel(@RequestBody Level Level) { 
		return LevelService.addLevel(Level);
	}
	
	@RequestMapping(value = "/level", method = RequestMethod.GET)
	public List<Level> listLevel(){
		return LevelService.getAllLevel();
	}
	
	@RequestMapping(value = "/level/name/{designationLevel}", method = RequestMethod.GET) 
	public Level LevelByName(@PathVariable String designationLevel) {
		return LevelService.getByDesignationLevel(designationLevel);
	}
	
	@RequestMapping(value = "/level/id/{id}", method = RequestMethod.GET) 
	public Level LevelByName(@PathVariable int id) {
		return LevelService.getByIdLevel(id);
	}
	
	@PutMapping("/level/{id}")
	public Level updateLevel(@PathVariable int id,@RequestBody Level Level) {
		return LevelService.updateLevel(id, Level);
	}
	
	@DeleteMapping("/level/{id}")
	public void deleteLevel(@PathVariable int id) {
		LevelService.deleteLevel(id);
	}
}
