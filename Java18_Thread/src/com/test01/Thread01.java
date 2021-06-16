package com.test01;
class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i : " + i);
		}
	}
	
}

public class Thread01 {
	
	public static void main(String[] args) {
		// main thread의 우선순위가 높다!!
		System.out.println("main thread start!!!");
		/*// Thread가 아니다.
		MyThread t01 = new MyThread();
		MyThread t02 = new MyThread();
		t01.run();
		t02.run();
		*/
		
		// Thread 이다..
		Thread t01 = new Thread(new MyThread());
		Thread t02 = new Thread(new MyThread());
		
		// start() : 자동으로 run() 호출
		
		t01.start();
		t02.start();
		
		System.out.println("main thread stop!!!");
	}
}
