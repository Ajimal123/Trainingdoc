package comm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentService {

	Map<Integer, String> stdName = new HashMap<Integer, String>();
	Scanner sc = new Scanner(System.in);
	
	public void addStudent() {
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		if(stdName.containsKey(id)) {
			System.out.println("Key must unique, so information didn't store");
		}else {
			stdName.put(id, name);
			System.out.println("Student information stored");
		}
	}
	public void numberOfStudent() {
		System.out.println("Number of student details "+stdName.size());
	}

	public void displayStudentInfo() {
		System.out.println(stdName);
	}
	
	public void displayStudentonly()
	{
		System.out.println(stdName);
		
	}
	public void displayStudentOneByOne() {
	Set<?> ss = stdName.entrySet(); 	// converting map to set 
	Iterator<?> ii = ss.iterator();		// created iterator reference 
	while(ii.hasNext()) {				// if record is there it become true 
		Object std  = ii.next();		// retrieve record 
		System.out.println(std);		// display the record 
	}
	
	}
}
