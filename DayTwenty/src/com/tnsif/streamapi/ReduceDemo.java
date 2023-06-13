package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {
	
 public static void main(String[] args) {
	
	 
	 List<Integer> intList = Arrays.asList(10,1,-2,-4,2,1,-7,8,7,-9,8);
     //retrieve the Stream
	Stream<Integer> stream = intList.stream();
	
    System.out.println("**************************************");

    //Filtered Stream of Positive Numbers
    stream = stream.filter(a-> a>0);
    
    //reduce to return maximum number
    Optional<Integer> result = stream.reduce((a,b)-> a>b ? a:b) ;	
    if(result.isPresent())
    {
    	System.out.println("Maximum Elements is : "+result.get());
    }
    
    //Filtered Stream of Positive number
    stream = intList.stream().filter(a-> a > 0);
    
    //reduce to sum of all positive elements
    result = stream.reduce((a,b)-> a+b);
    if(result.isPresent())
    {
    	System.out.println("Sum of all Positive Elements is : "+result.get());
    }

    //Filtered Stream of even no
    stream = intList.stream().filter(a-> a%2== 0);
    
    //reduce to sum of all even elements
    result = stream.reduce((a,b)-> a+b);
    if(result.isPresent())
    {
    	System.out.println("Sum of all Positive Elements is : "+result.get());
    }
 }
}
