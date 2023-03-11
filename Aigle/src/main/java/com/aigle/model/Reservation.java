/***********************************************************************
 * Module:  Reservation.java
 * Author:  HP
 * Purpose: Defines the Class Reservation
 ***********************************************************************/
package com.aigle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/** @pdOid 3b1e373a-5524-4337-b17a-9ddd2468c67f */
@Entity
public class Reservation {
	
	@Id
	@GeneratedValue
	private int idReservation;
	private java.util.Date date;
	private java.lang.String numReservation;
	private java.lang.String statut;

	@OneToOne(mappedBy = "reservation")
	public Transaction transaction;
	@ManyToOne
	public Evenement evenement;
	@ManyToOne
	public Utilisateur utilisateur;

	public int getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public java.lang.String getNumReservation() {
		return numReservation;
	}

	public void setNumReservation(java.lang.String numReservation) {
		this.numReservation = numReservation;
	}

	public java.lang.String getStatut() {
		return statut;
	}

	public void setStatut(java.lang.String statut) {
		this.statut = statut;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	
	public Evenement getEvenement() {
		return evenement;
	}

	
	public void setEvenement(Evenement newEvenement) {
		if (this.evenement == null || !this.evenement.equals(newEvenement)) {
			if (this.evenement != null) {
				Evenement oldEvenement = this.evenement;
				this.evenement = null;
				oldEvenement.removeReservation(this);
			}
			if (newEvenement != null) {
				this.evenement = newEvenement;
				this.evenement.addReservation(this);
			}
		}
	}

	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	
	public void setUtilisateur(Utilisateur newUtilisateur) {
		if (this.utilisateur == null || !this.utilisateur.equals(newUtilisateur)) {
			if (this.utilisateur != null) {
				Utilisateur oldUtilisateur = this.utilisateur;
				this.utilisateur = null;
				oldUtilisateur.removeReservation(this);
			}
			if (newUtilisateur != null) {
				this.utilisateur = newUtilisateur;
				this.utilisateur.addReservation(this);
			}
		}
	}

}