package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number of Employees: ");
		int totalEmp = sc.nextInt();
		
		List<Employee> empList = new ArrayList<>();
		
//		get employee details
		for( int i = 0; i < totalEmp; i++ ) {
			System.out.println("\nEnter Employee #" + (i+1) + " Details: ");
			
			System.out.print("First the First Name: ");
			String firstName = sc.next();
			
			System.out.print("Last the Last Name: ");
			String lastName = sc.next();
			
			System.out.print("Enter the Mobile Number: ");
			long mobileNo = sc.nextLong();
			
			System.out.print("Enter the E-mail ID: ");
			String email = sc.next();
			
			System.out.print("Enter the Address: ");
			String address = sc.next();
			
			
			Employee e = new Employee( firstName, lastName, mobileNo, email, address );
			empList.add(e);
			
		}
		
		sc.close();
		
//		Sort the employee list with their first name
		Collections.sort(empList);		
		
//		display all employees
		System.out.println("\nEmployee List:\n");
		
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
		for (int i = 0; i < 90; i++) System.out.print("-");
		
		Iterator<Employee> it = empList.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.format("\n%-15s %-15s %-15s %-30s %-15s\n", 
					emp.getFirstName(), emp.getLastName(), emp.getMobileNo(), emp.getEmail(), emp.getAddress());
		}
		
		for (int i = 0; i < 90; i++) System.out.print("-");
		
		
	}
	
}
