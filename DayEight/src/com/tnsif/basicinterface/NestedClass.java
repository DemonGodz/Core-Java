package com.tnsif.basicinterface;

public class NestedClass implements Outer.InnerInterface {

	@Override
	public void print() {
		
		System.out.println("In print method");
		
	}

}
