package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;

public class Run {

	public static void main(String[] args) {

		Novel n1 = new Novel();
		n1.displayinfo();
		System.out.println();
		
		Book[] arr = new Book[3];
		 
		arr[0] = new Novel("해리포터", "J.K 롤링", "판타지");
		
		arr[1] = new Textbook("해리포터", "J.K 롤링", "판타지");
		
		arr[0].displayinfo();
	}

}

