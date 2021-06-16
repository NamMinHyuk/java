package com.test03;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Functional04 {
	
	public static void main(String[] args) {
		// supplier
		Supplier<Integer> rnum = () -> (int)(Math.random()*45) + 1;
		System.out.println(rnum.get());
		System.out.println(rnum.get());
		System.out.println(rnum.get());
		
		// consumer
		Consumer<String> hello = (name) -> System.out.println("Hello, " + name);
		hello.accept("Lambda");
		// biconsumer
		BiConsumer<String, Integer> qclass =
				(subject, score) -> System.out.printf("%s 과목의 평균은 %d 입니다.", subject,score);
		qclass.accept("java", 100);
		
	}
}
