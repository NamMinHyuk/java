package com.triangle;

import java.util.Scanner;

/*
 * 1. 각 라인의 처음과 마지막은 1이다.
 * 2. 각 라인의 두번째부터는 이전 줄의 2개 숫자를 더한다.
 * 		n번째 라인의 m번째 숫자=
 * 		(n-1)번째 라인의 (m-1)번째 숫자 + (n+1)번째 라인의 m번째 숫자
 * 3. 입력한 숫자만큼의 라인이 출력되도록 하자.
 * ex)
 * 라인 입력 : 6
 *            1
 *          1  1
 *         1  2  1
 *        1  3  3  1
 *       1  4  6  4  1
 *      1 5  10 10  5  1
 */      
public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("라인 입력 : ");
		int n = sc.nextInt();

		int[][] arr = new int[n][];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}
	
	public static void prn(int line) {
		int[][] arr = new int[line][line];
		arr[0][0] = 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
			for (int j = 1; j < i; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}
		for (int i = 0; i < line; i++) {
			for (int k = 0; k < 6 - i; k++) {
				System.out.printf(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.printf(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
