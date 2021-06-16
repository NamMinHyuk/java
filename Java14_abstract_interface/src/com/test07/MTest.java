package com.test07;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택해 주세요\n[1:원\t2:삼각형\t3:사각형]");
		
		int select = sc.nextInt();
		Area area = null;
		
		switch(select) {
		case 1:
			area = new Circle();
			break;
		case 2:
			area = new Triangle();
			break;
		case 3:
			area = new Square();
			break;
		}
		
		area.make();
		area.print();
	}
}
