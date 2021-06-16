package com.b;

import com.a.AAA;

public class MTest {
	public static void main(String[] args) {
		BBB b1 = new BBB();
		b1.setAbc(10); //상속 부모꺼를 마음대로 쓸수 있음.
		b1.setB(20); 
		System.out.println(b1.getAbc());
		System.out.println(b1.getSum());
		
		BBB b2 = new BBB(10);
		System.out.println(b2.getAbc());
		System.out.println(b2.getB());
		System.out.println(b2.getSum());
		b2.prn();
		
		AAA a1 = new AAA();
		AAA a2 = new BBB();
		
		a1.prn();
		a2.prn();
	}
}
