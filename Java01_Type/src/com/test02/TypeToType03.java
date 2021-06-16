package com.test02;

public class TypeToType03 {
	
	public static void main(String[] args) {
		// Boxing : 기본타입 (값) -> 참조타입(wrapper class)
		Integer i = Integer.valueOf(100);
		
		
		
		// unBoxing : 참조타입(wrapper class -> 기본타입(값)
		// 명시적
		int j = i.intValue();
		// 묵시적
		int k = i;
		
		System.out.println(j);
		System.out.println(k);
		
	}
}
