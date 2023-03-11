/***********************************************************************
 * Module:  Categorie.java
 * Author:  HP
 * Purpose: Defines the Class Categorie
 ***********************************************************************/
package com.aigle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
	@GeneratedValue
	private long idCategorie;
	private java.lang.String nom;

	public long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public java.lang.String getNom() {
		return nom;
	}

	public void setNom(java.lang.String nom) {
		this.nom = nom;
	}

	@OneToMany(mappedBy = "categorie")
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
			newEvenement.setCategorie(this);
		}
	}

	public void removeEvenement(Evenement oldEvenement) {
		if (oldEvenement == null)
			return;
		if (this.evenement != null)
			if (this.evenement.contains(oldEvenement)) {
				this.evenement.remove(oldEvenement);
				oldEvenement.setCategorie((Categorie) null);
			}
	}

	public void removeAllEvenement() {
		if (evenement != null) {
			Evenement oldEvenement;
			for (java.util.Iterator iter = getIteratorEvenement(); iter.hasNext();) {
				oldEvenement = (Evenement) iter.next();
				iter.remove();
				oldEvenement.setCategorie((Categorie) null);
			}
		}
	}

}