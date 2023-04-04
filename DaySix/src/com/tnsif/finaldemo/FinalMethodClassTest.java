package com.tnsif.finaldemo;

	

public class FinalMethodClassTest extends FinalMethodClass  {
		  // Compile time error because we cannot override the final method 
			  void show() {
			  System.out.println("This is the final method of FinalMethodEx class"); 
			  }
			 
		   
	}
