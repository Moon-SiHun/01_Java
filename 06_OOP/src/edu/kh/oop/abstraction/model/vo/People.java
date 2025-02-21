package edu.kh.oop.abstraction.model.vo;
//									 vo : 값 저장용 객체( Value object)를
//										  만들기 위한 클래스를 모아두는 패키지


// MVC 패턴 ( 애플리케이션의 역할을 세가지로 분리하는 설계 패턴
// - Model : 데이터와 비즈니스 로직, 프로그램 로직을 저장하는 부분(DB, 서비스 ,객체)  
// - View : 사용자에게 보여지는 화면(UI - HTML, JSP, Thymeleaf, React)
// - Controller : 사용자의 요청을 받고 모델과 뷰를 연결하는 역할(응답)

public class People { // 국민(사람) 클래스
	
	// 클래스란? 객체의 특성(속성, 기능)을 정의한 것
	// == 객체를 만들기 위한 설계도
	
	// 속성 == 값 == data
	// 값을 저장하기 위한 변수 선언
	// -> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
	// - 이름, 성별, 주민번호, 주소, 전화번호, 나이 등
	// 필드 : == 필드변수 == 멤버변수 
	
	// 캡슐화
			// - 데이터(속성)와 기능을 하나로 묶어서 관리하는 기법
			// - 데이터의 직접적인 접근을 제한하는 것이 원칙
			// -> 직접접근 못하기 때문에
			// 		클래스 내부에 간접 접근 방법을 제공하는
			// 		기능(메서드) 작성해둔다
			// -> getter/setter
			
			/*데이터 직접 접근 제한
			 * 
			 * public -> private 변경
			 * 
			 */
	
	// [접근제한자] 자료형 변수명;
	/*
	//public double bitcoin; // 공통점이 아니므로 제거
	public String setName;
	public char setGender;
	public String setAddress;
	public String setPhone;
	public int setAge;
	
	// 기능 == 행동/동작 == method(메서드)
	public void tax() {
		System.out.println("세금을 냅니다.");
	}
	
	public void vote() {
		System.out.println("투표를 합니다.");
	}
	
	// 캡슐화에서 사용할 간접 접근 기능 (getter/setter)
	// [접근제한자] 반환형 메서드명(){}
	
	// name 변수의 값을 호출한 쪽으로
	// 돌려보내주는  간접 접근 기능중 getter
	
	// void : 반환할 값이 없다(반환형(자료형)이 없다)
	public String getName() {
		return name;
		// return : 반환, 되돌려주다
		// return : 현재 메서드를 종료하고 호출한 쪽으로 돌아감
		// return 값/변수; : 현재 메서드를 종료하고
		//					값/변수를 가지고 호출한 쪽으로 돌아감
		
	
}

	//	// alt + shift + s 또는 상단메뉴 Source
	// -> Generate Getters and Setters...클릭
	// -> select all -> genarate 
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// getter() : 반환형이 무조건  있음
	//			getter는 필드에 작성된 변수값을 호출한 쪽으로 되돌려주는 것
	//			그 변수를 되돌려준다면 당연히 반환형도 존재
	
	// name 변수에 값을 세팅하는 간접 접근 기능 중 setter
						// 매개변수
	
	/*
	public void setName(String name) {
		
		// ** this : 현재 객체
		this.name = name;
		
	}
	
	public char getGender() {
		return gender;
	}
		
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	}
	*/
	
	// 본인객체
	// People 클래스 이용하여 본인 이름 객체 생성하기
	// 본인의 정보 setter 값 대입
	// getter 이용해서 콘솔창 출력까지
//==============================================
	// private 먼저
	private String name;
	private char gender;
	private int age;
	private String address;
	private String phone;
	private String pno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno){
		this.pno = pno;
	}
	
public int getAge1() {
	return age;
}
public void setAge1(int age) {
	// 메서드(기능) 형태인 getter/setter 를 이용하면
	// 본인이 원하는 기능을 추가할 수 잇음
	// age가 0보다 작을 때 예외 발생시키기
	// age가 0보다 클 때 속성에 전달받은 값 세팅하기
	
	if(age > 0) {
		this.age = age;
	}else {
		throw new IllegalArgumentException();
		// IllegalArgumentException 
		// 메서드에 전달된 인자가 유효하지 않을 때 발생하는 예외
	}
}
	
}
	
	
	
	

		


