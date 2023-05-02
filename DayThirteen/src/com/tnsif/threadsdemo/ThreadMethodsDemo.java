package com.tnsif.threadsdemo;

public class ThreadMethodsDemo {

	public static void main(String[] args) {

		//Created Multiple Thread
				ChildThreadDemo cd = new ChildThreadDemo(3, "Hello"); //thread1 : creating the child thread object
				ChildThreadDemo cd1 = new ChildThreadDemo(5, "Hey!!"); //Thread2 : creating the child thread object
		
				System.out.println("Current Thread :"+Thread.currentThread());
				
				cd.start(); //start the thread and run()
				cd1.start(); //start the thread and run()
				
				Thread.currentThread().setName("Parent Thread"); //Assigning new name to Thread
				Thread.currentThread().setPriority(Thread.MIN_PRIORITY); //Changing the priority of thread
				
				System.out.println("Current Thread :"+Thread.currentThread()); // return the current Thread
	
				try {
					// the join() should be try and catch block it may occur Exception
					cd.join(); //waiting current thread until cd is dead
					cd1.join(300);  //waiting current thread until cd1 is dead or over a time period
				} catch (InterruptedException e) {
						System.err.println("Exception Occurs: "+ e.getMessage());
				}
				
				System.out.println("--------------------End Of Main ------------------------");

	}

}
