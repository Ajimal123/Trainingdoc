package com;
public class DemoTest {
	public static void main(String[] args) {
		//Bank bb = new Bank();
		Hsbc obj1 =new Hsbc();
		obj1.deposit();
		obj1.withdraw();
		Sbi obj2 = new Sbi();
		obj2.deposit();
		obj2.withdraw();
	}

}
