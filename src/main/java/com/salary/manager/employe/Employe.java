package com.salary.manager.employe;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.ManyToOne;

import com.salary.manager.agences.Agence;
import com.salary.manager.banque.Banque;
import com.salary.manager.categorie.Categorie;
import com.salary.manager.fonction.Fonction;
import com.salary.manager.level.Level;
import com.salary.manager.service.Services;

@Entity() 
public class Employe {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String matricule;
	private String nom;
	private String prenom;
	private int anneeNaissance;
	
	private String genre;
	private String etatCivile;
	 
	private int levelId;
	private String conjointFonction;
	
	private String telephone;
	private String email;
	private String matriculeInss;
	private int nombreDenfant;
	
	private float salaireDeBase;
	 
	private int serviceId;
	private int fonctionId;
	private int agenceId;
	private int categorieId; 
	private int banqueId;
	
	private String compte;
	private String dateEmbauche;
	private String dateCreated; 
	private String dateModified;
	private int userCreated;
	private int userModified; 
	
	@Column(name="version", columnDefinition="int(2) NOT NULL default '1'")
	private int version;
	
	private int etat;


	public Employe(Employe employee) {
		super();
		this.id = employee.getId();
		this.matricule = employee.getMatricule();
		this.nom = employee.getNom();
		this.prenom = employee.getPrenom();
		this.anneeNaissance = employee.getAnneeNaissance();
		this.genre = employee.getGenre();
		this.etatCivile = employee.getEtatCivile();
		this.levelId = employee.getLevelId();
		this.conjointFonction = employee.getConjointFonction();
		this.telephone = employee.getTelephone();
		this.email = employee.getEmail();
		this.matriculeInss = employee.getMatriculeInss();
		this.nombreDenfant = employee.getNombreDenfant();
		this.salaireDeBase = employee.getSalaireDeBase();
		this.serviceId = employee.getServiceId();
		this.fonctionId = employee.getFonctionId();
		this.agenceId = employee.getAgenceId();
		this.categorieId = employee.getCategorieId();
		this.banqueId = employee.getBanqueId();
		this.compte = employee.getCompte();
		this.dateEmbauche = employee.getDateEmbauche();
		this.dateCreated = employee.getDateCreated();
		this.dateModified = employee.getDateModified();
		this.userCreated = employee.getUserCreated();
		this.userModified = employee.getUserModified();
		this.version = employee.getVersion();
		this.etat = employee.getEtat();
	}


	public Employe() {
		super();
	}

	
	public int getLevelId() {
		return levelId;
	}


	public void setLevelId(int levelID) {
		this.levelId = levelID;
	}


	public int getServiceId() {
		return serviceId;
	}


	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}


	public int getFonctionId() {
		return fonctionId;
	}


	public void setFonctionId(int fonctionId) {
		this.fonctionId = fonctionId;
	}


	public int getAgenceId() {
		return agenceId;
	}


	public void setAgenceId(int agenceId) {
		this.agenceId = agenceId;
	}


	public int getCategorieId() {
		return categorieId;
	}


	public void setCategorieId(int categorieId) {
		this.categorieId = categorieId;
	}


	public int getBanqueId() {
		return banqueId;
	}


	public void setBanqueId(int banqueId) {
		this.banqueId = banqueId;
	}


	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}


	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getEtatCivile() {
		return etatCivile;
	}

	public void setEtatCivile(String etatCivile) {
		this.etatCivile = etatCivile;
	}

	 
	public String getConjointFonction() {
		return conjointFonction;
	}

	public void setConjointFonction(String conjointFonction) {
		this.conjointFonction = conjointFonction;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatriculeInss() {
		return matriculeInss;
	}

	public void setMatriculeInss(String matriculeInss) {
		this.matriculeInss = matriculeInss;
	}

	public int getNombreDenfant() {
		return nombreDenfant;
	}

	public void setNombreDenfant(int nombreDenfant) {
		this.nombreDenfant = nombreDenfant;
	}

	public float getSalaireDeBase() {
		return salaireDeBase;
	}

	public void setSalaireDeBase(float salaireDeBase) {
		this.salaireDeBase = salaireDeBase;
	}
 
 
	public String getCompte() {
		return compte;
	}

	public void setCompte(String compte) {
		this.compte = compte;
	}

	public String getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateModified() {
		return dateModified;
	}

	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}

	public int getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(int userCreated) {
		this.userCreated = userCreated;
	}

	public int getUserModified() {
		return userModified;
	}

	public void setUserModified(int userModified) {
		this.userModified = userModified;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}
}
