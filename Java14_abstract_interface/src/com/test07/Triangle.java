package com.test07;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변 : ");
		int x = sc.nextInt();
		System.out.println("높이 : ");
		int y = sc.nextInt();
		
		double res = (double)x * y / 2;
		setResult(res+"");
	}
	public void print() {
		System.out.print("삼각형의");
		super.print();
	}
}
