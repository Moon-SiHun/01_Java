package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 패키지 or 서비스
// (비밀번호 -> 암호화, 파일 -> 유효한 파일만 걸러내는 작업 등)

public class AbstractionService {
	
	// 속성
	// 기능
	public void ex1() {
		// People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		People sihun = new People();		
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1(== 참조변수)
		// new People() : 새로운 People 객체를 Heap 영역에 생성

		// * 클래스 이름이 자료형처럼 사용된다 *
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고 부른다
		
		//int[] arr = new int[5];
		/*
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
		// char타입 jvm  기본값은 0
		// 유느코드 문자체계에서 0은 공백을 나타냄
		// -> int 형으로 강제 형변환하면 0인 것을 확인할 수 있음
		
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
	
		
		
		p1.name = "홍길동";
		p1.gender = '남';		
		p1.address = "서울시 중구 남대문로 120";		
		p1.phone = "010-1234-1234";		
		p1.age = 20;

		p1.tax ();
		p1.vote ();
		*/
		
	
		// 전달하는 값(인자) : 전달인자
		/*
		p1.setName = ("홍길동");
		p1.setGender = ('남');		
		p1.setAddress = ("서울시 중구 남대문로 120");		
		p1.setPhone = ("010-1234-1234");		
		p1.setAge = (20);
		
		System.out.println(p1.getName());
		System.out.println(p1.getGender());
		System.out.println(p1.getAddress());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		*/
		sihun.setName("문시훈");
		sihun.setGender('남');
		sihun.setAge(28);
		sihun.setAddress("경기도 고양시 덕양구");
		sihun.setPhone("010-7748-7237");
		sihun.setPno("123456-1234567");
		
		
		System.out.println(sihun.getName());
		System.out.println(sihun.getGender());
		System.out.println(sihun.getAge());
		System.out.println(sihun.getAddress());
		System.out.println(sihun.getPhone());
		System.out.println(sihun.getPno());
	
	
	
	

	}
}

	
	

