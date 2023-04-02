package com.tnsif.basicjava;

public class IdentifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Valid Identifiers
			int $firstNo=14;
			int secondNo=15;
			int _thirdNo=40;
			int result = $firstNo + secondNo;
			System.out.println(result);
			
			String studentName = "Divakar";
				System.out.println(studentName);
	
			//variable,method,class,package
			//variable and method start with small letter and then Camelcase can be used like ("divakarName")
			//package and class start with capital letter and also in CamelCase
				
			//Invalid Identifiers
				//int for=17;
				//int number 2 = 34;
				//int @number = 34;		
	}

}
