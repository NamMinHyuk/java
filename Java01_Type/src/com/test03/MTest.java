package com.test03;

public class MTest {
	
	public static void main(String[] args) {
		/*
		 *  System.out.print();
		 *  -> console에 출력.
		 *  
		 *  System.out.println();
		 *  -> console에 출력. + 새로운 줄
		 *  
		 *  System.out.printf();
		 *  -> print'f' f: formatter (자리 or 형식 지정)
		 *  -> java.util.Formatter 확인!
		 *  
		 */

		int i = 100;
		System.out.print("1. i: " + i + "\n");
		System.out.println("2. i: " + i);
		System.out.printf("3. i: %5d\n" , i);
		System.out.println("\t끝");
		
		// escape character : \n \t \\
		
		
		// "시험 점수 결과는 su점 이고, 학점은 'grade'가 나왔다. \n나의 오늘 감정지수는 d%이다."
		int su = 100;        	// 10칸
		char grade = 'A';		// 5칸
		double d = 90.56;		// 5칸.소수점 첫째자리까지만
		System.out.printf("시험 점수 결과는 %10d점 이고, 학점은 '%5c'가 나왔다.\n나의 오늘 감정지수는 %5.1f%%이다." , su , grade , d);
		
		
		
		
	}
}
