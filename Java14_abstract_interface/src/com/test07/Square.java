package com.test07;

import java.util.Scanner;

public class Square extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변 : ");
		int x = sc.nextInt();
		System.out.println("높이 : ");
		int y = sc.nextInt();
		
		int res = x * y;
		setResult(res + "");
	}
	public void print() {
		System.out.print("사각형의");
		super.print();
	}
}
