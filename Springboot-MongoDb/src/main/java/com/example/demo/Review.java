package com.example.demo;

public class Review {

	private String userName;
	private int rating;
	private boolean approved;
	
	protected Review() {
		
	}
	
	public Review(String userName,int rating,boolean approved) {
		this.userName=userName;
		this.rating=rating;
		this.approved=approved;
	}
	
	public String getUserName(String userName) {
		return userName;
		}
	public int getRating(int rating) {
		return rating;
	}
	public boolean isApproved(boolean approved) {
		return approved;
	}
	
}
