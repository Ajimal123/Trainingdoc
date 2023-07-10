package com.bean;

public class Employee {
private int id;		// private 
String name;		// default 
protected float salary;		//protected
public String designation;	//public 

public void empInfo() {
	System.out.println(" Id "+id);
	System.out.println(" Name "+name);
	System.out.println(" Salary "+salary);
	System.out.println(" Designation "+designation);
	calSalary();
}
private void calSalary() {
	salary = salary +7000;
}

}
