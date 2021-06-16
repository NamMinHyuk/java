package com.test02;

public class MTest {

	public static void main(String[] args) {
		MyCalc sum = (a, b) -> a + b;
		MyCalc sub = (a, b) -> a - b;
		MyCalc mul = (a, b) -> a * b;
		MyCalc div = (a, b) -> a / b;
		
		int i = 10;
		int j = 3;
		
		System.out.printf("%d + %d = %.0f\n",i, j, sum.calc(i, j));
		System.out.printf("%d - %d = %.0f\n",i, j, sub.calc(i, j));
		System.out.printf("%d * %d = %.0f\n",i, j, mul.calc(i, j));
		System.out.printf("%d / %d = %.2f\n",i, j, div.calc(i, j));
	}
}
