package com.compare;

import java.util.Arrays;

public class MTest {
	
	public static void main(String[] args) {
		
		Score[] qclass = new Score[3];
		Score hong = new Score();
		hong.setName("홍길동");
		hong.setKor(100);
		hong.setEng(78);
		hong.setMath(39);
		qclass[0] = hong;

		Score lee = new Score("이순신", 79, 100, 78);
		qclass[1] = lee;

		qclass[2] = new Score("김선달", 50, 90, 100);

		for (Score s : qclass) {
			System.out.println(s);
		}
		System.out.println("----------");
		Arrays.sort(qclass);
		
		for(Score s: qclass) {
			System.out.println(s);
		}
	}
}
