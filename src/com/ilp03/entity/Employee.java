package com.ilp03.entity;

import java.util.Date;

public class Employee {
	
	private int employeeId;
    private String username;
    private String email;
    private int createdBy;
    private int updatedBy;
    private Date createdDate;
    private Date updatedDate;
    private int designationId;
    private Designation designation;
    public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	private Document documentName;
    private DocumentType documentType;
    private Project project;
    private Document documentCreatedDate;
    private Document documentUpdatedDate;
    private KnowledgeArticle articleName;
    private KnowledgeArticle articleDescription;
    private KnowledgeArticle articleCreatedDate;
    private KnowledgeArticle articleUpdatedDate;
    
	public Employee(int employeeId, String username, String email, int createdBy, int updatedBy, Date createdDate,
			Date updatedDate, int designationId) {
		super();
		this.employeeId = employeeId;
		this.username = username;
		this.email = email;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.designationId = designationId;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public int getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public int getDesignationId() {
		return designationId;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	

	public Document getDocumentName() {
		return documentName;
	}
	public void setDocumentName(Document documentName) {
		this.documentName = documentName;
	}
	public DocumentType getDocumentType() {
		return documentType;
	}
	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Document getDocumentCreatedDate() {
		return documentCreatedDate;
	}
	public void setDocumentCreatedDate(Document documentCreatedDate) {
		this.documentCreatedDate = documentCreatedDate;
	}
	public Document getDocumentUpdatedDate() {
		return documentUpdatedDate;
	}
	public void setDocumentUpdatedDate(Document documentUpdatedDate) {
		this.documentUpdatedDate = documentUpdatedDate;
	}
	public KnowledgeArticle getArticleName() {
		return articleName;
	}
	public void setArticleName(KnowledgeArticle articleName) {
		this.articleName = articleName;
	}
	public KnowledgeArticle getArticleDescription() {
		return articleDescription;
	}
	public void setArticleDescription(KnowledgeArticle articleDescription) {
		this.articleDescription = articleDescription;
	}
	public KnowledgeArticle getArticleCreatedDate() {
		return articleCreatedDate;
	}
	public void setArticleCreatedDate(KnowledgeArticle articleCreatedDate) {
		this.articleCreatedDate = articleCreatedDate;
	}
	public KnowledgeArticle getArticleUpdatedDate() {
		return articleUpdatedDate;
	}
	public void setArticleUpdatedDate(KnowledgeArticle articleUpdatedDate) {
		this.articleUpdatedDate = articleUpdatedDate;
	}
    
    

}
