package com.vehicle;

public class MTest {
	
	public static void main(String[] args) {
		/*
		 *  1. Car를 상속받는 SportsCar Class를 만들자.
		 *     기본 생성자와, 파라미터 1개짜리 생성자를 만들자.
		 *     accelPedal과 breakPedal을 overriding 하여,
		 *     speed는 15씩 증감, "속도가 더 빨리 증가합니다"/"속도가 더 빨리 감소합니다."
		 *  2. Car를 상속받는 Truck class를 만들자.
		 *     기본 생성자와, 파라미터 1개짜리 생성자를 만들자.
		 *     accelPedal과 breakPedal을 overriding 하여,
		 *     speed는 5씩 증감, "속도가 더 느리게 증가합니다"/"속도가 더 느리게 감소합니다."
		 *    
		 *  3. MTest에서 실행해보자.
		 */
		Car c1 = new SportsCar();
		c1.accelPedal();
		c1.accelPedal();
		System.out.println(c1);
		c1.breakPedal();
		c1.breakPedal();
		c1.breakPedal();
		
		Car c2 = new Truck();
		c2.accelPedal();
		c2.accelPedal();
		System.out.println(c2);
		c2.breakPedal();
		c2.breakPedal();
		c2.breakPedal();
	}
}
