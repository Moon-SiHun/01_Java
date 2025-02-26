package edu.kh.variable.practice;

import java.util.Scanner;

public class ReExam {

	public void ex1() {
		
	//검색할 과일을 입력하세요: 사과
	//과일이 목록에 있습니다.
	//프로그램을 종료합니다.
		
		Scanner sc = new Scanner(System.in);
		
		// 배열에 들어갈 과일
		String[]arr = { "사과", "포도", "딸기", "수박", "자두"};
		
		System.out.print("검색할 과일을 입력하세요. : ");
		String search = sc.next(); //문자열을 입력받을 때는 next() 사용
		
		boolean result = false;
		
		for(int i = 0; i < arr.length; i++) { // i는 0부터 시작(index 순서가 0부터)
											// i는 총 배열의 길이보다 작음
			
			if(arr[i].equals(search)) { // 만약if(배열arr[i]와 같다면.equals 입력값search이
				result = true; // 결과는 참이다
				break; //참이 나왔으니 멈춤
				
			}
		}
				
		if(result) {
			System.out.println("과일이 목록에 있습니다.");
			
			}else {
				System.out.println("존재하지 않습니다.");
				
			}
		}
		
	public void ex2() {
		
		System.out.println("숫자를 입력하세요");
		
		
	}
	
}		
		
	
	

