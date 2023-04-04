package com.tnsif.packageone;

public class Base {
		
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	void defaultMethod()
	{
		System.out.println("Default Method");
		System.out.println("Default Variable: "+varDefault);
	}
	
	public void publicMethod()
	{
		System.out.println("Public Method");
		System.out.println("Public Variable: "+varPublic);
	}
	
//	private void privateMethod()
//	{
//		System.out.println("Private Method");
//		System.out.println("Private Variable: "+varPrivate);
//	}
	
	protected void protectedMethod()
	{
		System.out.println("Protected Method");
		System.out.println("Protected Variable: "+varProtected);
	}
	
	public void methodForProtected() {
		protectedMethod(); // protected can be used in different package if the class is subclass of parent class
		//protected method cannot be directly called so initialize a different method in that call the protected variable and method 

	}
}
