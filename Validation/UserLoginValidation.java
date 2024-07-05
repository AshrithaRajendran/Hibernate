package com.jsp.Validation;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserLoginValidation {

	public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			System.out.println("enter email");
			String email=scn.next();
			System.out.println("enter password");
			String password=scn.next();
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
			EntityManager em=emf.createEntityManager();
			
			Query query=em.createQuery("select u from User u where  u.email=?1 and u.password=?2");   
//			where u is query variable
		      query.setParameter(1, email);
		      query.setParameter(2, password);
		      
		      try
		      {
		    	  Object o=query.getSingleResult();
		    	  System.out.println("welcome");
		      }
catch(NoResultException e)
		      {
	System.out.println("invalid credentials");
		      }
	}

}
