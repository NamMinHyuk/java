package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.compare.Score;

public class MTest02 {
	
	public static void main(String[] args) {
		Set<Score> set = new HashSet<Score>();
		set.add(new Score("홍길동", 100, 90, 60));
		set.add(new Score("이순신", 50, 95, 100));
		set.add(new Score("김선달", 88, 100, 58));
		
		//printSet(set);
		transElement(set, "이순신", 10);
		System.out.println(set);
	}

	private static void transElement(Set<Score> set, String name, int kor) {
		// set에서 name을 찾아서, 국어점수의 값을 kor로 바꾸고, 전체 출력하자.

		Iterator<Score> ir = set.iterator();
		while (ir.hasNext()) {
			Score temp = ir.next();

			if (temp.getName().equals(name)) {
				temp.setKor(kor);
			}
		}
	}

	private static void printSet(Set<Score> set) {
		// 방법 1
		/*
		for(Score sc : set) {
			System.out.println(sc);
		}
		*/
		// 방법 2
		/*
		Object[] objectArr = set.toArray();
		for (int i =0; i<objectArr.length;i++) {
			// 이름만 출력해주세요.
			System.out.println(((Score)objectArr[i]).getName());	
		}
		*/
		
		// 방법 3
		// iterator : collection의 저장 요소들을 읽어드리는 표준화된 방법!
		Iterator<Score> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
