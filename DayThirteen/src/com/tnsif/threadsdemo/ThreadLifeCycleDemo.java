package com.tnsif.threadsdemo;

public class ThreadLifeCycleDemo extends Thread {
	
	public void run() {
		//In New State/Runnable State/Not Runnable(Blocked) State is Alive or not
		System.out.println("Inside run Thread is alive or not : "+this.isAlive());//at Runnable or Not runnable(Blocked) or New stage,Thread is alive so (True)
		
		int num = 0;
		while(num < 4) {
			num++;
			System.out.println("Num = "+num);
			
			try {
				this.sleep(500);
				//In Blocked(not runnable) State is Alive or not
				System.out.println("In not runnable stage, Thread is alive or not : "+this.isAlive());//at Blocked stage,Thread is alive so (True)

			} catch (InterruptedException e) {
				System.err.println("Thread Interrupted .....");
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
	
		
		Thread myThread;
		myThread = new ThreadLifeCycleDemo();
		//Before New State is alive or not i.e Thread is not created
		System.out.println("Before runnable stage, Thread is alive or not : "+myThread.isAlive()); // Before New stage, Thread is not alive so (False)
		
		myThread.start();//The thread is created
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			System.err.println("Thread Interrupted .....");
		}
		
		System.out.println("After the complete execution of Thread,it is alive or not : "+myThread.isAlive()); //at Dead stage,Thread is not alive so (False)

	}

	
}

/*
 * Output
 * 
	Before runnable stage, Thread is alive or not : false
	Inside run Thread is alive or not : true
	Num = 1
	In not runnable stage, Thread is alive or not : true
	Num = 2
	In not runnable stage, Thread is alive or not : true
	Num = 3
	In not runnable stage, Thread is alive or not : true
	Num = 4
	After the complete execution of Thread,it is alive or not : true
	In not runnable stage, Thread is alive or not : true

 * 
 * */


	

