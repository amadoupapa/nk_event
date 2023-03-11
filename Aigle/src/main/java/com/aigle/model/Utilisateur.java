/***********************************************************************
 * Module:  Utilisateur.java
 * Author:  HP
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/
package com.aigle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {
	@Id
	@GeneratedValue
	private long idUtilisateur;
	private java.lang.String nom;
	private java.lang.String prenom;
	private java.lang.String email;
	private java.lang.String motDePasse;
	private java.lang.String profil;
	private java.lang.String addresse;
	private java.lang.String numTelephone;

	@OneToMany(mappedBy = "utilisateur")
	public java.util.Collection<Reservation> reservation;
	
	@OneToMany(mappedBy = "utilisateur")
	public java.util.Collection<Transaction> transaction;

	public long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public java.lang.String getNom() {
		return nom;
	}

	public void setNom(java.lang.String nom) {
		this.nom = nom;
	}

	public java.lang.String getPrenom() {
		return prenom;
	}

	public void setPrenom(java.lang.String prenom) {
		this.prenom = prenom;
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

	public java.lang.String getProfil() {
		return profil;
	}

	public void setProfil(java.lang.String profil) {
		this.profil = profil;
	}

	public java.lang.String getAddresse() {
		return addresse;
	}

	public void setAddresse(java.lang.String addresse) {
		this.addresse = addresse;
	}

	public java.lang.String getNumTelephone() {
		return numTelephone;
	}

	public void setNumTelephone(java.lang.String numTelephone) {
		this.numTelephone = numTelephone;
	}

	
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
			newReservation.setUtilisateur(this);
		}
	}

	
	public void removeReservation(Reservation oldReservation) {
		if (oldReservation == null)
			return;
		if (this.reservation != null)
			if (this.reservation.contains(oldReservation)) {
				this.reservation.remove(oldReservation);
				oldReservation.setUtilisateur((Utilisateur) null);
			}
	}

	
	public void removeAllReservation() {
		if (reservation != null) {
			Reservation oldReservation;
			for (java.util.Iterator iter = getIteratorReservation(); iter.hasNext();) {
				oldReservation = (Reservation) iter.next();
				iter.remove();
				oldReservation.setUtilisateur((Utilisateur) null);
			}
		}
	}

	
	public java.util.Collection<Transaction> getTransaction() {
		if (transaction == null)
			transaction = new java.util.HashSet<>();
		return transaction;
	}

	
	public java.util.Iterator getIteratorTransaction() {
		if (transaction == null)
			transaction = new java.util.HashSet<>();
		return transaction.iterator();
	}

	
	public void setTransaction(java.util.Collection<Transaction> newTransaction) {
		removeAllTransaction();
		for (java.util.Iterator iter = newTransaction.iterator(); iter.hasNext();)
			addTransaction((Transaction) iter.next());
	}

	
	public void addTransaction(Transaction newTransaction) {
		if (newTransaction == null)
			return;
		if (this.transaction == null)
			this.transaction = new java.util.HashSet<>();
		if (!this.transaction.contains(newTransaction)) {
			this.transaction.add(newTransaction);
			newTransaction.setUtilisateur(this);
		}
	}

	
	public void removeTransaction(Transaction oldTransaction) {
		if (oldTransaction == null)
			return;
		if (this.transaction != null)
			if (this.transaction.contains(oldTransaction)) {
				this.transaction.remove(oldTransaction);
				oldTransaction.setUtilisateur((Utilisateur) null);
			}
	}

	
	public void removeAllTransaction() {
		if (transaction != null) {
			Transaction oldTransaction;
			for (java.util.Iterator iter = getIteratorTransaction(); iter.hasNext();) {
				oldTransaction = (Transaction) iter.next();
				iter.remove();
				oldTransaction.setUtilisateur((Utilisateur) null);
			}
		}
	}

}