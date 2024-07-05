package com.jsp.ManyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Hospital hospital=new Hospital();
		hospital.setName("EYECARE");
		hospital.setCeo("Raju");
		
		Branch branch1=new Branch();
		branch1.setManager("ashritha");
		branch1.setAddress("bangalore");
		
		Branch branch2=new Branch();
		branch2.setManager("anasuya");
		branch2.setAddress("chennai");
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		
		List<Branch> branches=new ArrayList<Branch>();
		branches.add(branch2);
		branches.add(branch1);
		
		hospital.setBranches(branches);
		
		
		et.begin();
		em.persist(hospital);
		em.persist(branch1);
		em.persist(branch2);
		et.commit();
		

	}

}
