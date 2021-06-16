package com.test01;

import java.util.Vector;

public class MTest01 {

	public static void main(String[] args) {
		// Vector(10, 5) -> iCa : 10 / CaInc : 5 
		// => 10의 용량을 가진 Vector 만드는데, 꽉 찬 후에 값을 또 넣어주면 용량이 5 증가해라
		Vector<Integer> v = new Vector<Integer>(10,5);
		System.out.println(v.size() + " : " + v.capacity());
		
		for(int i = 0; i < 9; i++) {
			v.add(i);
		}
		System.out.println(v.size() + " : " + v.capacity());
		System.out.println(v);
		
		v.add(9);
		System.out.println(v.size() + " : " + v.capacity());
		System.out.println(v);
		
		v.add(10);
		System.out.println(v.size() + " : " + v.capacity());
		System.out.println(v);
		
		Vector vector = new Vector();
		vector.add("123a");
		vector.add(2);
		vector.add(3);
		
		System.out.println(vector);
	}
}
