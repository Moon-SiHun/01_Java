package edu.kh.method.run;

import edu.kh.method.model.service.MemberService;
import edu.kh.method.service.MethodExample;

public class MethodRun {

	public static void main(String[] args) {
		
		MethodExample methodEx = new MethodExample();
		//methodEx.method1();
		
		
		MemberService service = new MemberService();
		service.displayMenu();
		

		// method2() 메서드 호출
		// method1() 메서드 호출
		// main 메서드 실행
	}

}
