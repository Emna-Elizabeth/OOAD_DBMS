package com.ilp03.entity;

public class Priority {
	
	   private int priorityId;
	    private String priority;
		public Priority(int priorityId, String priority) {
			super();
			this.priorityId = priorityId;
			this.priority = priority;
		}
		public Priority() {
			// TODO Auto-generated constructor stub
		}
		public int getPriorityId() {
			return priorityId;
		}
		public void setPriorityId(int priorityId) {
			this.priorityId = priorityId;
		}
		public String getPriority() {
			return priority;
		}
		public void setPriority(String priority) {
			this.priority = priority;
		}

	    

}
