package com.tnsif.string;

public class StringBufferClass {

	public static void main(String[] args) {
			
		//create obj of string buffer
		
				StringBuffer sb=new StringBuffer("Hello Divakar is Here");
				
				System.out.println(sb);
				
				//appending and inserting into stringBuffer
				sb.append('l');
				System.out.println(sb);
				
				sb.insert(5, 'o');
				System.out.println(sb);
				
				System.out.println(sb.capacity());
				System.out.println(sb.length());
				
				
				sb.delete(0, 7);
				System.out.println(sb);
				
				sb.reverse();
				System.out.println(sb);
		
	}

}
