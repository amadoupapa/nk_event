package com.aigle.util;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		
			try {
				Configuration configuration = new Configuration();
		 		configuration.configure("hibernate.cfg.xml");
		 		sessionFactory = configuration.buildSessionFactory();
		 		return sessionFactory;

			} catch (Exception e) {
				e.printStackTrace();
			}
			return sessionFactory;
		
		
	}

}