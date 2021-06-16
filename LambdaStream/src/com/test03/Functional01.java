package com.test03;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Functional01 {
	
	public static void main(String[] args) {
		
		UnaryOperator<String> hello = (name) -> "Hello, " + name;
		System.out.println(hello.apply("Lambda"));
		
		BinaryOperator<Integer> sum = (i, j) -> i + j;
		System.out.println(sum.apply(10,3));
		
		System.out.println(sum.andThen((n) -> n *2).apply(10, 3));
	}
}
