package com.jsp.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student student1=new Student();
		student1.setName("a");
		student1.setAge(12);
		student1.setYop(2023);
		
		Student student2=new Student();
		student2.setName("b");
		student2.setAge(20);
		student2.setYop(2024);
		
		Course course1=new Course();
		course1.setName("sql");
		course1.setDuration("1 month");
		
		Course course2=new Course();
		course2.setName("java");
		course2.setDuration("3 month");
		
		Course course3=new Course();
		course3.setName("j2ee");
		course3.setDuration("2 month");
		
		
		List<Student> students=new ArrayList<Student>();
		students.add(student2);
		students.add(student1);
		
		List<Course> courses=new ArrayList<Course>();
		courses.add(course3);
		courses.add(course2);
		courses.add(course1);
		
		student1.setCourses(courses);
		student2.setCourses(courses);
		
		course1.setStudents(students);
		course2.setStudents(students);
		course3.setStudents(students);
		
		et.begin();
		em.persist(course1);
		em.persist(course2);
		em.persist(course3);
		em.persist(student2);
		em.persist(student1);
		et.commit();
		
		
	}

}
