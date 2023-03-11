package com.aigle.user;

import java.io.IOException;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aigle.model.Utilisateur;
import com.aigle.util.HibernateUtil;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String email = request.getParameter("email");
	    String motDePasse = request.getParameter("motDePasse");
	    //PrintWriter out = response.getWriter();
		//out.print("Tout marche");
		//out.print(email);
		//out.print(motDePasse);	
		// Récupération de la session HibernateFactory 
	    //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    //Configuration configuration = new Configuration();
 		//configuration.configure("hibernate.cfg.xml");
 		//SessionFactory sessionFactory = configuration.buildSessionFactory();
 		org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();
		try {
		    // Recherche de l'utilisateur dans la base de données en utilisant le courriel
		    Query query = session.createQuery("FROM Utilisateur WHERE email = :email", Utilisateur.class);
		    query.setParameter("email", email);
		    Utilisateur utilisateur = ((org.hibernate.query.Query<Utilisateur>) query).uniqueResult();

		    // Vérification du mot de passe
		    if (utilisateur != null && utilisateur.getMotDePasse().equals(motDePasse)) {
		        // Authentification réussie, stockage de l'utilisateur dans la session
		        HttpSession httpSession = request.getSession();
		        httpSession.setAttribute("utilisateur", utilisateur);
		        // Redirection vers la page espace-utilisateur.jsp
		        response.sendRedirect("espace-user.jsp");
		    } else {
		        // Authentification échouée, redirection vers la page login.jsp
		        response.sendRedirect("login-user.jsp?erreur=true");
		    }
		} catch (Exception ex) {
		    // Gestion des exceptions
		    ex.printStackTrace();
		} finally {
		    // Fermeture de la session Hibernate
		    session.close();
		}
	}

}
