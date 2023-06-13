package com.tnsif.buitinobject;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
	
	LinkedList<Integer> ll = new LinkedList<Integer>();
		
	System.out.println("Size: "+ll);
	
	ll.add(12);                                                       
	ll.add(53);
	ll.addFirst(10);
	ll.add(15);
	ll.add(89);
	ll.addLast(100);
	ll.add(25);
	ll.add(11);
	
	System.out.println("Current Linked List: "+ll);
	
	System.out.println("First Element is " + ll.getFirst());
	System.out.println("Last Element is " + ll.getLast());
	
	ll.removeFirst();
	ll.removeLast();

	System.out.println("Number List after removing first and last element is " + ll);

	//Traverse
	
	ListIterator<Integer> li = ll.listIterator();
	
	while(li.hasNext())
	{
		System.out.print(li.next() + "\t");
	}
	
	System.out.println("");
	li = ll.listIterator(ll.size());
	
	while(li.hasPrevious())
	{
		System.out.print(li.previous() + "\t");
	}
	
	System.out.println("");

	Collections.sort(ll);
	System.out.println("Sorted(Ascending) Linked List: "+ll);
	System.out.println("First Element is " + ll.getFirst());
	System.out.println("Last Element is " + ll.getLast());

	Collections.reverse(ll);
	System.out.println("Reversed(Descending) Linked List: "+ll);	
	System.out.println("First Element is " + ll.getFirst());
	System.out.println("Last Element is " + ll.getLast());

	
	}	
}
