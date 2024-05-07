package com.ilp03.entity;

public class ProjectPriority {

	 private int projectPriorityId;
	    private int priorityId;
	    private int userId;
		public ProjectPriority(int projectPriorityId, int priorityId, int userId) {
			super();
			this.projectPriorityId = projectPriorityId;
			this.priorityId = priorityId;
			this.userId = userId;
		}
		public ProjectPriority() {
			// TODO Auto-generated constructor stub
		}
		public int getProjectPriorityId() {
			return projectPriorityId;
		}
		public void setProjectPriorityId(int projectPriorityId) {
			this.projectPriorityId = projectPriorityId;
		}
		public int getPriorityId() {
			return priorityId;
		}
		public void setPriorityId(int priorityId) {
			this.priorityId = priorityId;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
	    
	    
	
}
