package com.test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.compare.Score;

public class MTest02 {
	
	public static void main(String[] args) {
		List<Score> list = new ArrayList<Score>();
		
		Score hong = new Score();
		hong.setName("홍길동");
		hong.setKor(100);
		hong.setEng(78);
		hong.setMath(39);
		list.add(hong);
		
		Score lee = new Score("이순신", 79, 100, 78);
		list.add(lee);
		
		list.add(new Score("김선달", 50, 90,100));
		
		System.out.println(list);
		
		System.out.println("----------");
		Collections.sort(list, new MySortTest());
		System.out.println(list);
		
	}
}
/*
 *  + : 앞의 인자가 더 큰값
 *  0 : 같은 값
 *  - : 뒤의 인자가 더 큰값
 */
	
class MySortTest implements Comparator<Score>{

	@Override
	public int compare(Score o1, Score o2) {
		if(o1.getAvg() > o2.getAvg()) {
		return 1;
		}else if (o1.getAvg() < o2.getAvg()) {
			return -1;
		}
		return 0;
	}
	
}