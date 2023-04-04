package com.tnsif.packageone;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Base b = new Base();
		
		b.defaultMethod();
		b.publicMethod();
		b.protectedMethod();
		//b.privateMethod(); private is not visible;
		
		b.varPublic = 31;
		b.varDefault = 32;
		b.varProtected = 34;
		
		System.out.println();
		
		b.defaultMethod();
		b.publicMethod();
		b.protectedMethod();
		
		
		//Instance Of
		// object is a instance of class or not
		System.out.println(b instanceof Base); //True or false . Output = True
		
	}

}
