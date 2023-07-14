package comm;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner cc = new Scanner(System.in);
		StudentService sc = new StudentService();
		int bb;
		String con;
		do {
			System.out.println("1. Add student , 2 . Number of student 3. Student data 4.Student data in order");
			System.out.println("Please enter your choise.");
			bb = cc.nextInt();
			
			switch (bb) {
			case 1: sc.addStudent();
				
			break;
			case 2: sc.numberOfStudent();
			break;
			case 3 : sc.displayStudentonly();
			break;
			case 4 :sc.displayStudentOneByOne();
			break;

			default: System.out.println("invalid option");
				break;
			}
			System.out.println("Do you want to continue y/n ?");
			con= cc.next();
			
		} while (con.equalsIgnoreCase("y"));
		
		System.out.println("Thank you visit again");

	}

}
