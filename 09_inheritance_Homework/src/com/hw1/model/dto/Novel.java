package com.hw1.model.dto;

public class Novel extends Book{
	
	private String genre;
	
	public Novel() {}

	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public void displayinfo() {
		System.out.println(String.format("[소설] 제목 : %s / 저자 : %s / 장르 : %s",
				getTitle(), getAuthor(), getGenre()));
			
		//[소설] 제목 : 해리포터/ 저자 : J.K 롤링 / 장르 : 판타지
	}
	

}
