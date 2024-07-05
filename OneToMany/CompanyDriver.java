package com.jsp.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Company company=new Company();
		company.setName("google");
		company.setCeo("sundhar pichai");
		
		Employe e1=new Employe();
		e1.setName("A");
		e1.setRole("dev");
		e1.setYoe(3);
		
		Employe e2=new Employe();
		e2.setName("B");
		e2.setRole("dev");
		e2.setYoe(5);
		
		List<Employe> employes=new ArrayList<Employe>();
		employes.add(e1);
		employes.add(e2);
		
		company.setEmployes(employes);
		
		et.begin();
		em.persist(company);
		em.persist(e1);
		em.persist(e2);
		et.commit();

	}

}
