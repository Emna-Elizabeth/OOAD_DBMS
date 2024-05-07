package com.ilp03.entity;

import java.util.Date;

public class KnowledgeArticle {

	 private int articleId;
	    private int projectId;
	    private String title;
	    private String description;
	    private int createdBy;
	    private int updatedBy;
	    private Date createdDate;
	    private Date updatedDate;
		public KnowledgeArticle(int articleId, int projectId, String title, String description, int createdBy,
				int updatedBy, Date createdDate, Date updatedDate) {
			super();
			this.articleId = articleId;
			this.projectId = projectId;
			this.title = title;
			this.description = description;
			this.createdBy = createdBy;
			this.updatedBy = updatedBy;
			this.createdDate = createdDate;
			this.updatedDate = updatedDate;
		}
		public KnowledgeArticle() {
			// TODO Auto-generated constructor stub
		}
		public int getArticleId() {
			return articleId;
		}
		public void setArticleId(int articleId) {
			this.articleId = articleId;
		}
		public int getProjectId() {
			return projectId;
		}
		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
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
