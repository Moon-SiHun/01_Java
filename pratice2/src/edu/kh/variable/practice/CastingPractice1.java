package edu.kh.variable.practice;

public class CastingPractice1 {
	
	public static void main(String[] args) {
		// 선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여
		// 주석에 작성된 값과 같은 결과가 나타나도록 코드를 완성하세요.
	
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
	
		System.out.println( iNum1 % iNum2); // 2 - % (나머지 연산자)를 사용 or /(나누기 연산자)
		System.out.println( (int)dNum ); // 2 -int(정수형 변수)를 사용
		
		System.out.println( iNum2 * dNum ); // 10.0 - *(곱하기 연산자)를 사용
		System.out.println( (double)iNum1 ); // 10.0 - double(실수형 변수)를  사용해서 정수->실수로 바꿈
		
		System.out.println( iNum1 / (double) iNum2 ); // 2.5 - iNum을 double(실수형)으로 바꿔서 나눔
		System.out.println( dNum ); // 2.5
		
		System.out.println( (int)fNum ); // 3 - int(정수형)으로 바꿈
		System.out.println( iNum1 / (int)fNum ); // 3 - fNum을 int를 사용하여 정수로 바꾸고 나눔
		
		System.out.println( iNum1 / fNum );// 3.3333333 - / (나누기 연산자)를 사용
		System.out.println( (double)iNum1 / fNum ); // 3.3333333333333335 - iNum을 저장값이 더 큰
															         //	double을 사용하여 실수로 바꾸고 나눔 
		
		System.out.println( ch ); // 'A' 
		System.out.println( (int)ch ); // 65 - 문자형 ch를 int를 사용해서 정수형으로 바꿈
		
		System.out.println( ch + iNum1 ); // 75 - 더하기 연산자를 사용
		System.out.println((char)(ch + iNum1)); // K - 괄호를 사용하여 형변환을 
														// 먼저 수행하고 그 결과를 문자로 처리
	}

}
