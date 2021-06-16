package com.test02;

public class SleepTest {
	
	public static void main(String[] args) {
		
		while(true) {
			
			for(int i = 1; i <= 10;i++) {
				
				try {
					Thread.sleep(500); // 0.5초동안 멈춘다.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.printf("%c " , '♥');
			}
			System.out.println();
		}
	}
}
