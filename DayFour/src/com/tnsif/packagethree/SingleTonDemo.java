package com.tnsif.packagethree;

public class SingleTonDemo {
		
	
	private int id;
	
	private static SingleTonDemo sd = new SingleTonDemo();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private SingleTonDemo() {
		
		System.out.println("Private Constructor");
	}
		
	//Factory Method for calling private Method
	public static SingleTonDemo getObject()
	{
		return sd;
	}
	

	@Override
	public String toString() {
		return "SingleTonDemo [id=" + id + "]";
	}
	
}
