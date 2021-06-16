package com.test01;

import java.util.Arrays;
import java.util.StringTokenizer;

public class MTest02 {
	
	public static void main(String[] args) {
		
		
		// substring : end= -1조심!!!
		String str = "The String class represents character strings.";
		System.out.println(str.substring(11,16));
		System.out.println(str.substring(4, 7));
		
		// split
		String str02 = "The,String,class";
		String [] splitArr = str02.split(",");
		for(int i=0; i<splitArr.length;i++) {
			System.out.println(splitArr[i]);
		}
		
		// StringTokenizer 잘 기억하기!!
		String str03 = "The_String_class";
		StringTokenizer tokenizer = new StringTokenizer(str03, "_");
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
	}
}