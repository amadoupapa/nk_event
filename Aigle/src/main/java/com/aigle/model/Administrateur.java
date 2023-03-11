/***********************************************************************
 * Module:  Administrateur.java
 * Author:  HP
 * Purpose: Defines the Class Administrateur
 ***********************************************************************/
package com.aigle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/** @pdOid 72c9e3f5-e547-4765-99d4-a1dbf841cc9f */
@Entity
public class Administrateur {
	/** @pdOid 61aa742f-00dd-46a3-b298-dee9684b9515 */
	@Id
	@GeneratedValue
	private int idAdmin;

	/**
	 * @pdRoleInfo migr=no name=Utilisateur assc=generalisation1 mult=1..1 side=A
	 */
	@OneToOne()
	@JoinColumn(name = "idUtilisateur", referencedColumnName = "idUtilisateur")
	public Utilisateur utilisateur;

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}