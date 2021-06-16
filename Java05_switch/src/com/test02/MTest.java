package com.test02;

public class MTest {
	public static void main(String[] args) {
		/*
		 *  1. com.test02 package에 Season 이라는 클래스를 만들자.
		 *  2. Season class에서 어디서나 접근 가능하고, int형 "월"값을 받으면 String으로 리턴하는
		 *  prn 메소드를 만들자.(non-static)
		 *  3. Season class의 prn method에서는
		 *     입력받은 월 값이 12, 1, 2 면 "겨울" 리턴
		 *     3, 4, 5면 "봄" 리턴
		 *     6, 7, 8이면 "여름" 리턴
		 *     9, 10, 11이면 "가을" 리턴
		 *     (switch를 사용하자.)
		 *     
		 *     4. MTest class의 main method에서 Season class의 prn method를 호출하는데,
		 *        아규먼트로 1월을 넣어줘서 리턴받은 값을 출력하자.
		 */
		Season season = new Season();
		String result = season.prn(1);
		System.out.println(result);
	}
}
