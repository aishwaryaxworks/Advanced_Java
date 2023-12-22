package com.xworkz.chocolate.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.chocolate.dto.ChocolateDTO;
import com.xworkz.chocolate.dto.ChocolateEntity;

@Component
public class ChocolateRepoImpl implements ChocolateRepo {

//	private EntityManagerFactory getEntityManagerFactory() {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chocolateConnection");
//		return emf;
//	}
	
	@PersistenceUnit
	EntityManagerFactory emf;

	@Override
	public boolean save(ChocolateEntity cdto) {
//		EntityManagerFactory emf = getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		try {
			transaction.begin();
			em.persist(cdto);
			transaction.commit();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			em.close();
			emf.close();
		}

		return false;
	}

	@Override
	public ChocolateDTO findById(int id) {
//		EntityManagerFactory emf = getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();

		try {
			ChocolateDTO found = em.find(ChocolateDTO.class, id);
			return found;
		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<ChocolateDTO> readAll() {
//		EntityManagerFactory emf = getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		TypedQuery<ChocolateDTO> query = em.createQuery("Select dto from ChocolateDTO dto", ChocolateDTO.class);

		return query.getResultList();
	}

	@Override
	public ChocolateDTO findByName(String name) {
//		EntityManagerFactory emf = getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		TypedQuery<ChocolateDTO> query = em.createNamedQuery("findByName", ChocolateDTO.class);

		query.setParameter("nm", name);

		try {
			query.getSingleResult();
		} catch (NoResultException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateQuantityByName(int quantity, String name) {
//		EntityManagerFactory emf = getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		transaction.begin();
		Query query = em.createNamedQuery("updateQuantity");
		System.out.println(name);
		System.out.println(quantity);
		query.setParameter("quantity", quantity);
		query.setParameter("nm", name);

		int rowsChanged = query.executeUpdate();
		transaction.commit();

		em.close();
		emf.close();
		System.out.println(rowsChanged);

		if (rowsChanged > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
//		EntityManagerFactory emf = getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		Query query = em.createNamedQuery("deleteByName");
		query.setParameter("name", name);
		int rows = query.executeUpdate();
		transaction.commit();
		em.close();
		emf.close();
		
		if(rows > 0) {
			return true;
		}
		return false;
	}

}
