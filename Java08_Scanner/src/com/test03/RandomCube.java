package com.test03;

public class RandomCube {
	
	public static void main(String[] args) {
		prn();	
	}
	
	/*
	 * 1)
	 * 1 ~ 9 사이의 랜덤한 숫자를 가지고
	 * 5 * 5 형태의 숫자 상자를 출력하자.
	 * 2 4 1 2 4
	 * 1 3 2 4 1
	 * 5 7 8 2 1
	 * 5 8 7 7 9
	 * 5 1 2 9 1
	 * 
	 * 2)
	 * 만들어진 큐브에서 X의 합을 출력하고
	 * 전체(25개 숫자)의 평균을 출력하자.
	 * 
	 */
	
	public static void prn() {
		int sumX = 0;
		int cnt = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int random = (int) (Math.random() * 9) + 1;
				System.out.printf("%d ", random);
				// X(대각선)의 합
				if ((i == j) || (i + j == 4)) {
					sumX += random;
				}
				// 전체 합
				sum += random;
				cnt++;
			} 
			System.out.println();
		}
		double avg = (double)sum/cnt;
		System.out.println("총합 : " + sumX);
		System.out.println("전체 평균 : " + avg);
	}
}
