package com.salary.manager.salaires;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface SalaireRepository extends JpaRepository<Salaire, Integer> {

	List<Salaire> getByEmployeeIdInSalaire(int employeId);

	@Modifying
	@Query(value = "INSERT INTO `salaire_buckup` ( `autre_pension`, `contribution_social`, `created_by_salaire`, `created_date_salaire`, "
			+ "`employee_id_in_salaire`, `heure_par_jour`, `indeminite_transport`, `jour_par_mois`, `jours_ouvrable`, "
			+ "`modified_by_salaire`, `modified_date_salaire`, `salaire_de_base`, `salaire_id`, `salaire_net`, "
			+ "`status_salarie`, `type_paiment`, `version`, `operation`) "
			+ "VALUES "
			+ "(:autre_pension, :contribution_social, :created_by_salaire, :created_date_salaire, :employee_id_in_salaire,"
			+ " :heure_par_jour, :indeminite_transport, :jour_par_mois, :jours_ouvrable, :modified_by_salaire, "
			+ ":modified_date_salaire, :salaire_de_base, :salaire_id, :salaire_net, :status_salarie, :type_paiment, "
			+ ":version, :operation)", nativeQuery = true)
	void InsertBuckUPsalaire(@Param("autre_pension") int autrePension,@Param("contribution_social") int contributionSocial,
			@Param("created_by_salaire") int createdBySalaire, 
			@Param("created_date_salaire") String createdDateSalaire,@Param("employee_id_in_salaire") int employeeIdInSalaire, 
			@Param("heure_par_jour") int heureParJour,@Param("indeminite_transport") int indeminiteTransport,@Param("jour_par_mois") int jourParMois, 
			@Param("jours_ouvrable") int joursOuvrable,@Param("modified_by_salaire") int modifiedBySalaire,
			@Param("modified_date_salaire") String modifiedDateSalaire, 
			@Param("salaire_de_base") int salaireBeBase,@Param("salaire_id") int salaireId,@Param("salaire_net") int salaireNet, 
			@Param("status_salarie") int statusSalarie,@Param("type_paiment") String typePaiment,@Param("version") int version,@Param("operation") String operation);
}
