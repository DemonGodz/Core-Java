package com.tnsif.staticdemo;

public class Employee {
		
	private String ename;
	private int id;
	static String companyName = "TNS";
	
	
	//parametrized constructor and static variable automately consider at here
	public Employee(String ename, int id) {
		super();
		this.ename = ename;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", id=" + id + ", Company= "+companyName+"]";
	}
	
	
	
}
