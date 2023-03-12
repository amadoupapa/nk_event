package com.aigle.organisateur;

import java.io.PrintWriter;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aigle.model.Categorie;
import com.aigle.model.Evenement;
import com.aigle.model.Organisateur;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
 		configuration.configure("hibernate.cfg.xml");
 		SessionFactory sessionFactory = configuration.buildSessionFactory();
 		org.hibernate.Session session = sessionFactory.openSession();

	    try {
			// R�cup�rer la cat�gorie � partir de la base de donn�es en utilisant son ID
	    	Categorie categorie = session.get(Categorie.class, 1L);
	    	Organisateur organisateur = session.get(Organisateur.class, 1L);

			// V�rifier si la cat�gorie a �t� trouv�e dans la base de donn�es
			if (categorie == null) {
			    // La cat�gorie n'a pas �t� trouv�e, traiter l'erreur ou cr�er une nouvelle cat�gorie
			} else {
			    // La cat�gorie a �t� trouv�e, utiliser la cat�gorie r�cup�r�e
			    //evenement.setCategorie(categorie);
				//PrintWriter out = response.getWriter();
				//out.print(categorie.getNom());
				System.out.println(categorie.getNom());
				Evenement evenement = new Evenement();
			    //evenement.setIdEvenement(1L);
			    evenement.setNom("Hello");
			    evenement.setDate(null);
			    evenement.setHeure("12h12");
			    evenement.setLieu("bamako");
			    evenement.setDescription("ma description");
			    evenement.setEstTermine(false);
			    evenement.setCapaciteMax(100);
			    evenement.setNbPlaceDisponible(100);
			    evenement.setOrganisateur(organisateur);
			    evenement.setCategorie(categorie);
			    
			    session.beginTransaction();
			    session.save(evenement);
			    session.getTransaction().commit();
			    session.close();
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
