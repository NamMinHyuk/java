package com.test01;

class MyThread03 extends Thread{
	
	public MyThread03(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println(this.getName() + ": " + i);
		}
		
		System.out.println("----------" + this.getName() + "----------");
	}
}

public class Thread03 {
	
	public static void main(String[] args) {
		MyThread03 t01 = new MyThread03("멍멍");
		MyThread03 t02 = new MyThread03("야옹");
		
		// java의 thread scheduling 은 우선순위(priority)와 순환할당(round-robin) 방식을 사용한다.
		
		// priority : 우선순위 10이 가장 높고 0이 가장 낮음
		t01.setPriority(10);
		t02.setPriority(Thread.MIN_PRIORITY);
		
		t01.start();
		t02.start();
		
		System.out.println(t01.getName() + " vs " + t02.getName());
	}
	
}
