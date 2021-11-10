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
	private String anneeNaissance;
	
	private String genre;
	private String etatCivile;
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Level.class)
	private Level level;
	private String conjointFonction;
	
	private String telephone;
	private String email;
	private String matriculeInss;
	private int nombreDenfant;
	
	private float salaireDeBase;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Services.class)
	private Services service;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Fonction.class)
	private Fonction fonction;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Agence.class)
	private Agence agence;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Categorie.class)
	private int categorie;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Banque.class)
	private Banque banque;
	private String compte;
	private String dateEmbauche;
	private String dateCreated;
	
	private String dateModified;
	private int userCreated;
	private int userModified;
	
	@Column(name="version", columnDefinition="int(2) NOT NULL default '1'")
	private int version;
	
	private int etat;

	public Employe() {
		super();
	}

	public Employe(int id, String matricule, String nom, String prenom, String anneeNaissance, String genre,
			String etatCivile, Level level, String conjointFonction, String telephone, String email,
			String matriculeInss, int nombreDenfant, float salaireDeBase, Services service, Fonction fonction,
			Agence agence, int category, Banque banque, String compte, String dateEmbauche, String dateCreated,
			String dateModified, int userCreated, int userModified, int version, int etat) {
		super();
		this.id = id;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.anneeNaissance = anneeNaissance;
		this.genre = genre;
		this.etatCivile = etatCivile;
		this.level = level;
		this.conjointFonction = conjointFonction;
		this.telephone = telephone;
		this.email = email;
		this.matriculeInss = matriculeInss;
		this.nombreDenfant = nombreDenfant;
		this.salaireDeBase = salaireDeBase;
		this.service = service;
		this.fonction = fonction;
		this.agence = agence;
		this.categorie = category;
		this.banque = banque;
		this.compte = compte;
		this.dateEmbauche = dateEmbauche;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.userCreated = userCreated;
		this.userModified = userModified;
		this.version = version;
		this.etat = etat;
	}


	public Level getLevel() {
		return level;
	}


	public void setLevel(Level level) {
		this.level = level;
	}


	public Services getService() {
		return service;
	}


	public void setService(Services service) {
		this.service = service;
	}


	public Fonction getFonction() {
		return fonction;
	}


	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}


	public Agence getAgence() {
		return agence;
	}


	public void setAgence(Agence agence) {
		this.agence = agence;
	}


	public int getCategory() {
		return categorie;
	}


	public void setCategory(int category) {
		this.categorie = category;
	}


	public Banque getBanque() {
		return banque;
	}


	public void setBanque(Banque banque) {
		this.banque = banque;
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
