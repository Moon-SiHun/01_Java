package com.hw1.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Friend {
	
	private String name;
	
	// 기본 생성자
	public Friend() {}

	
	
	// 매개변수 생성자
	public Friend(String name) {
	super();
	this.name = name;
	}
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
	// 골목대장 뽑기 메서드
	public void pickLeader() {
		System.out.println(name + "가 떡잎방범대 대장이다!");
	
	}
	
	

	
}
