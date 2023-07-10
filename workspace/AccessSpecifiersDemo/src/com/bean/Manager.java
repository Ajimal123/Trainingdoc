package com.bean;

public class Manager extends Employee{

	public void managerInfo() {
		//System.out.println(" Id "+id);		// private : scope same class. 
		System.out.println(" Name "+name);
		System.out.println(" Salary "+salary);
		System.out.println(" Designation "+designation);
		
	}
}
