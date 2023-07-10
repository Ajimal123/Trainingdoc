package com;

public class EmployeeTest {

	public static void main(String[] args) {
	System.out.println("==============================");
	Employee emp1 = new Employee();
	emp1.setEmployee(100, "Steven", 15000);
	System.out.println("Employee Details");
	emp1.disEmployee();
	System.out.println("==============================");
	
	System.out.println();
	
	System.out.println("==============================");
	Manager mgr1 = new Manager();
	mgr1.setEmployee(101, "Lex", 45000);
	mgr1.setManager(15);
	System.out.println("Manager Details");
	mgr1.disEmployee();
	mgr1.disManager();
	System.out.println("==============================");
	
	System.out.println();
	
	System.out.println("==============================");
	Developer dev1 = new Developer();
	dev1.setEmployee(102, "Neena", 28000);
	dev1.setDeveloper("Java Tech");
	System.out.println("Developer details");
	dev1.disEmployee();
	dev1.disDeveloper();
	System.out.println("==============================");
	}

}
