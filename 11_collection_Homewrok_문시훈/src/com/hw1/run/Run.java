package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {

		// Friend 객체만 넣을 수 있는 ArrayList객체 생성 후
		// 짱구, 철수, 유리, 훈이, 맹구 객체 생성하여 ArrayList에 추가하기
		
		// List에서 다섯객체 중 랜덤으로 하나를 뽑아
		// 골목대장이 누군지 출력하기
		List<Friend> friendList = new ArrayList<>();
		
		// 멤버 5명 추가
		friendList.add(new Friend("짱구"));
		friendList.add(new Friend("철수"));
		friendList.add(new Friend("맹구"));
		friendList.add(new Friend("훈이"));
		friendList.add(new Friend("유리"));
		
		// List 에서 다섯 객체 중 랜덤으로 하나를 뽑기
		
		// 랜덤 객체 생성
		Random random = new Random();
		int index = random.nextInt(friendList.size()); // 0~4 
		
		// 골목대장 뽑기
		friendList.get(index).pickLeader();
		
		
		 // "짱구"가 골목대장이라면 특별한 메시지 출력

	}

}
