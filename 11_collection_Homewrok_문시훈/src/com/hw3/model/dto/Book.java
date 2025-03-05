package com.hw3.model.dto;

import java.util.Objects;

public class Book {//속성

	private int bookNum;
	private String title;
	private String author;
	private int price;
	private String company;
	
	public Book() {}//기본생성자



	//기능 
	
	
	
	
	
	public Book(int bookNum, String title, String author, int price, String company) {
		
		this.bookNum = bookNum;
		this.title = title;
		this.author = author;
		this.price = price;
		this.company = company;
	}



	
	
	
	
	
	
	public int getBookNum() {
		return bookNum;
	}

	

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookNum, company, price, title);
	}


	
	}

	
	

