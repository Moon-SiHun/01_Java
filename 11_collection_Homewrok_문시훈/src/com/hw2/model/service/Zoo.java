package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {
	
	// 동물들을 저장하는 리스트
	private List<Animal> animals;
	
	// 기본 생성자
	public Zoo() {
		// 생성자에서 animals = new ArrayList<Animal>();로 animals 
		// 리스트를 빈 리스트로 초기화
		// 즉, 동물들을 저장할 수 있는 공간을 만들어주는 역할을 함
		animals = new ArrayList<Animal>();	
	
	}
	// Zoo에 동물을 추가하는 메서드
	public void addAnimal(Animal animal) {
		// animals.add(animal);를 통해 동물 객체를 리스트에 추가
		animals.add(animal);
	
	}
	// 동물원에 있는 모든 동물들이 울음소리를 내게 하는 역할
	public void showAnimals() {
		// animals 리스트에 있는 동물들을 하나씩 꺼내서, 
		// 각 동물의 sound() 메서드를 호출
		for(Animal animal : animals) {
			animal.sound();
		}
	}
	// 사용자에게 메뉴를 제공하고 입력을 받는 역할
	// 콘솔에 실행되는 부분
	public void displayMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		// menuNum 변수를 0으로 초기화
		// 초기값으로 0을 설정, 메뉴를 선택하기 전의 기본값
		int menuNum = 0;
		
		// 사용자가 메뉴에서 "2" (종료)를 선택할 때까지 반복
		do {
			System.out.println("***** KH 동물원 *****");
			System.out.println("원하는 작업을 선택하세요");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.println("선택 : ");
			
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			// 1을 입력하면 showAnimals() 메서드를 호출
			case 1 : showAnimals(); break;
			// 2를 입력하면 "프로그램 종료합니다"를 출력하고, 루프를 종료
			case 2 : System.out.println("프로그램 종료합니다"); break;
			// 1도 2도 아닌 다른 값을 입력하면 "잘못된 선택입니다" 메시지가 출력
			default : System.out.println("잘못된 선택입니다. 다시 선택해주세요...");
			}
			// 2를 입력할 때까지 메뉴를 반복해서 보여줘. 2를 입력하면 루프가 종료
		} while(menuNum != 2); 
		
	}

}
