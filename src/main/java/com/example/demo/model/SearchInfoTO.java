package com.example.demo.model;

public class SearchInfoTO {
	private int postId;
	private int id;
	private String name;
	private String emailId;
	private String body;
	
	public SearchInfoTO(int postId, int id, String name, String emailId, String body) {
		super();
		this.postId = postId;
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.body = body;
	}
	
	public int getPostId() {
		return postId;
	}
	
	public void setPostId(int postId) {
		this.postId = postId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}	
}