package com.ilp03.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import java.util.List;

import java.util.Scanner;

import com.ilp03.dao.EmployeeDocumentDAO;
import com.ilp03.entity.Employee;
import com.ilp03.entity.EmployeeDocumentDetails;


public class EmployeeServiceImpl {

    public void getEmployeeDocumentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee ID");
        int employeeId = scanner.nextInt();
        
        try {
            Connection connection = EmployeeDocumentDAO.getConnection();
            List<EmployeeDocumentDetails> employeeDocuments = EmployeeDocumentDAO.getEmployee(connection,employeeId);
            
            if (!employeeDocuments.isEmpty()) {
                EmployeeDocumentDetails firstEmployee = employeeDocuments.get(0);
                String firstEmployeeName = firstEmployee.getEmployeeName();
                String firstEmployeeDesignation = firstEmployee.getDesignationName();
                
                System.out.println("Employee Name: " + firstEmployeeName);
                System.out.println("Designation: " + firstEmployeeDesignation);
                System.out.println("----------------------------------------");
               
            }
           
            for (EmployeeDocumentDetails employee : employeeDocuments) {
            	
            	
            	System.out.printf("%-25s%-25s%n", "Project Name:", employee.getProjectName());
            	System.out.printf("%-25s%-25s%n", "Document Name:", employee.getDocumentName());
            	System.out.printf("%-25s%-25s%n", "Document Type:", employee.getDocumentType());
            	System.out.printf("%-25s%-25s%n", "Document Created Date:", employee.getDocumentCreatedDate());
            	System.out.printf("%-25s%-25s%n", "Document Updated Date:", employee.getDocumentUpdatedDate());
            	System.out.printf("%-25s%-25s%n", "Article Title:", employee.getArticleTitle());
            	System.out.printf("%-25s%-25s%n", "Article Description:", employee.getArticleDescription());
            	System.out.printf("%-25s%-25s%n", "Article Created Date:", employee.getArticleCreatedDate());
            	System.out.printf("%-25s%-25s%n", "Article Updated Date:", employee.getArticleUpdatedDate());
            	System.out.println("----------------------------------------");
                         
            }
        
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public void insertValuesToEmployees() {
		// TODO Auto-generated method stub
		try {
			Scanner scanner=new Scanner(System.in);
			Connection connection=EmployeeDocumentDAO.getConnection();
			System.out.println("***************************");
			System.out.println("    ENTER EMPLOYEE DETAILS            ");
			System.out.println("Enter employee id");
			int employeeId=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter employee name");
			String employeeName=scanner.nextLine();
			System.out.println("Enter employee email");
			String employeeMail=scanner.nextLine();
			System.out.println("Created By");
			int createdBy=scanner.nextInt();
			System.out.println("Updated By");
			int updatedBy=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Created Date in YYYY-MM-DD");
			String dateString1=scanner.nextLine();
			Date createdDate=Date.valueOf(dateString1);
			scanner.nextLine();
			System.out.println("Created Date in YYYY-MM-DD");
			String dateString2=scanner.nextLine();
			Date updatedDate=Date.valueOf(dateString2);
			System.out.println("*******************************");
//			System.out.println("Enter designation id");
//			int designationId=scanner.nextInt();
			
			EmployeeDocumentDAO.insertValuesToEmployees(connection,employeeId,employeeName,employeeMail,createdBy,updatedBy,createdDate,updatedDate);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
