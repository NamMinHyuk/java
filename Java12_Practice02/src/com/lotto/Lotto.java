package com.lotto;

import java.util.Arrays;

public class Lotto {
	/*
	 * 중복되지 않는 6개 숫자 (1~45)를 작은 순부터
	 */
	// 로또 배열 생성
	private int[] make() {
		int[] arr = new int[6];
		int index = 0;
		
		while(index < 6) {
			int insert = (int)(Math.random()*45)+1;
			//!true = false
			if(!isSame(arr, insert)) {
				arr[index] = insert;
				index++;
			}
		}
		
		return arr;
	}
	// 중복 값 판별
	private boolean isSame(int[] arr, int insert) {
		boolean same = false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == insert) {
				same = true;
				break;
			}
		}
		return same;
	}
	// 정렬
	private void sorting(int[] arr) {
		// bubble sort
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				//System.out.println(i + "->" + Arrays.toString(arr));
				if(arr[j] > arr[j+1]) {
					// swap
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	//배열 출력
	public void prn() {
		int[] arr = make();
		sorting(arr);
		//Arrays.sort(arr);
		System.out.print("[ ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	public static void lottoPrn() {
		int []ran = new int[6];
		for(int i=0;i<ran.length;i++) {
		ran[i] = (int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(ran[i]==ran[j]) {
					i--;
				}
				if(ran[i]<ran[j]) {
					int num = ran[i];
					ran[i] = ran[j];
					ran[j] = num;
				}
			}
		}
		for(int i=0;i<ran.length;i++) {
			System.out.println(i+"번째숫자 : " + ran[i]);
		}
	}
}
