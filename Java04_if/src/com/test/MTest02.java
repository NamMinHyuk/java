package com.test;

public class MTest02 {

	public static void main(String[] args) {
		// 1. 입력받은 수가 5의 배수이면 "5의 배수입니다."를 출력
		test01(10);

		// 2. 입력받은 수가 2의 배수이면서 3의 배수이면 "2와 3의 배수입니다."를 출력
		// 아니라면, "2와 3의 배수가 아닙니다." 출력
		test02(7);

		// 3. 입력받은 문자가 소문자라면 "소문자 입니다.", 대문자라면 "대문자 입니다." 출력
		test03('A');
	}

	public static void test01(int i) {
		if (i % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}
	}

	public static void test02(int i) {
		if (i % 2 == 0) {
			if (i % 3 == 0) {
				System.out.println("2와 3의 배수입니다.");
			}
		} else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
	}
	/* case01
	public static void test03(char c) {
		if (c >= 'A' && c <= 'Z') {
			System.out.println("대문자입니다.");
		} else if (c >= 'a' && c <= 'z') {
			System.out.println("소문자입니다.");
		} else {
			System.out.println("영어가 아닙니다.");
		}
	}*/
	// case02
	public static void test03(char c) {
		if(Character.isLowerCase(c)) {
			System.out.println("소문자입니다.");
		}
		else if(Character.isUpperCase(c)) {
			System.out.println("대문자입니다.");
		}
	}
	
}
