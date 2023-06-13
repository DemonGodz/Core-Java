package com.tnsif.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {

	public void display(List<?> ll) {
		for (Object o : ll) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		UnBoundedWildCardDemo ub = new UnBoundedWildCardDemo();
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		System.out.println("display values");
		ub.display(l1);

		List<String> l2 = Arrays.asList("Hi", "Hello", "How are you");
		System.out.println("display values");
		ub.display(l2);
	}
}
