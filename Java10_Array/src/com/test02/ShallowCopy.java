package com.test02;

import java.util.Arrays;

public class ShallowCopy {

	public static void main(String[] args) {
		// reference 복사 (얕은 값 복사, 주소값 복사)
		int[] original = {10,20,30,40};
		
		// copy에 주소값이 들어가 있다.
		int[] copy = original;
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		System.out.println(original == copy);
		
		copy[1] = 200;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		System.out.println("---------------");
		
		System.out.println(original.hashCode());
		System.out.println(copy.hashCode());
	}
}
