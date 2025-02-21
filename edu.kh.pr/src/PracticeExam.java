package edu.kh.pr;

import java.util.Scanner;

public class PracticeExam {
//================================================
	
	public void prt1() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("1");
	}
	public void prt2() {
		
		//int : 
		
		int age = 25;
		int kg = 17;
		System.out.println("나이는 + age ");
		System.out.println("무게는 + 17 ");
	//=================================================
		
		//boolean : 

		boolean isSunny = true;		// 날씨가 맑다 (참)
		boolean isRaining = false;	// 비가 오지 않는다 (거짓)

		System.out.println(isSunny);	// 출력: true
		System.out.println(isRaining);	// 출력: false
	//==================================================
		
		//String : 참(ture), 거짓(false)를 나타내는 
		
		String fruit = "사과";
		
		System.out.println(fruit);
		
	//==================================================
		
		//
		
		String rain = "빨주노초";
		String bow = "파남보";
		String sky = rain+bow;
		
		System.out.println(sky);
	//==================================================
		
		//(지정어.length()); - 문자열의 길이를 알 수 있다.
		
		String text = "가나다라마바사아자차카타파하";
		
		System.out.println(text.length());
		
		

	}
	}





