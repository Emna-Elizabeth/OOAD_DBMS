package com.ilp03.entity;

import java.util.Date;

public class EmployeeDocumentDetails {
    private String designationName;
    private String documentName;
    private String documentType;
    private String employeeName;
    private String projectName;
    private Date documentCreatedDate;
    private Date documentUpdatedDate;
    private String articleTitle;
    private String articleDescription;
    private Date articleCreatedDate;
    private Date articleUpdatedDate;

    // Constructor
    public EmployeeDocumentDetails() {
    }

    // Getter and setter methods for each field
    public String getDesignationName() {
        return designationName;
    }

    public void setDesignationName(String designationName) {
        this.designationName = designationName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getDocumentCreatedDate() {
        return documentCreatedDate;
    }

    public void setDocumentCreatedDate(Date date) {
        this.documentCreatedDate = date;
    }

    public Date getDocumentUpdatedDate() {
        return documentUpdatedDate;
    }

    public void setDocumentUpdatedDate(Date date) {
        this.documentUpdatedDate = date;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    public Date getArticleCreatedDate() {
        return articleCreatedDate;
    }

    public void setArticleCreatedDate(Date date) {
        this.articleCreatedDate = date;
    }

    public Date getArticleUpdatedDate() {
        return articleUpdatedDate;
    }

    public void setArticleUpdatedDate(Date date) {
        this.articleUpdatedDate = date;
    }

	public void setEmployeeName1(String employeeName2) {
		// TODO Auto-generated method stub
		
	}
}
