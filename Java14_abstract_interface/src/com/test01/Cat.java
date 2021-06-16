package com.test01;

public class Cat extends Animal {

	// bark() -> 반드시!
	@Override
	public void bark() {
		System.out.println("야옹");
	}

	// eat() -> 해도되고, 안해도되고.
}
