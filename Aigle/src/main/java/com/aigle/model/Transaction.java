/***********************************************************************
 * Module:  Transaction.java
 * Author:  HP
 * Purpose: Defines the Class Transaction
 ***********************************************************************/
package com.aigle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/** @pdOid b3b1f1d7-e3f7-4a8d-815b-95199835c60c */
@Entity
public class Transaction {
	/** @pdOid 9b9d5f8a-0146-4a88-ba93-6a4a61c54ad7 */
	@Id
	@GeneratedValue
	private long idTransaction;
	/** @pdOid 20dbe0e0-28b6-4184-9a7f-3dfe27eb3a43 */
	private java.util.Date dateTransaction;
	/** @pdOid 97ba7ace-2274-419e-93d2-451142c819af */
	private double montant;

	/** @pdRoleInfo migr=no name=Reservation assc=concerner mult=1..1 side=A */
	@OneToOne()
	public Reservation reservation;
	/** @pdRoleInfo migr=no name=Utilisateur assc=faire mult=1..1 side=A */
	@ManyToOne
	public Utilisateur utilisateur;

	public long getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(long idTransaction) {
		this.idTransaction = idTransaction;
	}

	public java.util.Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(java.util.Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	/** @pdGenerated default parent getter */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * @pdGenerated default parent setter
	 * @param newUtilisateur
	 */
	public void setUtilisateur(Utilisateur newUtilisateur) {
		if (this.utilisateur == null || !this.utilisateur.equals(newUtilisateur)) {
			if (this.utilisateur != null) {
				Utilisateur oldUtilisateur = this.utilisateur;
				this.utilisateur = null;
				oldUtilisateur.removeTransaction(this);
			}
			if (newUtilisateur != null) {
				this.utilisateur = newUtilisateur;
				this.utilisateur.addTransaction(this);
			}
		}
	}

}