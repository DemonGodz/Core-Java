package com.tnsif.multipleinherit;

public class MultipleInheritClass implements FirstParentInterface,SecondParentInterface {

	@Override
	public void print_One() {
		
		System.out.println("In Print method");
	}

	@Override
	public void show_One() {
		// TODO Auto-generated method stub
		System.out.println("In Show method");

	}
		
	
}
