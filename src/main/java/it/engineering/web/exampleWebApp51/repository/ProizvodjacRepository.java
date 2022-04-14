package it.engineering.web.exampleWebApp51.repository;

import java.util.List;

import javax.persistence.EntityManager;

import it.engineering.web.exampleWebApp51.domain.Proizvodjac;
import it.engineering.web.exampleWebApp51.persistence.MyEMF;

public class ProizvodjacRepository {

	private static ProizvodjacRepository instance;
	
	
	public List<Proizvodjac> getAll(){
		EntityManager em = MyEMF.getEntityManagerFactorty()
							.createEntityManager();
		
		List<Proizvodjac> proizvodjaci = em
				.createQuery("select m from Proizvodjac m", Proizvodjac.class)
				.getResultList();
		
		em.close();
		return proizvodjaci;
		
	}
	
	
	public Proizvodjac findByPib(int pib) {
		EntityManager em = MyEMF.getEntityManagerFactorty()
				.createEntityManager();
		
		Proizvodjac pr = em.find(Proizvodjac.class, pib);
		
		em.close();
		
		return pr;
	}
	
	
	public Proizvodjac save(Proizvodjac pr) {
		EntityManager em = MyEMF.getEntityManagerFactorty()
				.createEntityManager();
		
		em.getTransaction().begin();
		Proizvodjac extProiz = em.find(Proizvodjac.class, pr.getPib());
		if(extProiz == null) {
			em.persist(pr);
			//session get attribute
			System.out.println("novi proizvodjac je sacuvan.");
			em.getTransaction().commit();
			em.close();
			return extProiz;
		}
		em.getTransaction().commit();
		em.close();
		return null;
	}
	
	public boolean remove(Proizvodjac pr) {
		EntityManager em = MyEMF.getEntityManagerFactorty()
				.createEntityManager();
		
		em.getTransaction().begin();
		Proizvodjac extProiz = em.find(Proizvodjac.class, pr.getPib());
		if(extProiz != null) {
			em.remove(extProiz);
			em.getTransaction().commit();
			em.close();
			return true;
		}
		em.getTransaction().commit();
		em.close();
		return false;
	}
	
	public boolean update(Proizvodjac pr) {
		EntityManager em = MyEMF.getEntityManagerFactorty()
				.createEntityManager();
		
		em.getTransaction().begin();
		Proizvodjac extProiz = em.find(Proizvodjac.class, pr.getPib());
		if(extProiz != null) {
			extProiz.setAdresa(pr.getAdresa());
			extProiz.setMatBroj(pr.getMatBroj());
			extProiz.setMesto(pr.getMesto());
			extProiz.setNaziv(pr.getNaziv());
			em.getTransaction().commit();
			em.close();
			return true;
		}
		em.getTransaction().commit();
		em.close();
		return false;
	}
	
	public static ProizvodjacRepository getInstance() {
		if(instance == null) {
			instance = new ProizvodjacRepository();
		}
		return instance;
	}
	
}
