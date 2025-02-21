package edu.kh.oop.abstraction.model.service;

public class BookService {
	
	/*기본 생성자, 매개변수 생성자
	를 이용하여 2개의 Book 객체
	생성 후 필드 정보 출력.
	setter 메소드를 이용하여
	첫 번째 객체 값 수정 후
	필드 정보 출력
	getter 메소드를 이용하여
	할인율을 적용한 책 가격 출력
	*/
		public void book() {
			Book book1 = new Book();
			
			Book book2 = new Book();
			
			System.out.println(book1.toString());
			System.out.println(book2.toString());
			

	
	
	
	}

}
