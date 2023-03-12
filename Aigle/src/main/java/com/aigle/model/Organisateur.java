/***********************************************************************
 * Module:  Organisateur.java
 * Author:  HP
 * Purpose: Defines the Class Organisateur
 ***********************************************************************/
package com.aigle.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Organisateur {
	
	@Id
	@GeneratedValue
	private long idOrganisateur;
	private java.lang.String description;
	private java.lang.String nom;
	private java.lang.String email;
	private java.lang.String motDePasse;
	private java.lang.String addresse;
	private int numTelephone;

	public long getIdOrganisateur() {
		return idOrganisateur;
	}

	public void setIdOrganisateur(long idOrganisateur) {
		this.idOrganisateur = idOrganisateur;
	}

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getNom() {
		return nom;
	}

	public void setNom(java.lang.String nom) {
		this.nom = nom;
	}

	public java.lang.String getEmail() {
		return email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(java.lang.String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public java.lang.String getAddresse() {
		return addresse;
	}

	public void setAddresse(java.lang.String addresse) {
		this.addresse = addresse;
	}

	public int getNumTelephone() {
		return numTelephone;
	}

	public void setNumTelephone(int numTelephone) {
		this.numTelephone = numTelephone;
	}

	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "organisateur")
	public java.util.Collection<Evenement> evenement;

	
	public java.util.Collection<Evenement> getEvenement() {
		if (evenement == null)
			evenement = new java.util.HashSet<>();
		return evenement;
	}

	
	public java.util.Iterator getIteratorEvenement() {
		if (evenement == null)
			evenement = new java.util.HashSet<>();
		return evenement.iterator();
	}

	
	public void setEvenement(java.util.Collection<Evenement> newEvenement) {
		removeAllEvenement();
		for (java.util.Iterator iter = newEvenement.iterator(); iter.hasNext();)
			addEvenement((Evenement) iter.next());
	}

	
	public void addEvenement(Evenement newEvenement) {
		if (newEvenement == null)
			return;
		if (this.evenement == null)
			this.evenement = new java.util.HashSet<>();
		if (!this.evenement.contains(newEvenement)) {
			this.evenement.add(newEvenement);
			newEvenement.setOrganisateur(this);
		}
	}

	
	public void removeEvenement(Evenement oldEvenement) {
		if (oldEvenement == null)
			return;
		if (this.evenement != null)
			if (this.evenement.contains(oldEvenement)) {
				this.evenement.remove(oldEvenement);
				oldEvenement.setOrganisateur((Organisateur) null);
			}
	}

	
	public void removeAllEvenement() {
		if (evenement != null) {
			Evenement oldEvenement;
			for (java.util.Iterator iter = getIteratorEvenement(); iter.hasNext();) {
				oldEvenement = (Evenement) iter.next();
				iter.remove();
				oldEvenement.setOrganisateur((Organisateur) null);
			}
		}
	}

}