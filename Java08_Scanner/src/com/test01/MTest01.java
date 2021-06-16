package com.test01;

import java.util.Scanner;

public class MTest01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요 : ");
		int a = sc.nextInt();
		System.out.println("다시한번 입력해 주세요 : ");
		int b = sc.nextInt();
		
		System.out.println("두 숫자의 합은 " + (a+b) + "입니다.");
	}
}
