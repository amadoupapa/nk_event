/***********************************************************************
 * Module:  Evenement.java
 * Author:  HP
 * Purpose: Defines the Class Evenement
 ***********************************************************************/
package com.aigle.model;

import java.time.LocalDate;

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
	private LocalDate date;
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date2) {
		this.date = date2;
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

	@OneToMany(mappedBy = "evenement")
	public java.util.Collection<Reservation> reservation;
	
	@ManyToOne
	public Organisateur organisateur;
	
	@ManyToOne
	public Categorie categorie;

	
	public java.util.Collection<Reservation> getReservation() {
		if (reservation == null)
			reservation = new java.util.HashSet<>();
		return reservation;
	}

	
	public java.util.Iterator getIteratorReservation() {
		if (reservation == null)
			reservation = new java.util.HashSet<>();
		return reservation.iterator();
	}

	
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

	
	public Organisateur getOrganisateur() {
		return organisateur;
	}

	
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

	
	public Categorie getCategorie() {
		return categorie;
	}

	
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