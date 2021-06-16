package com.test02;

public class MTest {
	
	// String을 +연산할 때, 내부적으로는 StringBuilder로 변환하여 연산함 (jdk 1.5이후)
	public static void main(String[] args) {
		//stringTest();
		stringBufferTest();
	}
	public static void stringBufferTest() {
		// mutable
		StringBuffer sb = new StringBuffer();
		sb.append("안녕하세요!")
		.append("저는 ")
		.append("김선달 입니다.");
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.replace(0, 6, "하이!");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.reverse();
		System.out.println(sb);
	}
	public static void stringTest() {
		// immutable
		String s = "안녕하세요!";
		s += "저는 ";
		s += "홍길동입니다.";
		
		System.out.println(s);
		System.out.println(s.hashCode());
		//바꾸기만 하고 대입해서 출력해도 그대로 출력된다.
		//바꿀려면 s = s.replace로 대입해야된다.
		s.replace("안녕하세요!", "하이");
		System.out.println(s);
	}
}
