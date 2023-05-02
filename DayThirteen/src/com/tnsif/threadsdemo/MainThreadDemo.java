package com.tnsif.threadsdemo;

public class MainThreadDemo {

	public static void main(String[] args) {
			
		//Created Multiple Thread
		ChildThreadDemo cd = new ChildThreadDemo(3, "Hello"); //Thread1
		ChildThreadDemo cd1 = new ChildThreadDemo(5, "Hey!!"); //Thread2
		ChildThreadDemo cd2 = new ChildThreadDemo(5, "Hi!"); //Thread3

		//Step2 : Start and in class ChildThread run() is automatically called
		cd.start();
		cd1.start();
		cd2.start();
		
		System.out.println("-------End of Main-------"); //Firstly this executed
		/// main method is default Threat so this is first executed and then the Multiple Thread executes

	}

}
