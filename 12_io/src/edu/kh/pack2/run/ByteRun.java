package edu.kh.pack2.run;

import edu.kh.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		/*
		// 불변성 (Immutable)의 String
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.hashCode()); // 69609650
		System.out.println(str2.hashCode()); // 69609650
		
		str2 = str2 + "world";
		System.out.println(str2.hashCode()); // 468881952
		
		// 가변성(Mutable)의 StringBuilder, StringBuffer
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode()); // 1450495309
		sb.append("Hello world");
		sb.append("12345");
		System.out.println(sb.hashCode()); // 1450495309
		*/
		
		ByteService service = new ByteService();
		//service.fileByteOutput();
		//service.fileByteInput2();
		//service.bufferedFileByteInput();
		service.readProperties();
	
	}

}
