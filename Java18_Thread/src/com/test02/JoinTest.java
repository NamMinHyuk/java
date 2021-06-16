package com.test02;

class MyCalc extends Thread {
	
	private int start;
	private int end;
	public int sum;
	public MyCalc(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		sum = 0;
		for(int i=start;i<=end;i++) {
			sum += i;
			System.out.println("current thread : " + currentThread().getName());
		}
	}
}
public class JoinTest {

	public static void main(String[] args) {
		MyCalc t01 = new MyCalc(1, 5);
		MyCalc t02 = new MyCalc(6, 10);
		
		t01.start();
		t02.start();
		
		try {
			t01.join();
			t02.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("t01 sum : " + t01.sum);
		System.out.println("t02 sum : " + t02.sum);
		System.out.println("total : " + (t01.sum + t02.sum));
		
		
	}
}
