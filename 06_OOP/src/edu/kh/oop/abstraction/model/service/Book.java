package edu.kh.oop.abstraction.model.service;



public class Book {
	/*
	- title : String // 도서명
	- price : int // 가격
	- discountRate : double // 할인율
	- author : String // 저자명
	
	+ Book()
	+ Book(title:String, price:int,
	discountRate:double, author:String)
	*/
//기본 생성자------------------------------------------
	//필드
	private String title;
	private int price;
	private double discountrate;
	private String author;
	
	// 기본 생성자 : 값을 모두 초기화하지 않고 기본값으로 설정하는 생성자. 
	// 이 생성자를 사용하면 객체를 생성할 때 초기 값이 자동으로 설정된다.
	
	public Book() {
		this.title = "null";
		this.price = 0;
		this.discountrate = 0.0;
		this.author = "null";
		
		
	}
	
	// 매개변수 생성자 : 객체 생성 시, 값을 매개변수로 
	// 전달받아 필드를 초기화하는 생성자.
	
	public Book(String title, int price, double discountrate, String author) {
		this.title = title;
		this.price = price;
		this.discountrate = discountrate;
		this.author = author;
		
	}
	
	
	// getter / setter 메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountrate() {
		return discountrate;
	}

	public void setDiscountrate(double discountrate) {
		this.discountrate = discountrate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
	
	
	
	
	
	
}
