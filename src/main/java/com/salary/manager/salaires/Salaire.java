package com.salary.manager.salaires;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salaire {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int salaireId;
		private int employeeIdInSalaire;
		private int salaireDeBase ;
		private int salaireNet ;
		private int heureParJour ;
	    private int jourParMois ;
		private int joursOuvrable ;
		private int indeminiteTransport ;
		private int contributionSocial;
		private int autrePension ; 
		private String typePaiment ;
		private int  statusSalarie ;
		private String createdDateSalaire ;
		private int createdBySalaire ;
		private String modifiedDateSalaire ;
		private int modifiedBySalaire ;
		
		@Column(name="version", columnDefinition="int(2) NOT NULL default '1'")
		private int version;
		public Salaire() {
			super();
		}
		public Salaire(Salaire salaire) {
			super();
			this.salaireId = salaire.getSalaireId();
			this.employeeIdInSalaire = salaire.getEmployeeIdInSalaire();
			this.salaireDeBase = salaire.getSalaireDeBase();
			this.salaireNet = salaire.getSalaireNet();
			this.heureParJour = salaire.getHeureParJour();
			this.jourParMois = salaire.getJourParMois();
			this.joursOuvrable = salaire.getJoursOuvrable();
			this.indeminiteTransport = salaire.getIndeminiteTransport();
			this.contributionSocial = salaire.getContributionSocial();
			this.autrePension = salaire.getAutrePension();
			this.typePaiment = salaire.getTypePaiment();
			this.statusSalarie = salaire.getStatusSalarie();
			this.createdDateSalaire = salaire.getCreatedDateSalaire();
			this.createdBySalaire = salaire.getCreatedBySalaire();
			this.modifiedDateSalaire = salaire.getModifiedDateSalaire();
			this.modifiedBySalaire = salaire.getModifiedBySalaire();
			this.version = salaire.getVersion();
		}
		
		
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		public int getSalaireId() {
			return salaireId;
		}
		public void setSalaireId(int salaireId) {
			this.salaireId = salaireId;
		}
		public int getEmployeeIdInSalaire() {
			return employeeIdInSalaire;
		}
		public void setEmployeeIdInSalaire(int employeeIdInSalaire) {
			this.employeeIdInSalaire = employeeIdInSalaire;
		}
		public int getSalaireDeBase() {
			return salaireDeBase;
		}
		public void setSalaireDeBase(int salaireDeBase) {
			this.salaireDeBase = salaireDeBase;
		}
		public int getSalaireNet() {
			return salaireNet;
		}
		public void setSalaireNet(int salaireNet) {
			this.salaireNet = salaireNet;
		}
		public int getHeureParJour() {
			return heureParJour;
		}
		public void setHeureParJour(int heureParJour) {
			this.heureParJour = heureParJour;
		}
		public int getJourParMois() {
			return jourParMois;
		}
		public void setJourParMois(int jourParMois) {
			this.jourParMois = jourParMois;
		}
		public int getJoursOuvrable() {
			return joursOuvrable;
		}
		public void setJoursOuvrable(int joursOuvrable) {
			this.joursOuvrable = joursOuvrable;
		}
		public int getIndeminiteTransport() {
			return indeminiteTransport;
		}
		public void setIndeminiteTransport(int indeminiteTransport) {
			this.indeminiteTransport = indeminiteTransport;
		}
		public int getContributionSocial() {
			return contributionSocial;
		}
		public void setContributionSocial(int contributionSocial) {
			this.contributionSocial = contributionSocial;
		}
		public int getAutrePension() {
			return autrePension;
		}
		public void setAutrePension(int autrePension) {
			this.autrePension = autrePension;
		}
		public String getTypePaiment() {
			return typePaiment;
		}
		public void setTypePaiment(String typePaiment) {
			this.typePaiment = typePaiment;
		}
		public int getStatusSalarie() {
			return statusSalarie;
		}
		public void setStatusSalarie(int statusSalarie) {
			this.statusSalarie = statusSalarie;
		}
		public String getCreatedDateSalaire() {
			return createdDateSalaire;
		}
		public void setCreatedDateSalaire(String createdDateSalaire) {
			this.createdDateSalaire = createdDateSalaire;
		}
	 
		public String getModifiedDateSalaire() {
			return modifiedDateSalaire;
		}
		public void setModifiedDateSalaire(String modifiedDateSalaire) {
			this.modifiedDateSalaire = modifiedDateSalaire;
		}
		public int getCreatedBySalaire() {
			return createdBySalaire;
		}
		public void setCreatedBySalaire(int createdBySalaire) {
			this.createdBySalaire = createdBySalaire;
		}
		public int getModifiedBySalaire() {
			return modifiedBySalaire;
		}
		public void setModifiedBySalaire(int modifiedBySalaire) {
			this.modifiedBySalaire = modifiedBySalaire;
		}
		 
	 
}
