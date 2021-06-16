package com.test01;

public class Thread04 {
	
	public static void main(String[] args) {
		
	MyThread03 t01 = new MyThread03("멍멍");
	MyThread03 t02 = new MyThread03("야옹");
	
	long startTime = System.currentTimeMillis();
			
	t01.start();
	
	try {
		// t01 thread가 종료될 때 까지 다른 thread 멈춤
		t01.join();
	} catch (Exception e) {
		e.printStackTrace();
	}
	t02.start();
	
	long endTime = System.currentTimeMillis();
	
	System.out.println("실행시간 : " + (endTime - startTime));
	
	
	}
}
