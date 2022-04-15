package it.engineering.web.exampleWebApp51.repository;

import java.util.List;

import javax.persistence.EntityManager;

import it.engineering.web.exampleWebApp51.domain.Mesto;
import it.engineering.web.exampleWebApp51.persistence.MyEMF;

public class MestoRepository {

	private static MestoRepository instance;

	public List<Mesto> getAll(){
		EntityManager em = MyEMF.getEntityManagerFactorty()
							.createEntityManager();
		
		List<Mesto> mesta = em
				.createQuery("select m from Mesto m", Mesto.class)
				.getResultList();
		
		em.close();
		return mesta;
		
	}
	
	public Mesto findByPtt(int ptt) {
		EntityManager em = MyEMF.getEntityManagerFactorty()
				.createEntityManager();
		
		Mesto mes = em.find(Mesto.class, ptt);
		
		em.close();
		
		return mes;
	}
	
	public Mesto save(Mesto mes) {
		EntityManager em = MyEMF.getEntityManagerFactorty()
				.createEntityManager();
		
		em.getTransaction().begin();
		Mesto extMes = em.find(Mesto.class, mes.getPtt());
		if(extMes == null) {
			em.persist(mes);
			//session get attribute
			System.out.println("novi grad je sacuvan.");
			em.getTransaction().commit();
			em.close();
			return extMes;
		}
		em.getTransaction().commit();
		em.close();
		return null;
	}
	
	public boolean remove(Mesto mes) {
		EntityManager em = MyEMF.getEntityManagerFactorty()
				.createEntityManager();
		
		em.getTransaction().begin();
		Mesto extMes = em.find(Mesto.class, mes.getPtt());
		if(extMes != null) {
			em.remove(extMes);
			em.getTransaction().commit();
			em.close();
			return true;
		}
		em.getTransaction().commit();
		em.close();
		return false;
	}
	
	public boolean update(Mesto mes) {
		EntityManager em = MyEMF.getEntityManagerFactorty()
				.createEntityManager();
		
		em.getTransaction().begin();
		Mesto extMes = em.find(Mesto.class, mes.getPtt());
		if(extMes != null) {
			extMes.setNaziv(mes.getNaziv());
			em.getTransaction().commit();
			em.close();
			return true;
		}
		em.getTransaction().commit();
		em.close();
		return false;
	}
	
	public static MestoRepository getInstance() {
		if(instance == null) {
			instance = new MestoRepository();
		}
		return instance;
	}
}
