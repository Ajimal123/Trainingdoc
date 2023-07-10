package com;

public class App {

	public static void main(String[] args) {
	// if we want to call any method or variable part of another class
		// we need to create the object. 
	Car innova = new Car();	
	Car bmw = new Car();
		innova.start();
		innova.stop();
	bmw.start();
	bmw.stop();
	System.out.println("Innova Car details");
	innova.wheel=4;	// set the value
	innova.colour="Gray";
	innova.price=3500000;
	System.out.println("Wheel "+innova.wheel);
	System.out.println("Colour "+innova.colour);
	System.out.println("Price "+innova.price);
	
	}

}
