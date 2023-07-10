package com.service;

import com.bean.Employee;

public class Project {
	Employee emp = new Employee();
	public void empDetails() {
		//System.out.println(" Id "+emp.id);		// private : scope same class. 
		//System.out.println(" Name "+emp.name);	// default : within a same package. 
		//System.out.println(" Salary "+emp.salary);	// protected can't access 
		System.out.println(" Designation "+emp.designation);
	}
}
