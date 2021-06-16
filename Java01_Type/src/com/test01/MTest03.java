package com.test01;

public class MTest03 {

	// 실수형 type : float(4), double(8)
	public static void main(String[] args) {
		// 실수형의 기본은 double
		// float = 접미사 f
		float f01 = 0.1f;
		float f02 = 1.3F;
		float sumF = f01 + f02;
		System.out.println(f01 + " + " + f02 + " = " + sumF);
		
		// double = 접미사 d (생략 가능)
		double d01 = 100.04;
		double d02 = 50.7d;
		double d03 = 200.15D;
		// 실수형의 연산은 double이 기본타입!
		double sumD = d01 + d02 + d03;
		System.out.println(sumD);
		
		
		
	}
}
