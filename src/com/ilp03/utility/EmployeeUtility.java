package com.ilp03.utility;


import java.util.Scanner;

import com.ilp03.service.EmployeeServiceImpl;

public class EmployeeUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		char continueChoice;
		Scanner scanner=new Scanner(System.in);
		EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
		do {
			System.out.println("1.Insert Values 2.Show Project Details ");
			System.out.println("Enter your choice");
			 choice=scanner.nextInt();
			 switch(choice) {
			 case 1: employeeService.insertValuesToEmployees();
			 break;
			 case 2:employeeService.getEmployeeDocumentDetails();
			 break;
			 default:
				 System.out.println("Invalid Choice");
			 break;
			 
		}
			 System.out.println("Do you want to continue y/n");
			 continueChoice=scanner.next().charAt(0);
		
		}while(continueChoice=='y');
	}

}
