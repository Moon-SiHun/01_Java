package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService  {
	
	Scanner sc = new Scanner(System.in);
	
	
	List<Book> bookList = new ArrayList<>();
	List<Book> book2List = new ArrayList<>();
	
	
	public BookService() {
	
		bookList.add(new Book (1111, "세이노의 가르침", "세이노", 6480, "데이원") );
		bookList.add(new Book (1111, "세이노의 가르침", "세이노", 6480, "데이원") );
		bookList.add(new Book (1111, "세이노의 가르침", "세이노", 6480, "데이원") );
		bookList.add(new Book (1111, "세이노의 가르침", "세이노", 6480, "데이원") );
		bookList.add(new Book (1111, "세이노의 가르침", "세이노", 6480, "데이원") );
		bookList.add(new Book (1111, "세이노의 가르침", "세이노", 6480, "데이원") );
		
		
		
	}
	
	public void displayMenu() {
		
		
		System.out.println("===도서 목록 프로그램===");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 조회");
		System.out.println("3. 도서 수정");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 즐겨찾기 추가");
		System.out.println("6. 즐겨찾기 삭제");
		System.out.println("7. 즐겨찾기 조회");
		System.out.println("8. 추천도서 뽑기");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴를 입력하세요 : ");
		int menuNum = sc.nextInt();
	
		
	
		// menuNum의 경우의 수는 9가지
		// switch 의 형태는
		/*
		 *switch (menuNum){ 
		 * case 1 :   ~~~~~~~break; 
		 * case 2 : 		break;
		 * 
		 * ..
		 * default : "맞는 번호를 입력해주세요 "         break;
		 * */ 
	
		/*
		 * do while 문
		 * 
		 * do{
		 * 
		 * }while(  )
		 * 
		 * for문을 이용해서  1~ 10까지 출력해보세요
		 *
		 * int sum = 1;
		 * for(int i = 0; i < 10; i++){
		 * 
		 * 
		 * */
		
		switch(menuNum) {
		
		case :1 addbook();   break;
		}
		
		
		
		
		
		
	}
	
	public void addbook() {
		
		//  도서를 등록하는 기능~~~
		
		
		
	}
	
	
}
