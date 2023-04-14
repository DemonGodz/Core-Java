package com.tnsif.string;

public class WrapperClassDemo {

public static void main(String[] args) {
		
		
		//unboxing
		
		Integer i=new Integer(1000);
		System.out.println(i);
		
		int b=i.intValue();
		System.out.println(b);
		
		//without intValue
		int c=i;
		System.out.println(c);
		
		//Autoxing
		
		int a=1200;
		Integer d=a;
		
		System.out.println(d);
		
		
	}

}
