package com.tnsif.fourteenday.threadsafesynchronize;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(73, "Divakar", 50000);
		System.out.println(a1);

		// Ten account threads running parallel and sharing same resource
		AccountThread t[] = new AccountThread[10];
		for (int i = 0; i < 10; i++) {
			t[i] = new AccountThread(a1, 22000 * (i + 1));
		}
		
		  try { for (int i = 0; i < 10; i++) 
		  { t[i].join(); } }
		  catch  (InterruptedException e) 
		  { System.err.println(e.getMessage()); } 
		  // waits main thread till execution of all child thread finish
		 
		System.out.println("------------------------------------");
		System.out.println(a1);
	}

}
