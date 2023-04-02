package com.tnsif.basicsdaytwo;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char x = 'l';
			switch(x)
			{
			case 'l':
			case 'L':
				System.out.println(x+" is a letter");
				break;
			case 'd':
			case 'D':
				System.out.println(x+" is a digit");
				break;
			case 'e':
			case 'E':
				System.out.println(x+" is a alphanumeric");
				break;
			case 'c':
			case 'C':
				System.out.println(x+" is a Complex");
				break;
			}
	}

}
