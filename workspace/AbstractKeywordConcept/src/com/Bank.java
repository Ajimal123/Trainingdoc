package com;

public abstract class Bank {
	abstract void withdraw();
	void deposit() {
		System.out.println("Deposit logic provided by bank");
	}
}
