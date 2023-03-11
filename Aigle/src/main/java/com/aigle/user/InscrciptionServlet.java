package com.aigle.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.aigle.model.Utilisateur;
import com.aigle.util.HibernateUtil;



/**
 * Servlet implementation class InscrciptionServlet
 */
@WebServlet("/inscription")
public class InscrciptionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		// Récupérer les données du formulaire
	    String nom = request.getParameter("nom");
	    String prenom = request.getParameter("prenom");
	    String email = request.getParameter("email");
	    String motDePasse = request.getParameter("motDePasse");
	    String profil = "utilisateur";
	    String addresse = request.getParameter("addresse");
	    String numTelephone = request.getParameter("numTelephone");

		PrintWriter out = response.getWriter();
		out.print("Tout marche");
		out.print(addresse);
		out.print(profil);
		//out.print(nom);
		//out.print(prenom);out.print(motDePasse);

		Session session = HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Transaction tx = null;
        try {
            // Démarrez une transaction Hibernate
            tx = session.beginTransaction();

            // Créez un objet Utilisateur pour les données postées
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setNom(nom);
            utilisateur.setPrenom(prenom);
            utilisateur.setEmail(email);
            utilisateur.setMotDePasse(motDePasse);
            utilisateur.setProfil(profil);
            utilisateur.setAddresse(addresse);
            utilisateur.setNumTelephone(numTelephone);

            // Utilisez la méthode save() de la session Hibernate pour insérer l'objet Utilisateur dans la base de données
            session.save(utilisateur);

            // Validez la transaction Hibernate
            tx.commit();


            //response.getWriter().println("Les données ont été insérées avec succès.");
          //redirection avec un message
            request.setAttribute("message", "Votre compte est bien cree !");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/login-user.jsp");
            dispatcher.forward(request, response);



        } catch (Exception e) {
            // Annulez la transaction Hibernate en cas d'erreur
            if (tx != null) {
                tx.rollback();
            }
            throw new ServletException("Une erreur est survenue !", e);
        } finally {
            // Fermez la session Hibernate
            session.close();
        }
	}

}
