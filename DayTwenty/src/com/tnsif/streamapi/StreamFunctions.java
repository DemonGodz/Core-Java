package com.tnsif.streamapi;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {

	//retrieve the stream
	public static Stream<String> getStream(List<String> list)
	{
		return list.stream();
	}
	
	//count the empty Strings
	public static long countEmptyStrings(Stream<String> stream)
	{
		long count = 0;
		count = stream.filter(x->x.isEmpty()).count();
		return count;
	}
	
	//count String with length more than given number
	public static long countStrings(Stream<String> stream, int n)
	{
		long num = stream.filter(x -> x.length() > n).count();
		return num;
	}
	
	//Remove all the Empty Strings from List 
	public static List<String> nonEmptyStringsList(Stream<String> stream)
	{
		List<String> filteredList = stream.filter(x -> !x.isEmpty()).collect(Collectors.toList());
		return filteredList;
	}
	
	//Create aList with String more than n character
	public static List<String> getString(Stream<String> stream,int n)
	{
		List<String> stringList = stream.filter(x -> x.length() > n).collect(Collectors.toList());
		return stringList;
	}
	
	public static List<Integer> getSquareList(Stream<Integer> stream)
	{
		List<Integer> squareList = stream.map(x -> x*x).distinct().collect(Collectors.toList());
		return squareList;
	}	
	
	public static void showStatistics(Stream<Integer> stream)
	{
			IntSummaryStatistics stats = stream.mapToInt(x->x).summaryStatistics();
			System.out.println("Highest Number in List "+stats.getMax());
			System.out.println("Lowest Number in List "+stats.getMin());
			System.out.println("Sum of All Numbers "+stats.getSum());
			System.out.println("Average of All Numbers "+stats.getAverage());

			
	}
	
}
