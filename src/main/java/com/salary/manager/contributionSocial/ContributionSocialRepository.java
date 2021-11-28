package com.salary.manager.contributionSocial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContributionSocialRepository  extends JpaRepository<ContributionSocial, Integer>{

	ContributionSocial findByDesignationContributionSocial(String name);

}
