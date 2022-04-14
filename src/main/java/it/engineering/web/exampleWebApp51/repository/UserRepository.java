package it.engineering.web.exampleWebApp51.repository;

import java.util.List;
import javax.persistence.EntityManager;

import it.engineering.web.exampleWebApp51.domain.User;
import it.engineering.web.exampleWebApp51.persistence.MyEMF;


public class UserRepository {
	
	public static UserRepository instance;
	
	public List<User> getAll(){
		EntityManager em = MyEMF.getEntityManagerFactorty()
							.createEntityManager();
		
		List<User> users = em
				.createQuery("select m from user m", User.class)
				.getResultList();
		
		em.close();
		return users;
		
	}
	
	public User findByUsername(String username) {
		EntityManager em = MyEMF.getEntityManagerFactorty()
				.createEntityManager();
		
		User user = em.find(User.class, username);
		
		em.close();
		
		return user;
	}
	
	
	public static UserRepository getInstance() {
		if(instance == null) {
			instance = new UserRepository();
		}
		return instance;
	}
	
}
