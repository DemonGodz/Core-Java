package com.tnsif.mapinterface;


import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class LinkedHashMapDemo {
	
		
		public static void main(String[] args) {
			
			LinkedHashMap <Integer,String> hm = new LinkedHashMap<Integer,String>();
			//ordered collection 
			hm.put(101,"Divakar");
			hm.put(102,"Akask");
			hm.put(101,"Suraj");
			hm.put(101,"Shashi");
			hm.put(105,"Divakar");
			hm.put(104,"Om");
			hm.put(null,null);
			hm.put(107,"Divakar");
			hm.put(null,"Divakar");
			hm.put(110,"Shiva");
			hm.put(109,"Ram");
			hm.put(115,null);


			
			System.out.println(hm);
			Set <Integer> se1 = hm.keySet();
			Iterator <Integer> il3 = se1.iterator();
				while(il3.hasNext())
				{
					System.out.println(il3.next());
				}
			
			Set s = hm.entrySet();
			Iterator li = s.iterator();
				
			while(li.hasNext())
			{
				Map.Entry me = (Map.Entry)li.next();
				System.out.println("Keys = "+me.getKey()+"  Values = "+me.getValue());
			}
				
		
			//user defined collections
			
			LinkedHashMap <Integer,Student> studentHm = new LinkedHashMap<>();
			Student s1 = new Student(10,"Divakar", 80);
			studentHm.put(201, s1);
			s1 = new Student(21, "Shashi", 90);
			studentHm.put(206, s1);
			//Or other way to define it		
			studentHm.put(203, new Student(23,"Diva",34));		
			studentHm.put(204, new Student(29,"Shiv",50));		
			studentHm.put(208, new Student(25,"Durga",40));		
			studentHm.put(210, new Student(20,"Om",56));	
			studentHm.put(213, new Student(26,"Esh",78));		
			studentHm.put(212, new Student(24,"Indra",60));
			System.out.println(studentHm);
			
			System.out.println(studentHm.keySet());
			
			Set <Integer> se = studentHm.keySet();
			Iterator <Integer> il = se.iterator();
				while(il.hasNext())
				{
					System.out.println(il.next());
				}
			
			System.out.println(studentHm.entrySet());
	
}
}
