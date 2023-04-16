package com.tnsif.arraysdemo;


class MLArray
{
	static void printArray(int c[][])
	{
		System.out.println("Array Elements are as follows: ");
		//row
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}

public class MultiArrayDemo {

	public static void main(String[] args) {
		
		int c[][] = { { 12, 45 }, { 65,54 } }; // new int[2][4];

		System.out.println("No. of Rows in C array : " + c.length);

		MLArray.printArray(c);
	}
}
