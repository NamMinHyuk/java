package com.coffee02;

import java.util.Scanner;

public class CoffeeMachine {
	
	public void inputMoney() {
		System.out.println("돈을 넣어주세요\n1잔당 200원");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		System.out.println("몇 잔을 만들까요?(숫자만 입력)");
		int coffee = sc.nextInt();
		
		makeCoffee(money,coffee);
	}
	
	public void makeCoffee(int money, int coffee) {
		
		int change = money - (coffee * 200);
		
		if(change >= 0) {
			System.out.println("커피" + coffee + "잔 나왔습니다.");
			System.out.println("잔돈은 " + change + "원 입니다.");
		} else {
			System.out.println("금액이 부족합니다.");
		}
	}
}
