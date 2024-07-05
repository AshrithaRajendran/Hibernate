package com.jsp.compositekey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		 AccountComposite ac=new AccountComposite(82672575,1234);
		 AccountComposite ac1=new AccountComposite(92672742,3214);
		 
		 Account a1=new Account();
			a1.setId(1);
			a1.setAccountComposite(ac);  //826725751234
			a1.setBalance(1000);
			
			Account a2=new Account();
			a2.setId(2);
			a2.setAccountComposite(ac1);  //926772423214
			a2.setBalance(10000);
			
			
			et.begin();
			em.persist(a2);
			em.persist(a1);
			et.commit();
		 

	}

}
