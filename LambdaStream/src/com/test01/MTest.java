package com.test01;

public class MTest {
	
	public static void main(String[] args) {
		
		Test01 test01_1 = new Test01() {
			@Override
			public void prn() {
				System.out.println("test01_1");
			}
		};
		test01_1.prn();
		
		// () -> {code}
		Test01 test01_2 = () -> {System.out.println("test01_2");};
		test01_2.prn();
		
		// () -> code
		Test01 test01_3 = () -> System.out.println("test01_3");
		test01_3.prn();
		
		// (type parameter) -> code
		Test02 test02_1 = (int n) -> System.out.println("test02_1 : " + n);
		test02_1.prn(10);

		// (parameter) -> code
		Test02 test02_2 = (n) -> System.out.println("test02_2 : " + n);
		test02_2.prn(20);
		
		// parameter -> code
		Test02 test02_3 = n -> System.out.println("test02_3 : " + n);
		test02_3.prn(30);
		
		// (parameter) -> {return code}
		Test03 test03_1 = n -> {return n + n;};
		System.out.println(test03_1.prn(40));
		
		// (parameter) -> code
		Test03 test03_2 = n -> n + n;
		System.out.println(test03_2.prn(50));
		
		Test03 test03_3 = n -> {
			int k = n +10;
			return n + k;
			};
		System.out.println(test03_3.prn(60));
		
		Test04 test04 = (i, j) -> {
			System.out.printf("%d * %d = ", i, j);
			return i * j;
		};
		System.out.println(test04.prn(2, 3));
	}
}
