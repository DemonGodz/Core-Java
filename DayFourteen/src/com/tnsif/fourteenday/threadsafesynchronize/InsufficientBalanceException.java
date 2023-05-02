package com.tnsif.fourteenday.threadsafesynchronize;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException()
	{
		super("Insufficient balance in your account");
	}
	public InsufficientBalanceException(String message)
	{
		super(message);
	}
}