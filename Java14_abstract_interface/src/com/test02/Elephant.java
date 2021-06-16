package com.test02;

public class Elephant extends Animal {

	@Override
	public void start() {
		System.out.println("코끼리 걷는다.");
	}

	@Override
	public void stop() {
		System.out.println("코끼리 멈췄다.");
	}

}
