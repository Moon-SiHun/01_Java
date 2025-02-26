package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		// 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		// [실행화면]
		// 인원 수 : 29
		// 사탕 개수 : 100
		// 1인당 사탕 개수 : 3
		// 남는 사탕 개수 : 13
		
		// 스캐너를 사용하여 콘솔에 입력
		Scanner sc = new Scanner(System.in);
		
		// 입력할 인원 수
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		// 사탕 개수
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		// 1인당 사탕 개수
		int personCandy = candy / people; 
		
		// 남은 사탕 개수 
		int lessCandy = candy % people;
		
		// 결과 출력
		System.out.println("1인당 사탕 개수 : " + personCandy);
		System.out.println("남는 사탕 개수 : " + lessCandy);
		
		
		
	}

	public void practice2() {
		/*
		키보드로 입력 받은 값들을 변수에 기록하고 
		저장된 변수 값을 화면에 출력하여 확인하세요.

		이름 : 홍길동
		학년(정수만) : 3
		반(정수만) : 4
		번호(정수만) : 15
		성별(남학생/여학생) : 남학생
		성적(소수점 아래 둘째 자리까지) : 85.75
		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classRoom = sc.nextInt();
		
		System.out.print("성별 : ");
		String gender = sc.next();
		
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		
		
		
		
	}
}
