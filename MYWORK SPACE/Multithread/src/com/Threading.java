package com;

public class Threading {

	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		System.out.println(t);
		t.setName("Ajimal");
		t.setPriority(3);
		System.out.println(t);

	}

}
