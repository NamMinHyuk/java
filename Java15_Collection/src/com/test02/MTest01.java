package com.test02;

import java.util.ArrayList;
import java.util.List;

public class MTest01 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("강호동");
		list.add("유재석");
		list.add("조세호");
		list.add("신동엽");
		//trasElement(list);
		list.add("이순신");
		
		System.out.println(list);
		
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(9);
		ls.add(6);
		ls.add(3);
		ls.add(5);
		
		System.out.println(ls);
	}
	
	public static void trasElement(List<String> list) {
		// 1. 홍길동의 인덱스를 찾아, 해당 인덱스의 값을 김길동으로 바꾸자.
			list.set(list.indexOf("홍길동"),"김길동");
			System.out.println(list);
		// 2. ~신으로 끝나는 객체를 찾아서
		// 만일 있으면 "신"을 "자"로 바꾸자.
		for(int i=0;i<list.size();i++) {
			if(list.get(i).endsWith("신")) {
				list.set(i,list.get(i).replace("신", "자"));
			}
		}System.out.println(list);
		// 3. 끝 글자가 "호"인 객체를 찾아서
		// 삭제하자.
		for(int i=0;i<list.size();i++) {
			if(list.get(i).endsWith("호")) {
				//list.remove(i);
				list.remove(list.get(i));
			}
		}System.out.println(list);
	}
}
