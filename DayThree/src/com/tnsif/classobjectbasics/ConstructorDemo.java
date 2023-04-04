package com.tnsif.classobjectbasics;

import java.util.Scanner;

public class ConstructorDemo {
	
	public static void main(String[] args) {
			
		CustomerDetails cd = new CustomerDetails();
		
		System.out.println(cd);
		
		cd.setCustomerId(123456);
		cd.setCustomerName("Shashi Gajelli");
		cd.setCustomerCity("Prabhadevi");
		
		System.out.println(cd);

		System.out.println(); //For Spacing		
		
		CustomerDetails c1 = new CustomerDetails(156489,"Rohit","Pune");
		System.out.println(c1);
		
		System.out.println("\n\n");
		
		//Input in Java
		
		String name,city;
		int id;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer ID: ");
		id = sc.nextInt(); // input for int is taken by nextInt()
		
		System.out.println("Enter the Customer Name: ");
		name = sc.next(); // input for String is taken by next()
		
		System.out.println("Enter the Customer City: ");
		city = sc.next(); // input for String is taken by next()
		
		
		CustomerDetails c2 = new CustomerDetails(id,name,city);
		System.out.println(c2);
		
		}
}
