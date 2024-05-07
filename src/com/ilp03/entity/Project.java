package com.ilp03.entity;

import java.util.Date;

public class Project {
	
	 private int projectId;
	    private String projectName;
	    private Date startDate;
	    private Date createdDate;
	    private Date updatedDate;
	    private Date endDate;
	    private int createdBy;
	    private int updatedBy;
	    private int priorityId;
		public Project(int projectId, String projectName, Date startDate, Date createdDate, Date updatedDate,
				Date endDate, int createdBy, int updatedBy, int priorityId) {
			super();
			this.projectId = projectId;
			this.projectName = projectName;
			this.startDate = startDate;
			this.createdDate = createdDate;
			this.updatedDate = updatedDate;
			this.endDate = endDate;
			this.createdBy = createdBy;
			this.updatedBy = updatedBy;
			this.priorityId = priorityId;
		}
		public Project() {
			// TODO Auto-generated constructor stub
		}
		public int getProjectId() {
			return projectId;
		}
		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public Date getStartDate() {
			return startDate;
		}
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
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
		public Date getEndDate() {
			return endDate;
		}
		public void setEndDate(Date endDate) {
			this.endDate = endDate;
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
		public int getPriorityId() {
			return priorityId;
		}
		public void setPriorityId(int priorityId) {
			this.priorityId = priorityId;
		}
	    
	    

}
