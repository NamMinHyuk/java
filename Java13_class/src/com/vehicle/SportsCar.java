package com.vehicle;

public class SportsCar extends Car {
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
	 *  
	 *  hint : 상속받으면, 부모의 메소드 사용 가능
	 */
	
	public SportsCar() {
		
	}
	public SportsCar(int speed) {
		super(speed);
	}
	@Override
	public void accelPedal() {
		// speed += 15;
		// speed = speed + 15  super 안써도됨
		setSpeed(getSpeed()+15);
		System.out.println("속도가 더 빨리 증가합니다.");
	}
	@Override
	public void breakPedal() {
		setSpeed(getSpeed() - 15);
		if (getSpeed() >= 0) {
			System.out.println("속도가 더 빨리 감소합니다.");
		} else {
			System.out.println("멈췄습니다.");
			setSpeed(0);
		}
	}
}
