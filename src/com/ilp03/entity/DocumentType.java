package com.ilp03.entity;

public class DocumentType {
	
	 private int documentTypeId;
	    private String documentType;
		public DocumentType(int documentTypeId, String documentType) {
			super();
			this.documentTypeId = documentTypeId;
			this.documentType = documentType;
		}
		public DocumentType() {
			// TODO Auto-generated constructor stub
		}
		public int getDocumentTypeId() {
			return documentTypeId;
		}
		public void setDocumentTypeId(int documentTypeId) {
			this.documentTypeId = documentTypeId;
		}
		public String getDocumentType() {
			return documentType;
		}
		public void setDocumentType(String documentType) {
			this.documentType = documentType;
		}
	    
	    

}
