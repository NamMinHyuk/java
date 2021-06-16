package com.test02;

import java.util.Scanner;

public class MTest {
	/*
	 동적 바인딩 : 실행시(runtime) 메모리 할당을 하면서, 메소드를 동적으로 연동하는 방식
	 1. 코드 절약	2. 실행속도 향상	3. 행위 은닉
	 */
	public static void main(String[] args) {
		System.out.println("선택해 주세요:[1: 고양이   2: 멍멍이  3: 코끼리]");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		Animal animal = null;
		
		switch(select) {
		case 1:
			animal = new Cat();
			break;
		case 2:
			animal = new Dog();
			break;
		case 3:
			animal = new Elephant();
			break;
		}
		
		animal.start();
		animal.stop();
		
		// instanceof : 타입 확인 연산자
		if(animal instanceof Cat) {
			System.out.println("Cat type");
		}else if (animal instanceof Dog) {
			System.out.println("Dog type");
		}else if (animal instanceof Elephant) {
			System.out.println("Elephant type");
		}
	}
}
