package com.tnsif.packagethree;

public class PrivateConstructorWithFactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SingleTonDemo s1 = SingleTonDemo.getObject(); //don't use new keyword at here
		s1.setId(12);
		System.out.println(s1);
		
		SingleTonDemo s2 = SingleTonDemo.getObject();
		s2.setId(100);
		System.out.println(s2);
	
	}

}
