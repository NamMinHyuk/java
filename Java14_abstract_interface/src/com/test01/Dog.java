package com.test01;

public class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("멍멍");
	}

	@Override
	public void eat(String feed) {
		System.out.print("멍멍이가 ");
		super.eat(feed);
	}
}
