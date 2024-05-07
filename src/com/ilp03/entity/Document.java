package com.ilp03.entity;

import java.util.Date;

public class Document {
	
	   private int documentId;
	    private int projectId;
	    private String documentName;
	    private int documentTypeId;
	    private Date uploadDate;
	    private int createdBy;
	    private int updatedBy;
	    private Date createdDate;
	    private Date updatedDate;
		public Document(int documentId, int projectId, String documentName, int documentTypeId, Date uploadDate,
				int createdBy, int updatedBy, Date createdDate, Date updatedDate) {
			super();
			this.documentId = documentId;
			this.projectId = projectId;
			this.documentName = documentName;
			this.documentTypeId = documentTypeId;
			this.uploadDate = uploadDate;
			this.createdBy = createdBy;
			this.updatedBy = updatedBy;
			this.createdDate = createdDate;
			this.updatedDate = updatedDate;
		}
		public Document() {
			// TODO Auto-generated constructor stub
		}
		public int getDocumentId() {
			return documentId;
		}
		public void setDocumentId(int documentId) {
			this.documentId = documentId;
		}
		public int getProjectId() {
			return projectId;
		}
		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}
		public String getDocumentName() {
			return documentName;
		}
		public void setDocumentName(String documentName) {
			this.documentName = documentName;
		}
		public int getDocumentTypeId() {
			return documentTypeId;
		}
		public void setDocumentTypeId(int documentTypeId) {
			this.documentTypeId = documentTypeId;
		}
		public Date getUploadDate() {
			return uploadDate;
		}
		public void setUploadDate(Date uploadDate) {
			this.uploadDate = uploadDate;
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
	    
	    

}
