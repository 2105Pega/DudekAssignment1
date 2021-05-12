package com.revature.driver;

import com.revature.beans.Human;
import com.revature.beans.Employee;

public class Driver {
	
//	private String somethingNice;
//	private String somethingNice2;

	
	public static void main(String[] args) {

		Employee employee1 = new Employee("JavaExpert", "30");
		
		Employee employee2 = new Employee("SpringMaster", "35");
		
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		
		
		
		Human human1 = new Human("john", "lewis");
		
		Human human2 = new Human("andy", "smith");
		
		
			
		System.out.println(human1.toString());
		System.out.println(human2.toString());
		
		
		System.out.println("Matt is awesome!");


		
	}
	
}
