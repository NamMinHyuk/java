package com.test02;

// 카멜(낙타등) 표기법
// 새로운 단어가 나오면 대문자, 나머지 소문자
// class의 첫 글자는 대문자
public class TypeToType01 {
	
	// 메소드와 변수는 첫글자 소문자, 새로운 단어가 나오면 대문자, 나머지 소문자
	public static void main(String[] args) {
		
		// 묵시적 형 변환 (upCasting : 작은 타입에서 큰 타입으로 - promotion)
		byte b01 = 10;
		int i01 = b01;
		System.out.println(i01);
		
		// 명시적 형 변환 (downCasting : 큰 타입에서 작은 타입으로 - casting)
		int i02 = 100;
		byte b02 = (byte) i02;
		System.out.println(b02);
	}
}
