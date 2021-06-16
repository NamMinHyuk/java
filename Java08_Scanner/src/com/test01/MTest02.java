package com.test01;

import java.util.Scanner;

public class MTest02 {

	public static void main(String[] args) {
		test01();
	}
	
	public static void test01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아무거나 입력해주세요:");
		
		String token = sc.next();
		System.out.println(token);
		
		String token2 = sc.next();
		System.out.println(token2);
		
		String token3 = sc.next();
		System.out.println(token3);
		
		System.out.println("nextLine 입력");
		// nextLine사용할려면 토큰 싹 날리고 쓰는게 좋다.
		sc.nextLine();
		String line = sc.nextLine();
		System.out.println(line);
	}
}
