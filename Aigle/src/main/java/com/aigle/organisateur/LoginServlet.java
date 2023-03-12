package com.aigle.organisateur;

import java.io.IOException;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aigle.model.Organisateur;
import com.aigle.model.Utilisateur;
import com.aigle.util.HibernateUtil;


@WebServlet("/organisateur/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
	    String motDePasse = request.getParameter("motDePasse");
	   	
		// Récupération de la session HibernateFactory 
	    //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Configuration configuration = new Configuration();
 		configuration.configure("hibernate.cfg.xml");
 		SessionFactory sessionFactory = configuration.buildSessionFactory();
 		org.hibernate.Session session = sessionFactory.openSession();
		try {
		    // Recherche de l'utilisateur dans la base de données en utilisant le courriel
		    Query query = session.createQuery("FROM Organisateur WHERE email = :email", Organisateur.class);
		    query.setParameter("email", email);
		    Organisateur organisateur = ((org.hibernate.query.Query<Organisateur>) query).uniqueResult();

		    // Vérification du mot de passe
		    if (organisateur != null && organisateur.getMotDePasse().equals(motDePasse)) {
		        // Authentification réussie, stockage de l'utilisateur dans la session
		        HttpSession httpSession = request.getSession();
		        httpSession.setAttribute("organisateur", organisateur);
		        // Redirection vers la page espace-utilisateur.jsp
		        response.sendRedirect("espace-organisateur.jsp");
		        if (organisateur != null) {
		            System.out.println("Nom de l'organisateur : " + organisateur.getNom());
		        }
		    } else {
		        // Authentification échouée, redirection vers la page login.jsp
		        response.sendRedirect("login-organisateur.jsp?erreur=true");
		    }
		} catch (Exception ex) {
		    // Gestion des exceptions
		    ex.printStackTrace();
		} finally {
		    // Fermeture de la session Hibernate
		    session.close();
		}
		HttpSession httpSession =  request.getSession();
		Organisateur organisateur = (Organisateur)httpSession.getAttribute("organisateur");
		System.out.println("une addresse depuis session"+organisateur.getAddresse());
	}

}
