package com.tnsif.basicinterface;

public class ExtendedInterface implements ChildInterface,InterfaceOne{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In Show Method");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("In Print Method");

	}

}
