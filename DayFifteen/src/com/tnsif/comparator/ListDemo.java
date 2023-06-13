package com.tnsif.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.tnsif.userdefined.Student;

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
		System.out.println("Students Details are as follows\n" + studentList);

		// Using Comparable interface
		System.out.println("---------------Student Details Before Sorting-------------------");
		System.out.println(studentList);

		
		Comparator<Student> comp1 = (st1, st2) -> st1.getName().compareTo(st2.getName());
		Collections.sort(studentList,comp1);
		System.out.println("---------------Student Details After Sorting-------------------");
		System.out.println(studentList);

		// Adding Person objects into ArrayList
		List<Person> personList = new ArrayList<Person>();
		Person p1 = new Person("Abhijit", "Mumbai");
		personList.add(p1);

		p1 = new Person("Milind", "Pune");
		personList.add(p1);

		p1 = new Person("Saurav", "Bangalore");
		personList.add(p1);

		p1 = new Person("Madhur", "Delhi");
		personList.add(p1);
		
		System.out.println("-------------------------------------------------");

		System.out.println("Person list is as follows\n" + personList);

		// Using Comparator interface
		System.out.println("---------------Person Details Before Sorting-------------------");
		System.out.println(personList);

		Collections.sort(personList, new SortByName());

		System.out.println("---------------Person Details After Sorting by Name -------------------");
		System.out.println(personList);
		
		Collections.sort(personList, new SortByCity());

		System.out.println("---------------Person Details After Sorting by City -------------------");
		System.out.println(personList);
	}

}
