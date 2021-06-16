package com.test04;

public abstract class Animal {

	public abstract void bark();
	
	public void eat(String feed) {
		System.out.println(feed + "먹는다.");
	}
}
