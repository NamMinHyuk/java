package com.test03;

public class MTest03 {
	
		public static void main(String[] args) {
			/*
			 *  1  2  3  4  5
			 *  10 9  8  7  6
			 *  11 12 13 14 15
			 *  20 19 18 17 16
			 *  21 22 23 24 25
			 *  
			 *  모양의 2차원 배열을 만들자.
			 *  출력하자.
			 */
			int[][] arr = new int[5][5];
			int cnt = 1;
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = cnt++;
					}
				} else {
					for (int j = arr[i].length - 1; j >= 0; j--) {
						arr[i][j] = cnt++;
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("%3d", arr[i][j]);
				}
				System.out.println();
			}
		}
	}
