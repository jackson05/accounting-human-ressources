package com.salary.manager.banque;

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
public class BanqueController {
	
	@Autowired
	private BanqueService banqueService;
	 

	@RequestMapping(value = "/banque", method = RequestMethod.POST)
	public Banque addBanque(@RequestBody Banque Banque) { 
		return banqueService.addBanque(Banque);
	}
	
	@RequestMapping(value = "/banque", method = RequestMethod.GET)
	public List<Banque> listBanque(){
		return banqueService.getAllBanque();
	}
	
	@RequestMapping(value = "/banque/name/{designationBanque}", method = RequestMethod.GET) 
	public Banque BanqueByName(@PathVariable String designationBanque) {
		return banqueService.getByDesignationBanque(designationBanque);
	}
	
	@RequestMapping(value = "/banque/id/{id}", method = RequestMethod.GET) 
	public Banque BanqueByName(@PathVariable int id) {
		return banqueService.getByIdBanque(id);
	}
	
	@PutMapping("/banque/{id}")
	public Banque updateBanque(@PathVariable int id,@RequestBody Banque Banque) {
		return banqueService.updateBanque(id, Banque);
	}
	
	@DeleteMapping("/banque/{id}")
	public void deleteBanque(@PathVariable int id) {
		banqueService.deleteBanque(id);
	}
}
