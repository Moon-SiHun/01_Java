package com.hw1.model.dto;

public class Textbook extends Book {
	
	private String subject;
	
	public Textbook() {}

	public Textbook(String title, String author, String genre, String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	

	@Override
	public void displayinfo() {
}
}
