package com.aigle.organisateur;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aigle.model.Categorie;
import com.aigle.model.Evenement;
import com.aigle.model.Organisateur;

import jakarta.servlet.http.HttpSession;

@WebServlet("/organisateur/ajouter-evenement")
public class AjouterEvenementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Récupération des paramètres du formulaire
		//long idEvenement = Long.parseLong(request.getParameter("idEvenement"));
		String nom = request.getParameter("nom");
		String dateString = request.getParameter("date");
		LocalDate date = LocalDate.parse(dateString);
		String heure = request.getParameter("heure");
		String lieu = request.getParameter("lieu");
		String description = request.getParameter("description");
		boolean estTermine = Boolean.parseBoolean(request.getParameter("estTermine"));
		int capaciteMax = Integer.parseInt(request.getParameter("capaciteMax"));
		int nbPlaceDisponible = capaciteMax;

		// Creation nouveau objet evenement
		Evenement evenement = new Evenement();
		//evenement.setIdEvenement(idEvenement);
		evenement.setNom(nom);
		evenement.setDate(date);
		evenement.setHeure(heure);
		evenement.setLieu(lieu);
		evenement.setDescription(description);
		evenement.setEstTermine(estTermine);
		evenement.setCapaciteMax(capaciteMax);
		evenement.setNbPlaceDisponible(nbPlaceDisponible);

		// ------------Debut de la communication avec la base de donnee---------------//
		// Créer une session Hibernate
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		org.hibernate.Session session = sessionFactory.openSession();

		try {
			// Récupérer la catégorie à partir de la base de données en utilisant son ID
			Categorie categorie = session.get(Categorie.class, 1L);
			// Recuperer organisateur dans la session
			javax.servlet.http.HttpSession httpSession =  request.getSession();
			Organisateur organisateur = (Organisateur)httpSession.getAttribute("organisateur");
			System.out.println("une descrption depuis "+organisateur.getDescription());
			

			// La catégorie a été trouvée, utiliser la catégorie récupérée
			evenement.setOrganisateur(organisateur);
			evenement.setCategorie(categorie);
			PrintWriter out = response.getWriter();
			out.print(categorie.getNom());

			session.beginTransaction();
			session.save(evenement);
			session.getTransaction().commit();
			//Hibernate.initialize(organisateur.getEvenement());
			session.close();
			out.print("insertion reussi");
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// response.sendRedirect("index.jsp");
	}

}
