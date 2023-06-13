package com.tnsif.generics;

public class ConstructorGenericsDemo {
	
	private double var;
	
	

	public <T extends Number>ConstructorGenericsDemo(T v) {
		
		var = v.doubleValue();
	}
	
	public void display()
	{
		System.out.println("Variable is "+var);
	}



	public static void main(String[] args) {
		ConstructorGenericsDemo gc=new ConstructorGenericsDemo(23);
		gc.display();
		
		ConstructorGenericsDemo gc1=new ConstructorGenericsDemo(23.66F);
		gc1.display();
		
		ConstructorGenericsDemo gc2=new ConstructorGenericsDemo(23);
		gc2.display();
		
	
		
		

	}

}
