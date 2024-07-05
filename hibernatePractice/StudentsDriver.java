package hibernatePractice;

import java.util.Scanner;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;




public class StudentsDriver {

	public static void main(String[] args) {
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
//		EntityManager em=emf.createEntityManager();
//	
//		EntityTransaction et=em.getTransaction();
//		                                         CRUD OPERATION
//		
//		INSERT STUDENT DATA (*********************************************)
		
//		Student s=new Student();
//		s.setId(1);
//		s.setName("A");
//		s.setAge(20);
//		
//		et.begin();
//		em.persist(s);
//		et.commit();
		
//		System.out.println("*********************DYNAMICALLY************************************");
		
//		Scanner scn=new Scanner(System.in);
//		for(int i=2;i<4;i++)
//		{
//			System.out.println("enter id:");
//			int id=scn.nextInt();
//			System.out.println("enter name:");
//			String name=scn.next();
//			System.out.println("enter age:");
//			int age=scn.nextInt();
//			Student s=new Student();
//			s.setId(id);
//			s.setName(name);
//			s.setAge(age);
		
//			et.begin();
//			em.persist(s);
//			et.commit();
//		}
		
		
//		System.out.println("****************fetching the data******************");
		
		
//em.find(Student.class, 1);
		
//		Scanner scn=new Scanner(System.in);
//		System.out.println("enter id:");
//		int id=scn.nextInt();
//		Student s=em.find(Student.class,id);
//		if(s!=null)
//		{
//			System.out.println(s.getId());
//			System.out.println(s.getAge());
//			System.out.println(s.getName());	
//		}
//		else
//		{
//			System.out.println("invalid id");
//		}
//System.out.println("***************update the student details dynamically********************");
		

//		Student s=new Student();
//		s.setId(3);
//		s.setName("C");
//		s.setAge(28);
		
//		et.begin();
//		em.merge(s);
//		et.commit();
		
//		Scanner scn=new Scanner(System.in);
//		int id=scn.nextInt();
//		Student s=em.find(Student.class,id);
//		
//		int a=scn.nextInt();
//		s.setAge(a);
//		String n=scn.next();
//		s.setName(n);
//	
//		et.begin();
//		em.merge(s);
//		et.commit();
		
//System.out.println("*****************DELETE THE STUDENT DETAILS******************");
		

		
//		Student s=em.find(Student.class,4);
//		et.begin();
//        em.remove(s);
//        et.commit();

//		System.out.println("*****************DELETE THE STUDENT DETAILS DYNAMICALLY******************");

//		Scanner scn=new Scanner(System.in);
//		System.out.println("enter id:");
//		int id=scn.nextInt();
//		Student s=em.find(Student.class,id);
//		if(s!=null)
//		{
//			et.begin();
//			em.remove(s);
//			et.commit();
//			
//		}
//		else System.out.println("invalid id");
//
		
		
//		System.out.println("**********************Caching*********************************");
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityManager em1=emf.createEntityManager();
		
		em.find(Student.class, 1);
		em.find(Student.class, 1);
		em.find(Student.class, 1);	
		
}
	}

