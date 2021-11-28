package com.salary.manager.contributionSocial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContributionSocialService {

	@Autowired
	private ContributionSocialRepository contreContributionSocialRepository;
	
	public ContributionSocial addContributionSocial(ContributionSocial contributionSocial) {
		return contreContributionSocialRepository.save(contributionSocial);
	}
	
	public List<ContributionSocial> getAllContributionSocial(){
		return contreContributionSocialRepository.findAll();
	}
	
	public ContributionSocial getContributionSocialByDesignation(String name){
		return contreContributionSocialRepository.findByDesignationContributionSocial(name);
	}
	
	public ContributionSocial getContributionSocialById(int id) {
		return contreContributionSocialRepository.findById(id).orElse(null);
	}
	
	public List<ContributionSocial> getContributionSocialByListIds(List<Integer> ids) {
		return contreContributionSocialRepository.findAllById(ids);
	}
	
	public ContributionSocial updateContributionSocial(int id, ContributionSocial nouveau) {
		ContributionSocial old = contreContributionSocialRepository.findById(id).orElse(null);
		old.setDesignationContributionSocial(nouveau.getDesignationContributionSocial());
		old.setPourcentageContributionSocial(nouveau.getPourcentageContributionSocial());
		old.setMontantContributionSocial(nouveau.getMontantContributionSocial());
		old.setDateModifiedContributionSocial(nouveau.getDateModifiedContributionSocial());
		old.setUserModifiedContributionSocial(nouveau.getUserModifiedContributionSocial());
		contreContributionSocialRepository.save(old);
		return old;
	}
	
	public void deleteContributionSocialById(int id) {
		contreContributionSocialRepository.deleteById(id);
	}
	
	public void deleteContributionSocialByListIds(List<Integer> ids) {
		contreContributionSocialRepository.deleteAllById(ids);
	}
	
	public void deleteAllContributionSocial() {
		contreContributionSocialRepository.deleteAll();
	}
}
