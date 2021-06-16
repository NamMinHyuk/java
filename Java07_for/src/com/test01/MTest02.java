package com.test01;

public class MTest02 {
	
	public static void main(String[] args) {
		prn();
	}
	
	public static void prn() {
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.println("(" + i + "," + j + ")");
			}
		}
	}
}
