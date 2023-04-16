package com.tnsif.execeptiondemo;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int arr[] = { 1,3,5,6,7,10 };

		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println(c);
			System.out.println(arr[c]);
			System.exit(0);

		} catch (ArithmeticException ae) {
			System.err.println("Error Occurred" + ae.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array Error Occurred" + e.getMessage());
		} catch (Exception a1) {
			System.out.println("Error Occured once again " + a1.getMessage());
		}
		finally {
			System.out.println("This Finally Block");
		}
		System.out.println("This is After Finally Block");
	}

}
