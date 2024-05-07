package com.ilp03.entity;

public class Designation {
	
	 private String designationId;
	    private String designation;
		public Designation(String designationId, String designation) {
			super();
			this.designationId = designationId;
			this.designation = designation;
		}
		public Designation() {
			// TODO Auto-generated constructor stub
		}
		public String getDesignationId() {
			return designationId;
		}
		public void setDesignationId(String designationId) {
			this.designationId = designationId;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		
	    
	    

}
