package com.jsp.Controller;

import java.util.Scanner;

import com.jsp.dao.UserDao;
import com.jsp.entity.User;

public class UserController {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
	     for(int i=1;i<3;i++)
		{
			System.out.println("enter id:");
			int id=scn.nextInt();
			System.out.println("enter name:");
			String name=scn.next();
			System.out.println("enter email:");
			String email=scn.next();
			System.out.println("enter password:");
			int password=scn.nextInt();
			User u=new User();
		    u.setId(id);
			u.setName(name);
			u.setEmail(email);
			u.setPassword(password);
			
			
			UserDao userDao=new UserDao();
			userDao.saveUser(u);
			
	}
		

	}

}
