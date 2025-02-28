package edu.kh.excption;

public class Test {

	public static void main(String[] args) {
		
		// 컴파일 에러 => 개발자가 코드를 잘못 쓴 경우
		// 자료형이 맞지 않아 연산불가하여 "컴파일 에러가 발생
		//int a= 99.9; // Type mismatch: cannot convert from double to int
		int a = (int)99.9; // 코드 수정 가능
		
		// 런타임 에러 => 프로그램 수행 중 발생하는 에러
		//				주로 if문으로 처리 가능
		int[] arr = new int[3]; // 길이 3 : 인덱스 0,1,2
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		// arr[3] = 40;
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		// 배열 범위 초과 예외
		
		if(3 >= arr.length) { // 배열 인덱스 범위 초과한 값이 들어왔다면
			System.out.println("배열 범위를 초과했습니다");
		}else {
			arr[3] = 40;
			System.out.println("배열 범위 안정적");
		}

	}

}
