package com.tnsif.userdefined;


import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// Adding User Defined objects into ArrayList
		List<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(11, "Divakar", 80);
		studentList.add(s1);
		s1 = new Student(31, "Shashi", 100);
		studentList.add(s1);
		s1 = new Student(41, "Suraj", 45);
		studentList.add(s1);
		s1 = new Student(51, "Akash", 35);
		studentList.add(s1);
		System.out.println(studentList);

		studentList.add(new Student(12,"Divakar",95));
		System.out.println(studentList);

		//Collections.sort(studentList); //CTE 
		
	}

}