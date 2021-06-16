package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCalc {
	
	public int calculation() {
		int res = 0;
		
		while (true) {
			try {
				res = inputNum() / inputNum();

				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하라고!");
				e.printStackTrace();
			} catch (ArithmeticException e) {
				System.out.println("0으로 나누시면 안됩니다.");
				e.printStackTrace();
			}
		}

		return res;
	}
	
	public int inputNum() {
		System.out.println("숫자만 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
}
