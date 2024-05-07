package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


import com.ilp03.entity.Designation;
import com.ilp03.entity.Document;
import com.ilp03.entity.DocumentType;
import com.ilp03.entity.Employee;
import com.ilp03.entity.EmployeeDocumentDetails;
import com.ilp03.entity.KnowledgeArticle;
import com.ilp03.entity.Priority;
import com.ilp03.entity.Project;
import com.ilp03.entity.ProjectPriority;

public class EmployeeDocumentDAO {
	
	public static Connection getConnection()
	{
		String connectionString="jdbc:mysql://localhost:3306/knowledge_management_db?useSSL=false";
		String userName="root";
		String password="welcome@123";
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(connectionString,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	public static void closeConnection(Connection connection)
	{
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static List<EmployeeDocumentDetails> getEmployee(Connection connection, int employeeId) {
	    List<EmployeeDocumentDetails> resultList = new ArrayList<>();
	    String query = "SELECT " +
	            "D.designation, " +
	            "Doc.document_name, " +
	            "DT.document_type, " +
	            "E.username AS employee_name, " +
	            "P.project_name, " +
	            "Doc.created_date AS document_created_date, " +
	            "Doc.updated_date AS document_updated_date, " +
	            "KA.title AS article_title, " +
	            "KA.description AS article_description, " +
	            "KA.created_date AS article_created_date, " +
	            "KA.updated_date AS article_updated_date " +
	            "FROM " +
	            "Employee AS E " +
	            "INNER JOIN Designation AS D ON E.designation_id = D.designation_id " +
	            "LEFT JOIN Document AS Doc ON E.employee_id = Doc.created_by OR E.employee_id = Doc.updated_by " +
	            "LEFT JOIN DocumentType AS DT ON Doc.document_type_id = DT.document_type_id " +
	            "LEFT JOIN Project AS P ON Doc.project_id = P.project_id " +
	            "LEFT JOIN Knowledge_Article AS KA ON P.project_id = KA.project_id " +
	            "WHERE " +
	            "E.employee_id = ? " +
	            "AND (P.priority_id <= (SELECT priority_id FROM Project_Priority WHERE user_id = ?)) " ;
	           

	    try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	        preparedStatement.setInt(1, employeeId);
	        preparedStatement.setInt(2, employeeId);

	        try (ResultSet resultSet = preparedStatement.executeQuery()) {
	            while (resultSet.next()) {
	                EmployeeDocumentDetails result = new EmployeeDocumentDetails();

	           
	                Employee employee = new Employee();
	                
	                employee.setUsername(resultSet.getString("employee_name"));
	                result.setEmployeeName(employee.getUsername());
	                
	                Designation designation = new Designation();
	                designation.setDesignation(resultSet.getString("designation"));
	                result.setDesignationName(designation.getDesignation());

	              
	                Document document = new Document();
	                document.setDocumentName(resultSet.getString("document_name"));
	                document.setCreatedDate(resultSet.getDate("document_created_date"));
	                document.setUpdatedDate(resultSet.getDate("document_updated_date"));
	                result.setDocumentName(document.getDocumentName());
	                result.setDocumentCreatedDate(document.getCreatedDate());
	                result.setDocumentUpdatedDate(document.getUpdatedDate());
	                
	                Project project=new Project();
	                project.setProjectName(resultSet.getString("project_name"));
	                result.setProjectName(project.getProjectName());
	                
	                DocumentType documentType= new DocumentType();
	                documentType.setDocumentType(resultSet.getString("document_type"));
	                result.setDocumentType(documentType.getDocumentType());

	               
	                KnowledgeArticle knowledgeArticle = new KnowledgeArticle();
	                knowledgeArticle.setTitle(resultSet.getString("article_title"));
	                knowledgeArticle.setDescription(resultSet.getString("article_description"));
	                knowledgeArticle.setCreatedDate(resultSet.getDate("article_created_date"));
	                knowledgeArticle.setUpdatedDate(resultSet.getDate("article_updated_date"));
	                result.setArticleTitle(knowledgeArticle.getTitle());
	                result.setArticleDescription(knowledgeArticle.getDescription());
	                result.setArticleCreatedDate(knowledgeArticle.getCreatedDate());
	                result.setArticleUpdatedDate(knowledgeArticle.getUpdatedDate());

	                resultList.add(result);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return resultList;
	}
	
	public static void insertValuesToEmployees(Connection connection, int employeeId, String username, String email, int createdBy,int updatedBy, java.sql.Date createdDate, java.sql.Date updatedDate)
	{
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("Insert into Employee (employee_id,username,email,created_by,updated_by,created_date,updated_date,designation_id)values(?,?,?,?,?,?,?,?)");
			preparedStatement.setInt(1, employeeId);
			preparedStatement.setString(2, username);
			preparedStatement.setString(3, email);
			preparedStatement.setInt(4, createdBy);
			preparedStatement.setInt(5, updatedBy);
			preparedStatement.setDate(6,createdDate);
			preparedStatement.setDate(7, updatedDate);
			preparedStatement.setInt(8,7);
			int rowsInserted=preparedStatement.executeUpdate();
			if(rowsInserted>0) {
				System.out.println("Data Inserted");
			}
			else {
				System.out.println("Failed to insert Data");
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

}
