package com.singleton;

public class MTest {
	
	public static void main(String[] args) {
		
		// 생성자가 private이라서.
		// Singleton s = new Singleton();
		
		Singleton st01 = Singleton.getInstance();
		System.out.println(st01);
		
		Singleton st02 = Singleton.getInstance();
		System.out.println(st02);
		
		System.out.println(st01 == st02);
		System.out.println(st01.hashCode());
		System.out.println(st02.hashCode());
	}	
}
