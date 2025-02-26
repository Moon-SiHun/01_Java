package edu.kh.poly.ex2.model.service;

public class MSHCalculator implements Calculator, TestInterface{//다른 인터페이스명
	// extends : 확장하다 / implements : 구현하다
	// 부모 클래스 - 자식 클래스 : extends 사용
	// 부모 인터페이스 - 자식 인터페이스 : extends 사용
	// 부모 인터페이스 - 자식 클래스 : implements 사용
	// 부모 클래스 - 자식 인터페이스 : 상속 불가

	@Override
	public int plus(int num1, int num2) {
		return num1 * num2 + MAX_NUM;
	}

	@Override
	public int minus(int num1, int num2) {
		return num2 - num1;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1 + num2 * 10;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1++;
	}

	@Override
	public String test() {
		return null;
	}

	// 다중상속 중인 인터페이스들에 같은 디폴트 메서드가 겹치면
	// 오류 발생
	// => 구현 클래스에서 오버라이딩 반드시 해야 함
	@Override
	public void display() {
		Calculator.super.display();
	}
	
	

}
