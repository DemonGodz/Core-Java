package com.tnsif.hieracinherit;

public class HieracInheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//New Object
		Person p=new Person();
		
		System.out.println("Person details:");
		System.out.println(p);
		
		//Reference Object
		Person p1;
		
		p1=new Person("Manohar","Mumbai");
		if(p1 instanceof Person)
			System.out.println("person deatils are"+p1);
		
		
		
		p1=new Employee("Nikhil","Mumbai",101,87000f,"HR");
		if(p1 instanceof Employee)
			System.out.println("person deatils are"+p1);
		
		p1=new Student("FE",89.66f);
		if(p1 instanceof Student)
			System.out.println("person deatils are"+p1);
		
		System.out.println();
		p1=new Student();
		if(p1 instanceof Student)
			System.out.println("person deatils are"+p1);
		
	}

}
