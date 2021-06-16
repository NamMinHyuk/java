package com.test04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MTest {
	
	public static void main(String[] args) {
		// createStream();
		craeteCollection();
	}

	private static void craeteCollection() {
		String[] arr = new String[] {"1","2","3","4","5","6","7","8","9","10"};
		Stream<String> stream01 = Arrays.stream(arr);
		stream01.forEach(System.out::println);
		
		List<String> list01 = Arrays.asList(arr);
		System.out.println(list01);
		List<String> list02 = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
		list02.forEach(System.out::println);
		
		List<String> qclass = List.of("홍길동", "이순신", "김선달");
		qclass.forEach(System.out::println);
				
	}

	private static void createStream() {
		// builder
		Stream<String> stream01 = Stream.<String>builder().add("홍길동").add("이순신").add("김선달").build();
		stream01.forEach(System.out::println);
		
		// empty
		Stream<String> stream02 = Stream.empty();
		Object[] tmp = stream02.toArray();
		System.out.println(tmp);
		System.out.println(Arrays.toString(tmp));
		System.out.println(tmp.length);
		
		// generate
		Stream<Integer> stream03 = Stream.generate(() -> 100).limit(5);
		stream03.forEach(System.out::println);
		
		// iterator
		Stream<Integer> stream04 = Stream.iterate(1, (i) -> ++i).limit(5);
		stream04.forEach((i) -> System.out.print(i + " "));
		System.out.println();
		
		// range
		IntStream range01 = IntStream.range(1, 5);
		range01.forEachOrdered((i) -> System.out.print(i + " "));
	
		IntStream range02 = IntStream.range(1, 10);
		range02.for
	}
}
