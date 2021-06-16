package com.test02;

import java.util.Arrays;

public class DeepCopy {

	public static void main(String[] args) {
		
		// 깊은 값 복사 (값 자체를 복사)
		int[] original = new int[] {10,20,30,40};
		
		//1. 인덱스 값 하나하나를 복사
		int[] copyOne = new int[original.length];
		for(int i=0;i<original.length;i++) {
			copyOne[i] = original[i];
		}
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyOne));
		System.out.println(original == copyOne);
		copyOne[1] = 200;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyOne));
		
		System.out.println("-----------------");
		// 2. 원본 객체에 복사 요청
		int[] copyTwo = original.clone();
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyTwo));
		System.out.println(original == copyTwo);
		copyTwo[2] = 300;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyTwo));
		
		System.out.println("------------------");
		
		// 3. System을 사용하여 복사
		
		int[] systemArray = new int[10];
		Arrays.fill(systemArray, 4);
		System.out.println(Arrays.toString(systemArray));
		
		System.arraycopy(original, 0, systemArray, 5, 3);
		System.out.println(Arrays.toString(systemArray));
		System.out.println("---------------------------");
		
		System.out.println(original.hashCode());
		System.out.println(copyOne.hashCode());
		System.out.println(copyTwo.hashCode());
		System.out.println(systemArray.hashCode());
	}
}
