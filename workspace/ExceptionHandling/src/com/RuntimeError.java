package com;

public class RuntimeError {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		try {
		int res = a/b;
		System.out.println("Result is "+res);
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			//System.out.println(e.getMessage()); // exception message in short 
			//System.out.println(e.toString()); // display name of exception
			e.printStackTrace();// display name as well as line of code 
		}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
	}

}
