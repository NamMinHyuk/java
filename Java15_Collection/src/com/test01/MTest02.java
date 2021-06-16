package com.test01;

import java.util.Vector;

public class MTest02 {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("홍길동");
		v.add("이순신");
		v.add("강호동");
		v.add("유재석");
		v.add("신동엽");
		v.add("조세호");
		v.add("조세호");

		// System.out.println(v);
		// prnVector(v);
		transElement(v);
	}

	public static void transElement(Vector<String> v) {

		// 1. 홍길동의 인덱스를 찾아, -> v.indexOf("홍길동")
		// 해당 인덱스의 값을 홍길순으로 바꿔라.
		v.set(v.indexOf("홍길동"), "홍길순");
		System.out.println(v);
		for (int i = 0; i < v.size(); i++) {
			// 2. ~신으로 끝나는 객체를 찾아서,
			// 만일 있으면 "신"을 "자"로 바꾸자.
			if (v.get(i).endsWith("신")) {
				v.set(i, v.get(i).replace("신", "자"));
			}

		}
		System.out.println(v);
		// 3. 마지막 글자가 "호"인 객체를 찾아서
		// 만일 있으면 삭제하자.
		for (String s : v) {
			if (s.endsWith("호")) {
				// java.util.ConcurrentModificationException
				// v.remove(s);

			}
		}
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).endsWith("호")) {
				v.remove(i);
			}
		}System.out.println(v);// 첫번째 조세호는 사라지고 i++ 해서 뒤에 조세호는 안지워짐

	}

	public static void prnVector(Vector<String> v) {
		// <홍길동 이순신 ... 조세호 > 형태로 출력하자.
		System.out.print("< ");
		/*
		 * for(int i =0;i<v.size();i++) { System.out.print(v.get(i) + " "); }
		 */

		// 향상된 for문 (forEach문)
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.print(">");
	}
}
