package com.xworkz.college.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.college.dto.CollegeDto;

public class CollegeRepoImpl implements CollegeRepo {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("data-connection");
	EntityManager em = emf.createEntityManager();
	EntityTransaction transaction = em.getTransaction();
	
	@Override
	public String save(CollegeDto dto) {
			System.out.println("save method from Repo");
			
			transaction.begin();
			em.persist(dto);
			
			transaction.commit();
			return "data saved successfully";
	}

	@Override
	public List<CollegeDto> readAll() {
			Query query = em.createNamedQuery("readAll");
			List<CollegeDto> data = query.getResultList();
//			em.getTransaction().commit();
			return data;
	}

}
