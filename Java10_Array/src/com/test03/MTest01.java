package com.test03;
import java.lang.Math;
import java.util.Arrays;
public class MTest01 {
	
	public static void main(String[] args) {
		/*
		 *  1. 5칸짜리 int type의 값을 받을 수 있는 1차원 배열을 생성하자.
		 *  2. 반복문을 사용하여, 배열의 0번지부터 3번지까지(4개)
		 *     5 ~ 9 사이의 랜덤한 숫자를 각각 대입하자.
		 *  3. 배열의 0 ~ 3 번지에 저장된 값들을 모두 곱해서, 4번 인덱스에 저장하자.
		 *  4. 배열 출력하자.
		 *  5. 배열 안에 있는 모든 값(0 ~ 4번지)을 더해서 출력하자.
		 */
		int[] arr = new int[5];
		int sum = 0;
		arr[4] = 1;
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = (int)(Math.random()*5)+5;
			arr[4] *= arr[i];
			sum += arr[i];
		}
		sum += arr[4];
		System.out.printf(Arrays.toString(arr));
		System.out.printf("\n총합 : %d", sum);
	}
}
