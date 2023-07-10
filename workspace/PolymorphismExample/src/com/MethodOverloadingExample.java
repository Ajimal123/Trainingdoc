package com;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		
		Operation op = new Operation();
		op.add(10);
		op.add(10.10, 20.20);
		op.add(10,20);
		op.add("10","20");
	}

}
