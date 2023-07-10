package com;

public class Sbi extends Bank{
	@Override
	void withdraw() {
		System.out.println("Withdraw logic provided by Sbi");
	}
	@Override
	void deposit() {
		System.out.println("Deposit logic provided by Sbi");
	}
}
