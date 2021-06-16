package com.test07;

import java.util.Scanner;

public class Circle extends AreaImpl {

	
	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력해 주세요 : ");
		int r = sc.nextInt();
		
		double res = Math.PI * Math.pow(r, 2);
		// result = res;
		/*
		 * Double.toString(res);
		 * String.valueOf(res);
		 */
		setResult(String.format("%.2f" , res) +"");
	}
	public void print() {
		System.out.print("원의");
		super.print();
		
	}
}
