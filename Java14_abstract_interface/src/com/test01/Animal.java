package com.test01;

public abstract class Animal {
	
	//
	public void eat(String feed) {
		System.out.println(feed + "먹는다.");
	}
	
	// 추상 메소드 -> 상속받는 자식 클래스가 반드시 구현!!
	public abstract void bark();
}
