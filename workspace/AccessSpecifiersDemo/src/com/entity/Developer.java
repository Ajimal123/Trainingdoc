package com.entity;

import com.bean.Employee;

public class Developer extends Employee{

	public void devInfo() {
		//System.out.println(" Id "+id);		// private : scope same class. 
		//System.out.println(" Name "+name);	// default : within a same package. 
		System.out.println(" Salary "+salary);
		System.out.println(" Designation "+designation);
	}
}
