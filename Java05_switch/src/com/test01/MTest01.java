package com.test01;

public class MTest01 {

	public static void main(String[] args) {
		// if는 순차적으로 모든 코드를 읽어드리지만
		// switch는 해당 case로 jumping하기 때문에
		// fall through
		
		prn01();
		prn02();
	}
	public static void prn01(){
		int i = 2;
		
		switch(i) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		}
	}
	public static void prn02() {
		int i = 2;
		
		switch(i) {
		case 1:
		case 3:
			System.out.println("홀수 입니다.");
			break;
		case 2:
		case 4:
			System.out.println("짝수 입니다.");
			break;
		default:
			System.out.println("1 ~ 4 사이의 숫자가 아닙니다.");
		}
	}
}

