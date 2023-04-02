package com.tnsif.basicsdaytwo;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int a=50;
		int b=6;
		int c=1;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a = "+a+" is largest number.");
			}
			else
			{
				System.out.println("c = "+c+" is largest number.");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b = "+b+" is largest number.");
			}
			else
			{
				System.out.println("c = "+c+" is largest number.");
			}
		}
	}

}
