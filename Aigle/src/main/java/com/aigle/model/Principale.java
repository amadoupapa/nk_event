package com.aigle.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Principale {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
 		configuration.configure("hibernate.cfg.xml");
 		SessionFactory sessionFactory = configuration.buildSessionFactory();
 		org.hibernate.Session session = sessionFactory.openSession();

	}

}
