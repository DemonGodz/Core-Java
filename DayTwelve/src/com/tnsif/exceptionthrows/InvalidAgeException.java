package com.tnsif.exceptionthrows;

public class InvalidAgeException extends Exception {
	
	InvalidAgeException()
	{
		//System.out.println(("Invalid Age")); 
		super("Invalid Age");
	}

	InvalidAgeException(String message)
	{
		//System.out.println((message));
		super(message);

	}
}
