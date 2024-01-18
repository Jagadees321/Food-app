package com.org.foodapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.org.foodapp.dto.Admin;



public class Admindao {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagga");
	static EntityManager em=emf.createEntityManager();
	
public static boolean saveadmin(Admin u) {
		
		try {
			
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(u);
			et.commit();
			return true;
			
		}catch(NoResultException ex){
			ex.printStackTrace();
			return false;
		}
		
	}
	
	public static Admin findbyEmailAndPassword(String email,String password) {
		EntityManager em = emf.createEntityManager() ;
		Query query = em.createQuery("select u from Admin u where u.email=?1 and u.password=?2" ) ;
		query.setParameter(1, email) ;
		query.setParameter(2, password) ;
		
		
		try {
			
			 return (Admin)query.getSingleResult() ;
			 
		}
		catch(NoResultException e) {
			
			return null ;
		}
	}

}
