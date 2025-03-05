package com.hw3.modle.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BookService {
	
	// 필드
	private Scanner sc = new Scanner(System.in);
	
	// 도서를 저장할 목록 List
	private List<Book> library = new ArrayList<Book>();
	// 부모타입  참조변수 = 자식객체의 주소 (다형성 중 업캐스팅)
	
	// 즐겨찾기 도서를 저장할 목록 List 
	private List<Book> favList = new ArrayList<Book>();
	
	public BookService() {
		
		// BookService 객체가 생성될 때 library List에 5개 도서 등록
		library.add(new Book("세이노의 가르침", "세이노", 6480, "데이원", 1111));
		library.add(new Book("문과남자의 과학공부", "유시민", 15750, "돌베개", 2222));
		library.add(new Book("역행자", "자청", 17550, "웅진지식하우스", 3333));
		library.add(new Book("꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들", 4444));
		library.add(new Book("도둑맞은 집중력", "요한 하리", 16920, "어크로스", 5555));
		
	}
	
	
	// 메서드
	public void displayMenu() {
		
		// 예외가 발생할 가능성이 있는 작업에서 사용
		try {
			
			// 프로그램 종료에 사용할 정수 0 대입
			int menuNum = 0;
			
			// 콘솔에 출력할 메뉴 작성
			// 최소 한번은 작업을 실행하고
			// 프로그램 종료까지 반복하는
			// do while문 사용
			do {
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
				
				// 정수를 입력할 스캐너
				menuNum = sc.nextInt();
				
				// 입력받은 정수와 일치하는 case로 이동 후,
				// 프로그램 종료가 입력될 때까지 반복
				// 입력값과 일치하는 case가 없을 경우 default문 실행
				switch(menuNum) {
				case 1 : System.out.println(addBook()); break;
				case 2 : showBookList(library); break;
				
				case 3 : System.out.println(editBook()); break;
				
				case 4 : System.out.println(deleteBook()); break;
				/*
				case 5 : addFavorite(); break;
				case 6 : deleteFavorite(); break;
				*/
				
				case 7 : showBookList(favList); break;
				
				case 8 : randomBook(); break;
			
				case 0 : System.out.println("종료되었습니다."); break;
				default : System.out.println("메뉴에 있는 번호만 입력하세요!"); break;
				}
				
				
				// 0이 입력될 때까지 반복
			}while(menuNum != 0);
			
			// 정수가 아닌 값이 입력될 경우 예외 발생
		} catch (Exception e) {
			// Exception : 예외 클래스의 최상위 클래스
			System.out.println("예외 발생");
			e.printStackTrace(); // 예외추적
		}
		
		
	}
	
	/** 도서 등록 메서드
	 * 
	 */
	public String addBook() {
		
		System.out.println("========도서 등록=========");
		
		// 상속받은 매개변수를 이용해서 도서 등록 입력
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String writer = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		// Book 객체 생성
		Book newBook = new Book(title, writer, price, publisher, bookNum);
		
		library.add(newBook);
		// 생성한 객체를 library(List)에 추가
		
		// "등록 완료"라는 반환값 출력
		return "등록 완료";
		
	}
	
	
	/** 도서 목록 조회용 메서드
	 * 
	 * @param List<Book>
	 * 
	 */
	public void showBookList(List<Book> list) {
		// 조건문 if를 사용해서 등록된 도서가 없을 시
		// "등록된 도서가 없습니다. 도서를 등록해주세요!" 출력
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요!");
		// 도서가 등록돼있을 경우 
		} else {
			
			// list를 순회하면서 각 Book 객체를 출력
			for(Book temp : list) {
				System.out.println(temp); // Book.toString();
			}
			
		}
		
	}
	
	
	/** 도서 수정용 메서드
	 * @return
	 */
	public String editBook() {
		
		showBookList(library); // 등록된 도서를 출력하기
		
		System.out.println("======도서 수정========");
		
		int editMenu = 0; // 수정 메뉴 선택용 변수
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();
		
		// 논리형 예약어 boolean을 사용해서 조건이 참인지 거짓인지 검사
		boolean flag = true;
		// 반복문 for를 사용해서 library(List) 검사
		for(Book temp : library) {

			if(temp.getBookNum() == bookNum) { 
				// 입력한 도서번호와 도서 목록의 도서 번호가 일치하는걸 찾았을때
				
				flag = false;
				
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				System.out.print("어떤 정보를 수정하시겠습니까? ");
				
				editMenu = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				// 입력한 값과 일치하는 case로 이동
				switch(editMenu) {
				case 1 : 
					System.out.println("===도서명 수정===");
					System.out.print("수정할 도서명을 입력하세요 : ");
					String title = sc.nextLine();
					temp.setTitle(title);
					break;
					
				case 2 :
					System.out.println("===도서 저자 수정===");
					System.out.print("수정할 저자명을 입력하세요 : ");
					String writer = sc.nextLine();
					temp.setWriter(writer);
					break;
					
				case 3 :
					System.out.println("===도서 가격 수정===");
					System.out.print("수정할 가격을 입력하세요 : ");
					int price = sc.nextInt();
					temp.setPrice(price);
					break;
					
				case 4 :
					System.out.println("===도서 출판사 수정===");
					System.out.print("수정할 출판사를 입력하세요 : ");
					String publisher = sc.nextLine();
					temp.setPublisher(publisher);
					break;
					
				// 0을 입력받으면 종료
				case 0 : System.out.println("종료합니다..."); break;
				// 입력받은 값과 일치하는 case가 없을 경우 default문 실행
				default : System.out.println("메뉴에 있는 번호만 선택하세요"); break;
				}
				
			}
		}
		
		if(flag) {
			return "일치하는 도서 번호가 없습니다.";
		}
		
		return "수정 완료";
	}
	
	
	/** 도서 삭제용 메서드
	 * @return
	 */
	public String deleteBook() {
		System.out.println("====도서 삭제=====");
		
		// 등록되어있는 리스트 출력
		showBookList(library);
		
		System.out.print("삭제할 도서의 번호를 입력하세요 : ");
		int deleteNum = sc.nextInt();
		
		for(Book temp : library) {
			
			if(temp.getBookNum() == deleteNum) {
				int index = library.indexOf(temp);
				// int List.indexOf(Object) : List에 일치하는 객체가 있으면 그 객체가 있는 index번호 반환
				
				System.out.println("index 번호 : " + index);
				
				System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
				
				// 스캐너에 입력받을 문자형 변수 char 
				char answer = sc.next().toUpperCase().charAt(0); // "y" -> "Y" -> 'Y'
				
				// 입력받은 값이 'Y'면 저장돼있는 index 삭제
				if(answer == 'Y') {
					library.remove(index);
					break;
				// 'Y'가 아니라면('N'이라면) 반환값 출력
				} else {
					return "삭제를 진행하지 않습니다";
				}
			}
			
		}
		// 반환값 출력
		return "삭제 끝";
	}
	
	/** 추천 도서 뽑기
	 * 
	 */
	public void randomBook() {
		
		// 모든 library(List) 변수 설정 
		int max = library.size();
		// 난수형 변수 선언 및 초기화, 모든 리스트 거침
		int random = (int)(Math.random() * max); // 0 ~ 리스트의 마지막인데스번호
		// 랜덤한 도서 제목 출력
		System.out.println( library.get(random).getTitle() );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
