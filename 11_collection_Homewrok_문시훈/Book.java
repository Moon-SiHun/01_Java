package com.hw3.modle.dto;

public class Book {
	private String title; // 책제목
	private String writer; // 저자
	private int price; // 가격
	private String publisher; // 출판사
	private int bookNum; // 책 번호
	
	// 기본 생성자
	public Book() {}

	// 매개변수 생성자
	public Book(String title, String writer, int price, String publisher, int bookNum) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.publisher = publisher;
		this.bookNum = bookNum;
	}

	// 다른 클래스에서 접근할 수 있도록 getter/setter 생성
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	
	// Book 클래스(상위 클래스)에서 생성한 매개변수 생성자를 BookService 클래스(하위 클래스)에서
	// 재정의해서 사용할 수 있도록 상속하는 메서드
	@Override
	public String toString() {
		return  bookNum + "번 도서 : [도서제목 : " + title + 
				" / 도서저자 : " + writer 
				+ " / 도서가격 : " + price + "원 / 출판사 : " + publisher + "]" ;
	}
	
	
	
	
	
}

