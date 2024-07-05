package com.jsp.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence; 

public class PersonDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person p1=new Person();
		p1.setId(1);
		p1.setName("viraj");
		p1.setAge(30);
		
		Person p2=new Person();
		p2.setId(2);
		p2.setName("raj");
		p2.setAge(32);
		
		Pan pan1=new Pan();
		pan1.setId(1);
		pan1.setPanNumber("1223y83fge");
		pan1.setAddress("banglore");
		
		Pan pan2=new Pan();
		pan2.setId(2);
		pan2.setPanNumber("1223");
		pan2.setAddress("banglore");
		
		
		p1.setPan(pan1);
		p2.setPan(pan2);
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(pan2);
		em.persist(pan1);
		et.commit();
		
	}

}
