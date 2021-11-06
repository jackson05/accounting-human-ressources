package com.salary.manager.employes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employe {

	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String matricule;
	private String nom;
	private String prenom;
	private String anneeNaissance;
	
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
	private int agenceId;
	private String categoryId;
	
	private int banqueId;
	private String compte;
	private String dateEmbauche;
	private String dateCreated;
	
	private String dateModified;
	private int userCreated;
	private int userModified;
	private int version;
	
	private int etat;

	public Employe() {
		super();
	}

	public Employe(int id, String matricule, String nom, String prenom, String anneeNaissance, String genre,
			String etatCivile, int levelId, String conjointFonction, String telephone, String email,
			String matriculeInss, int nombreDenfant, float salaireDeBase, int serviceId, int agenceId,
			String categoryId, int banqueId, String compte, String dateEmbauche, String dateCreated,
			String dateModified, int userCreated, int userModified, int version, int etat) {
		super();
		this.id = id;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.anneeNaissance = anneeNaissance;
		this.genre = genre;
		this.etatCivile = etatCivile;
		this.levelId = levelId;
		this.conjointFonction = conjointFonction;
		this.telephone = telephone;
		this.email = email;
		this.matriculeInss = matriculeInss;
		this.nombreDenfant = nombreDenfant;
		this.salaireDeBase = salaireDeBase;
		this.serviceId = serviceId;
		this.agenceId = agenceId;
		this.categoryId = categoryId;
		this.banqueId = banqueId;
		this.compte = compte;
		this.dateEmbauche = dateEmbauche;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.userCreated = userCreated;
		this.userModified = userModified;
		this.version = version;
		this.etat = etat;
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

	public String getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(String anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
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

	public int getLevelId() {
		return levelId;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
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

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public int getAgenceId() {
		return agenceId;
	}

	public void setAgenceId(int agenceId) {
		this.agenceId = agenceId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public int getBanqueId() {
		return banqueId;
	}

	public void setBanqueId(int banqueId) {
		this.banqueId = banqueId;
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
