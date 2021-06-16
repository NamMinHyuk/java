package com.test02;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		//mathClass();
		randomClass();
	}
	
	public static void randomClass() {
		Random rd = new Random();
		System.out.println(rd.nextInt(100));
	}
	public static void mathClass() {
		// 0.0 <= x < 1.0;
		//double dran = Math.random();
		//System.out.println(dran);
		
		// min ~ max 까지
		// (int)(Math.random()*(max - min + 1)) + min;
		int min = 100;
		int max = 110;
		int ran = (int)(Math.random()*(max-min+1)+min);
		System.out.println(ran);
	}
}
