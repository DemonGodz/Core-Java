package com.tnsif.packagetwo;

import com.tnsif.packageone.Base;

public class Executor extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			

		Base b1 = new Base();
	
//		b1.defaultMethod(); Default cannot be used in differnt package class
		b1.publicMethod();
		//b.privateMethod(); private is not visible;
		
		b1.varPublic = 31;
//		b1.varDefault = 32;
//		b1.varProtected = 34;
		
		System.out.println();
		
//		b1.defaultMethod();
		b1.publicMethod();
		
		b1.methodForProtected();
	}

	
}
