package com.test03;

public class SumX {

	/*
	 *  1  2  3  4  5
	 *  6  7  8  9  10
	 *  11 12 13 14 15
	 *  16 17 18 19 20
	 *  21 22 23 24 25
	 *  
	 *  x의 총 합을 구하자 
	 * (117)
	 * 
	 * hint : 행렬이라고 생각해보자.( for문 두개)
	 */
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if ((i == j) || (((i + j) == 4))) {
					sum += num;
				}
				num++;
			}
		}
		System.out.printf("총합 : %d", sum);
	}
}
