package it.engineering.web.exampleWebApp51.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MyEMF {
	private EntityManagerFactory emf;
	private static MyEMF instance;
	
	
	private MyEMF() {
		emf = Persistence.createEntityManagerFactory("exampleWebApp51");
	}
	
	private EntityManagerFactory getEmf() {
		return emf;
	}
	
	public static EntityManagerFactory getEntityManagerFactorty() {
		if(instance == null) {
			instance = new MyEMF();
		}
		return instance.getEmf();
	}
	
	public static void closeEntityManagerFactory() {
		if (instance != null)
			instance.getEmf().close();
	}
}
