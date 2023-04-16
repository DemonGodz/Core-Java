package com.tnsif.arraysdemo;

public class ArrayOfObjectsDemo {
	
	public static void main(String[] args) {
		// declares an Array of integers.
		Student[] arr;
		// allocating memory for 5 objects of type Student.
		arr = new Student[5];
		// initialize the first elements of the array
		arr[0] = new Student(1, "Prem","FE");
		// initialize the second elements of the array
		arr[1] = new Student(2, "Divakar","SE");
		// so on...
		arr[2] = new Student(3, "Siddhesh","TE");
		arr[3] = new Student(4, "Faiz","BE");
		arr[4] = new Student(5, "Saurav","BE");
		
		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName()+ " "+ arr[i].getYear());
	}

}
