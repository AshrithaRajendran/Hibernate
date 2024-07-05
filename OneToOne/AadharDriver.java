package com.jsp.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AadharDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Citizen citizen=new Citizen();
		citizen.setId(1);
		citizen.setName("A");
		citizen.setAge(21);
		
		Aadhar aadhar=new Aadhar();
		aadhar.setId(1);
		aadhar.setAadharNumber(1223334);
		aadhar.setAddress("bangalore");
		
		citizen.setAadhar(aadhar);
		aadhar.setCitizen(citizen);
		
		et.begin();
		em.persist(aadhar);
		em.persist(citizen);
		et.commit();
		

	}

}
