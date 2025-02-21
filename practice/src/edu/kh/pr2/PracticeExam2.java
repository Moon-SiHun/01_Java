package edu.kh.pr2;

import java.util.Scanner;

public class PracticeExam2 {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		/*
		 사용자로부터 한개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		 만일 1미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요."를 출력하세요.
		 */
		
		// 1. 내가 입력한 값(input)이 조건에 맞는지 파악하기
		// -> 조건문을 이용해야한다! -. if
		System.out.print("1 이상의 숫자를 입력하시오 : ");
		int input = sc.nextInt();
		
		if(input >= 1) { //조건 0
			
			// 1부터 input까지 1씩 증가 반복 출력
			for(int i = 1; i <= input; i ++) {
				System.out.print(i + " ");
			}
		}else { // 조건 X
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} 
	}
public void practice2() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("1 이상의 숫자를 입력해라");
	int input = sc.nextInt();
	
	if(input >= 1) { //
	
	
}
}
public void practice3() {
	Scanner sc = new Scanner(System.in);
	/*
	 * 1부터 사용자에게 입력받은 수까지의
	 * 정수들의 합을 for문을 이용하여 출력하세요.
	 * 
	 * 1 + 2 + 3 + 4 + 5 = 15
	 */
	System.out.print("정수를 하나 입력하세요 : ");
	int input = sc.nextInt();
	
	int sum = 0; // 합계용 변수
	
	for(int i = 1; i <=  input; i++) {
		sum += i; //6
		
		//마지막 숫자인 경우 "+" 출력하지 않음
		if(i == input) { //마지막 턴
			System.out.print(i + " = " + sum);
		
		}else { //이전 턴
			System.out.print(i + " + ");
			
		}
	}
}
public void practice5() {
	/*
	 * 사용자로부터 입력받은 숫자의 단을 출력하세요.
	 */
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("숫자 : ");
	int dan = sc.nextInt();
	
	System.out.println("=======" + dan + "단 =======");
	for(int i = 1; i <= 9; i++) {
		System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		
	}
}
public void practice6() {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("학생 수 입력 : ");
	
	int num = sc.nextInt();
	
	}
}
