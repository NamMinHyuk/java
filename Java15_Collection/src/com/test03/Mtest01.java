package com.test03;

import java.util.HashSet;
import java.util.Set;

public class Mtest01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("3");
		set.add("5");
		set.add("2");
		set.add("6");
		set.add("4");
		set.add("7");
		set.add("3");
		set.add("3");
		
		for(String s: set) {
			System.out.println(s);
		}
		
		findSetElement(set, "5");
	}
	
	public static void findSetElement(Set<String> set, String find) {
		// set에 있는 특정 요소가 find와 같은 값일 때, "5 찾았다!" 라고 출력하자.
		/*
		 * set은 순서가 없기 때문에, get(index) 메소드가 없다! for(int i=0;i<set.size();i++) {
		 * set.get(i); }
		 */
		for (String s : set) {
			if (s.equals(find)) {
				System.out.println(find + " 찾았다!");
			}
		}
	}
}