package com.test02;

public class Cat extends Animal {

	public Cat() {
		System.out.println("고양이");
	}
	// @~~~ : annotation 
	// 재정의 : 부모의 메소드를 내맘대로 바꿈.
	@Override
	public void bark() {
		super.bark();
		System.out.println("야옹");
	}
	public void eat() {
		System.out.println("냠냠");
	}
	
}
