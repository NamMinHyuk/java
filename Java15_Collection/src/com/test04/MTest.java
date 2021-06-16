package com.test04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MTest {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i = 111;i<116;i++) {
			map.put(i, i+"abc");
		}
		
		//System.out.println(map);
		map.put(112, "115abc");
		
		//System.out.println(map);
		printMap(map);
	}

	private static void printMap(Map<Integer, String> map) {
		// key들만 출력하자.
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
			
		// value들만 출력하자.
		Collection<String> values = map.values();
		System.out.println(values);
		// key가 111인 value를 출력하자.
		System.out.println(map.get(111));
		
		// Entry : key와 value를 한 번에 관리하는, map 과는 달리, key value 각각을 관리한다.
		// Map<key, value> : get(key) -> value 리턴
		// Entry : getKey(), getValue() 따로.
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			//System.out.printf("%d : %s\n" , entry.getKey(), entry.getValue());
			
			
		}
		// key가 111 인 요소의 key 와 value를 각각 출력하자.
		
		int key = 111;
		Set<Map.Entry<Integer, String>> test = map.entrySet();
		Iterator<Entry<Integer, String>> ir = test.iterator();
		while(ir.hasNext()) {
			Entry<Integer, String> entry = ir.next();
			if(entry.getKey() == key) {
				System.out.println(key + " :" + entry.getValue());
			}
		}
	}

}
