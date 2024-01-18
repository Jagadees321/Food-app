package com.org.foodapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.org.foodapp.dto.FoodItem;



public class Fooditemdao {
	
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagga");
	static EntityManager em=emf.createEntityManager();
	
    public static boolean savefood(FoodItem u) {
		
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
    
    public static List<FoodItem> findall(){
    	Query q=em.createQuery("FROM FoodItem");
    	List<FoodItem> allitems=q.getResultList();
		return allitems;
    	
    }
    
    public static List<FoodItem> findByveg(){
    	Query q=em.createQuery("FROM FoodItem f WHERE itemCategory='veg' ");
    	List<FoodItem> allitems=q.getResultList();
		return allitems;
    	
    }
    public static List<FoodItem> findBynonveg(){
    	Query q=em.createQuery("FROM FoodItem f WHERE itemCategory='non-veg' ");
    	List<FoodItem> allitems=q.getResultList();
		return allitems;
    	
    }
    public static List<FoodItem> findBycurry(){
    	Query q=em.createQuery("FROM FoodItem f WHERE itemCategory='curry' ");
    	List<FoodItem> allitems=q.getResultList();
		return allitems;
    	
    }
   

}
