package com.test04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MTest {
	
	public static void main(String[] args) {
		// createStream();
		// craeteCollection();
		pipeline();
	}

	private static void pipeline() {
		List<String> qclass = Arrays.asList("홍길동", "이순신", "김선달", "조세호", "강호동", "유재석", "신동엽", "펭수");
		List<String> dong = qclass.stream().filter(name -> name.contains("동")).sorted().collect(Collectors.toList());
		
		System.out.println(dong);
		
		List<String> two = qclass.stream().filter(name -> name.length() == 2).collect(Collectors.toCollection(ArrayList::new));
		
		two.forEach(System.out::println);
		
		// qclass에서 "동"이라는 글자를 포함한 사람들을 찾고,
		// 이름 마지막 글자를 *로 바꾸고,
		// 정렬하고, List로 담고, forEach로 출력하자.
		List<String> answer = qclass.stream().filter(name -> name.contains("동")).map(w -> w.replace(w.substring(w.length()-1,w.length()),"*")).sorted().collect(Collectors.toList());
		answer.forEach(System.out::println);
		
		System.out.println(qclass.stream().filter(name->name.contains("동")).count());
		
		// lotto
		List<Integer> lotto = Stream.generate(()->(int)(Math.random()*45)+1).distinct().limit(6).sorted().collect(Collectors.toList());
		lotto.forEach((i) -> System.out.print(i + " "));
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
	}
}
