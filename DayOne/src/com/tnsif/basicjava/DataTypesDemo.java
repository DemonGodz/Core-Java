package com.tnsif.basicjava;

public class DataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
//Primitive and Non-primitive Datatypes
		//Primitive - Built-in data types (fixed length)
		//Non-Primitive - User defined datatype(not fixed length)
		
		int value = 46;
		System.out.println(value);

		int valueOne = 7/2;
		System.out.println(valueOne);

		double valuetwo = 57.6d/56.7d;
		System.out.println(valuetwo);

		float  valueNew= 23.77f/88.2f;
		System.out.println(valueNew);

		int marker=512;
		System.out.println(marker);

		double pertencage = marker*0.56;
		System.out.println(pertencage);
		
		long name=545454456L;
		System.out.println(name);

		//Type Casting
		// Two Types of Type casting
		//Narrowing Type casting (explicit type casting)
		// Widening Type Casting (implicit type casting)
		
		
		// Narrowing Type Casting
		
		int markerFirst=512;
		System.out.println(markerFirst+"\n");
		
		float changeFirst=  markerFirst;
		System.out.println(changeFirst);
		
		// Widening Type Casting
		
		float one = 33.45f;
		System.out.println("\n"+one+"\n");
		
		int i = (int) one;
		System.out.println(i);

	}

}
