package com.test03;

public class MTest {

	public static void main(String[] args) {
		MyCalc.sum(10, 20);

		int sub = MyCalc.sub(10, 2);
		System.out.println(sub);

		double mul = MyCalc.mul(1.2, 3.4);
		System.out.println(mul);

		MyCalc.div(10, 3);

	}

}