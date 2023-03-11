package com.aigle.organisateur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aigle.model.Categorie;


@WebServlet("/oraganisateur/ajouter-evenement")
public class AjouterEvenementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // R�cup�ration des param�tres du formulaire
//	    long idEvenement = Long.parseLong(request.getParameter("idEvenement"));
//	    String nom = request.getParameter("nom");
//	    String dateString = request.getParameter("date");
//	    LocalDate date = LocalDate.parse(dateString);
//	    String heure = request.getParameter("heure");
//	    String lieu = request.getParameter("lieu");
//	    String description = request.getParameter("description");
//	    boolean estTermine = Boolean.parseBoolean(request.getParameter("estTermine"));
//	    int capaciteMax = Integer.parseInt(request.getParameter("capaciteMax"));
//	    int nbPlaceDisponible = capaciteMax;
//
//	    //Creation nouveau objet evenement
//	    Evenement evenement = new Evenement();
//	    evenement.setIdEvenement(idEvenement);
//	    evenement.setNom(nom);
//	    evenement.setDate(date);
//	    evenement.setHeure(heure);
//	    evenement.setLieu(lieu);
//	    evenement.setDescription(description);
//	    evenement.setEstTermine(estTermine);
//	    evenement.setCapaciteMax(capaciteMax);
//	    evenement.setNbPlaceDisponible(nbPlaceDisponible);

	    //------------Debut de la communication avec la base de donnee---------------//
	    // Cr�er une session Hibernate
 		Configuration configuration = new Configuration();
 		configuration.configure("hibernate.cfg.xml");
 		SessionFactory sessionFactory = configuration.buildSessionFactory();
 		org.hibernate.Session session = sessionFactory.openSession();

	    try {
			// R�cup�rer la cat�gorie � partir de la base de donn�es en utilisant son ID
	    	Categorie categorie = session.get(Categorie.class, 1);

			// V�rifier si la cat�gorie a �t� trouv�e dans la base de donn�es
			if (categorie == null) {
			    // La cat�gorie n'a pas �t� trouv�e, traiter l'erreur ou cr�er une nouvelle cat�gorie
			} else {
			    // La cat�gorie a �t� trouv�e, utiliser la cat�gorie r�cup�r�e
			    //evenement.setCategorie(categorie);
				PrintWriter out = response.getWriter();
				out.print(categorie.getNom());
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	   //-----------------------------Test des doonnees envoyer-------------------------------------------//
	   // PrintWriter out = response.getWriter();
		/*
		 * out.println("<html><body>");
		 * out.println("<h1>Donn�es envoy�es par le formulaire:</h1>");
		 * out.println("<p>Id de l'�v�nement: " + idEvenement + "</p>");
		 * out.println("<p>Nom de l'�v�nement: " + nom + "</p>");
		 * out.println("<p>Date de l'�v�nement: " + date + "</p>");
		 * out.println("<p>Heure de l'�v�nement: " + heure + "</p>");
		 * out.println("<p>Lieu de l'�v�nement: " + lieu + "</p>");
		 * out.println("<p>Description de l'�v�nement: " + description + "</p>");
		 * out.println("<p>Est termin�: " + estTermine + "</p>");
		 * //out.println("<p>Nombre de places disponibles: " + nbPlaceDisponible +
		 * "</p>"); out.println("<p>Capacit� maximale: " + capaciteMax + "</p>");
		 * out.println("</body></html>");
		 */
	    //response.sendRedirect("index.jsp");
	}

}
