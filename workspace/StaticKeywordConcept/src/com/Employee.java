package com;

public class Employee {		// for every class only one static memory 
 String name;
 float salary;				// instance variable 
 static int managerId;		// static variable 
 
 void disEmpInfo() {
	 System.out.println(" name is "+name);
	 System.out.println("salary is "+salary);
	 System.out.println("Manager id is "+managerId);
 }
}
