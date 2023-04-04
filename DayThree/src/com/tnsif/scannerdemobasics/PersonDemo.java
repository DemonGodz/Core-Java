package com.tnsif.scannerdemobasics;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner object = new Scanner(System.in);
		
		
		System.out.println("Enter the Person Name");
		String name = object.next();
		
		System.out.println("Enter the Person Gender");
		String gender = object.next();
		
		System.out.println("Enter the Person Age");
		int age = object.nextInt();
		
		System.out.println("Enter the Person Income");
		int income = object.nextInt();
	
		//Person Class
		Person p = new Person();
		p.setName(name);
		p.setGender(gender);
		p.setAge(age);
		p.setIncome(income);
		
		//Display Person class
		System.out.println(p);
		
		// TaxCalcuDemo Class
		TaxCalcuDemo cal = new TaxCalcuDemo();
		cal.CalculateTax(p);
		
		System.out.println("Calculate Tax for "+p);
		object.close();
	}
	
}
