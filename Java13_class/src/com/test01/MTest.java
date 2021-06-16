package com.test01;

public class MTest {
	
	public static void main(String[] args) {
		AA a = new AA();
		
		// 부모 타입으로 자식 객체 대입 ex) 동물타입의 고양이
		Super s = a;
		//AA abc = (AA) s;
		//System.out.println(abc);
		
		BB b = (BB) s; // 명시적 형변환 큰거에서 작은거로 
		System.out.println(b);
	}
}
