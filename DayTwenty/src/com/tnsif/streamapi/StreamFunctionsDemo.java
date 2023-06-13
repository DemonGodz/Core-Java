package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFunctionsDemo {
	
	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Divakar","","Shashi","","Saurav","","Ganesh","");
		System.out.println("List of Names"+names);
		
		//retrieve the stream
		Stream<String> stream = names.stream();
        
		System.out.println("**************************************");

		//Counting the empty strings
		long count = StreamFunctions.countEmptyStrings(names.stream());
		System.out.println("The List "+names+" has "+count+" empty strings");
		//System.out.printf("The List %s has empty %d strings \n",names,count);
		
        System.out.println("**************************************");
		
        //Counting String Length more than 8
		count = StreamFunctions.countStrings(names.stream(), 8);
		System.out.printf("The List %s has %d strings of length more than 8 \n",names,count);
        
		System.out.println("**************************************");
		
		//Remove all empty Strings from List
		List<String> names2 = StreamFunctions.nonEmptyStringsList(names.stream());
		System.out.printf("The Original List %s, List without empty strings %s \n",names,names2);
		
        System.out.println("**************************************");

        //Strings with length more than 6
        List<String> names3 = StreamFunctions.getString(names.stream(), 6);
		System.out.printf("The Original List %s, Names length more than 6 %s \n",names,names3);

        System.out.println("**************************************");

        List<Integer> numbers = Arrays.asList(10,1,2,4,2,1,7,8,7,9,8);
         //retrieve the Stream
		Stream<Integer> stream1 = numbers.stream();
		
		
		//List of square of all distinct numbers
		List<Integer> num2 = StreamFunctions.getSquareList(numbers.stream());
		System.out.printf("The Original List %s, Square without duplicates %s",numbers,num2);
		
        System.out.println("**************************************");

        //Get count,max ,min ,sum and average for numbers
        StreamFunctions.showStatistics(numbers.stream());
	}

}
