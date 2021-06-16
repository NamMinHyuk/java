package com.test02;

public class TypeToType02 {

	public static void main(String[] args) {
		
		// int to char
		int i = 65;
		char c = (char) i;
		System.out.println("65 = " + c);
		
		// char to int
		char c02 = 'a';
		int i02 = (int) c02;
		System.out.println(i02);
		
		// char to int
		char nine = '9';
		char one = '1';
		int i03 = nine + one;
		System.out.println(i03);
		
		// String to int
		String s01 = "65";
		System.out.println(s01 + 1);
		
		int i04 = Integer.parseInt(s01);
		System.out.println(i04 + 1);
		
		// int to String
		int i05 = 67;
		String s02 = String.valueOf(i05);
		String s03 = Integer.toString(i05);
		System.out.println(s02 + 1);
		System.out.println(s03 + 2);
	}
}
