package com.tnsif.functionalinterface;


@FunctionalInterface  ///First declare this annotation to declare it as functional interface
public interface GreetInterface {
		
	void greet();
	static void show()
	{
		System.out.println("In print method");
	}
	
}
