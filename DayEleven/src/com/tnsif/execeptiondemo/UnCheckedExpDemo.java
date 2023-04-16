package com.tnsif.execeptiondemo;

public class UnCheckedExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int x[];
			try {
			x = new int[] {1,2,3,4};
			System.out.println(x[10]);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.err.println("Specified Index Does Not Exist "+e.getMessage());
			}
			System.out.println("Welcome to Unchecked Exception Program");
	}

}
