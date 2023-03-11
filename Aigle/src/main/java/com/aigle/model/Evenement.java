/***********************************************************************
 * Module:  Evenement.java
 * Author:  HP
 * Purpose: Defines the Class Evenement
 ***********************************************************************/
package com.aigle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Evenement {
	
	@Id
	@GeneratedValue
	private long idEvenement;
	private java.lang.String nom;
	private java.util.Date date;
	private java.lang.String heure;
	private java.lang.String lieu;
	private java.lang.String description;
	private boolean estTermine;
	private int nbPlaceDisponible;
	private int capaciteMax;

	public long getIdEvenement() {
		return idEvenement;
	}

	public void setIdEvenement(long idEvenement) {
		this.idEvenement = idEvenement;
	}

	public java.lang.String getNom() {
		return nom;
	}

	public void setNom(java.lang.String nom) {
		this.nom = nom;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public java.lang.String getHeure() {
		return heure;
	}

	public void setHeure(java.lang.String heure) {
		this.heure = heure;
	}

	public java.lang.String getLieu() {
		return lieu;
	}

	public void setLieu(java.lang.String lieu) {
		this.lieu = lieu;
	}

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public boolean isEstTermine() {
		return estTermine;
	}

	public void setEstTermine(boolean estTermine) {
		this.estTermine = estTermine;
	}

	public int getNbPlaceDisponible() {
		return nbPlaceDisponible;
	}

	public void setNbPlaceDisponible(int nbPlaceDisponible) {
		this.nbPlaceDisponible = nbPlaceDisponible;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	/**
	 * @pdRoleInfo migr=no name=Reservation assc=reserver coll=java.util.Collection
	 *             impl=java.util.HashSet mult=0..* type=Composition
	 */
	@OneToMany(mappedBy = "evenement")
	public java.util.Collection<Reservation> reservation;
	/** @pdRoleInfo migr=no name=Organisateur assc=ajouter mult=1..1 side=A */
	@ManyToOne
	public Organisateur organisateur;
	/** @pdRoleInfo migr=no name=Categorie assc=avoir mult=1..1 side=A */
	@ManyToOne
	public Categorie categorie;

	/** @pdGenerated default getter */
	public java.util.Collection<Reservation> getReservation() {
		if (reservation == null)
			reservation = new java.util.HashSet<>();
		return reservation;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorReservation() {
		if (reservation == null)
			reservation = new java.util.HashSet<>();
		return reservation.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newReservation
	 */
	public void setReservation(java.util.Collection<Reservation> newReservation) {
		removeAllReservation();
		for (java.util.Iterator iter = newReservation.iterator(); iter.hasNext();)
			addReservation((Reservation) iter.next());
	}

	
	public void addReservation(Reservation newReservation) {
		if (newReservation == null)
			return;
		if (this.reservation == null)
			this.reservation = new java.util.HashSet<>();
		if (!this.reservation.contains(newReservation)) {
			this.reservation.add(newReservation);
			newReservation.setEvenement(this);
		}
	}

	public void removeReservation(Reservation oldReservation) {
		if (oldReservation == null)
			return;
		if (this.reservation != null)
			if (this.reservation.contains(oldReservation)) {
				this.reservation.remove(oldReservation);
				oldReservation.setEvenement((Evenement) null);
			}
	}

	/** @pdGenerated default removeAll */
	public void removeAllReservation() {
		if (reservation != null) {
			Reservation oldReservation;
			for (java.util.Iterator iter = getIteratorReservation(); iter.hasNext();) {
				oldReservation = (Reservation) iter.next();
				iter.remove();
				oldReservation.setEvenement((Evenement) null);
			}
		}
	}

	/** @pdGenerated default parent getter */
	public Organisateur getOrganisateur() {
		return organisateur;
	}

	/**
	 * @pdGenerated default parent setter
	 * @param newOrganisateur
	 */
	public void setOrganisateur(Organisateur newOrganisateur) {
		if (this.organisateur == null || !this.organisateur.equals(newOrganisateur)) {
			if (this.organisateur != null) {
				Organisateur oldOrganisateur = this.organisateur;
				this.organisateur = null;
				oldOrganisateur.removeEvenement(this);
			}
			if (newOrganisateur != null) {
				this.organisateur = newOrganisateur;
				this.organisateur.addEvenement(this);
			}
		}
	}

	/** @pdGenerated default parent getter */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * @pdGenerated default parent setter
	 * @param newCategorie
	 */
	public void setCategorie(Categorie newCategorie) {
		if (this.categorie == null || !this.categorie.equals(newCategorie)) {
			if (this.categorie != null) {
				Categorie oldCategorie = this.categorie;
				this.categorie = null;
				oldCategorie.removeEvenement(this);
			}
			if (newCategorie != null) {
				this.categorie = newCategorie;
				this.categorie.addEvenement(this);
			}
		}
	}

}