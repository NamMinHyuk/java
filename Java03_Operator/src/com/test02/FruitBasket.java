package com.test02;

public class FruitBasket {
	//전역변수
	static int basketSize = 30;	// class 변수
	int fruitCount = 10;		// instance(객체) 변수
	String fruitName;

	// 1. 과일의 이름과, 과일 갯수를 받아서
	// fruitName 변수에 과일이름을 대입하고
	// fruitCount 변수에 과일 갯수를 추가하는
	// basketSetting 이라는 메소드를 만들자.
	// 어디서나 접근 가능하고,
	// non-static이고, 리턴하는 값은 없다.
	// 가장 마지막에 basketPrn 메소드를 호출하자.
	public void basketSetting(String name , int count) {
		fruitName = name;
		fruitCount += count;
		basketPrn();
	}

	// 2. basketPrn 메소드는
	// "바구니 안의 과일 : 바나나" 를 출력하고,
	// basketSize의 값과 fruitCount의 값을 비교하여,
	// basketSize의 값이fruitCount의 값보다 크거나 같으면 "바나나의 갯수는 20 입니다."
	// 아니면 "바구니가 넘쳤습니다." 출력하자.
	// 해당 클래스 내에서만 접근 가능하고,
	// non-static이고, 리턴하는 값은 없다.
	private void basketPrn() {
		System.out.println("바구니 안의 과일 : " + fruitName);
		if(basketSize<fruitCount)
			System.out.println("바구니가 넘쳤습니다.");
		else 
			System.out.printf("%s의 갯수는 %d 입니다.\n" , fruitName, fruitCount);
		
	}
}
