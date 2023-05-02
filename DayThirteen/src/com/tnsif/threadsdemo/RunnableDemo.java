package com.tnsif.threadsdemo;

public class RunnableDemo {

	

		public static void main(String[] args) {
			//UsingRunnableInterface ur=new UsingRunnableInterface(10, 1, "Hello");
			
			Runnable r1=new Runnable()
					{
				public void run()//anonymous class
				{
					System.out.println("Runnable with anonymous class");
				}
					};
					
					Thread t1=new Thread(r1);
					t1.start();
					
					//lambda Expression
					Runnable r2=()->System.out.println("Runnable with Lambda Expression");
					
					new Thread(r2).start();
					
		}
			
		
		}
