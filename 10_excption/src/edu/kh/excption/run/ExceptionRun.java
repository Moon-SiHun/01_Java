package edu.kh.excption.run;

import edu.kh.excption.model.service.ExceptionService;
import edu.kh.excption.model.service.UserException;

public class ExceptionRun {
	
	public static void main(String[] args) {
		
		try {
			new ExceptionService().ex5();
			
		} catch (UserException e) {

			System.out.println(e.getMessage());
		}
		
	}

}
