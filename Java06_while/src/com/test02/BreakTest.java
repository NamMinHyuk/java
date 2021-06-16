package com.test02;

public class BreakTest {
	/*
	 * A B C D E 
	 * F G H I J
	 * K L M N O 
	 * P Q R S T 
	 * U V W X Y 
	 * Z 를 출력하자.
	 * 
	 */
	public static void prn() {
		int count = 0;
		char c = 'A';
		boolean stop = false;

		while (!stop) {
			while (true) {
				System.out.printf("%2c", c);
				c++;
				count++;

				if (count % 5 == 0) {
					break;
				}

				if (count % 26 == 0) {
					stop = true;
					break;
				}
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		prn();

	}
}
