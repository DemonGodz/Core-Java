package com.tnsif.basicinterface;

public class NestedDemo {

	public static void main(String[] args) {
			
		
		NestedClass n = new NestedClass();
		n.print();
		System.out.println("ID = "+NestedClass.id);   // Or simply by object System.out.println("ID = "+n.id);
	}

}
