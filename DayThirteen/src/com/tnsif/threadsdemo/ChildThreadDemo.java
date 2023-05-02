package com.tnsif.threadsdemo;

public class ChildThreadDemo extends Thread{
		
	int n;
	String msg;
	
	public ChildThreadDemo(int n, String msg) {
		this.n = n;
		this.msg = msg;
	}
	
	public void run() {
		
		try {
			for(int i = 1;i<=n;i++)
			{
				System.out.println(msg+""+i);
			}
			Thread.sleep(500); //It should be in try and catch block because possibility of exception i.e InterruptonException
		} catch (InterruptedException e) {
			
			System.err.println("Error Occur"+e.getMessage());
		}
	}
	
	
	
}
