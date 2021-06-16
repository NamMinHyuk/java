package com.test05;
/*
 * IgTV 클래스를 만들자.
 * - private int volume; 만들고
 * - volumeUp() 메소드에서는 현재 볼륨에 + 3;
 * - volumeDown() 메소드에서는 현재 볼륨에 - 3;
 * - toString() 메소드에서는 "IgTV의 현재 볼륨은 n 입니다."
 * - 생성자가 호출될 시, "IgTV가 켜졌습니다."
 */
public class IgTV implements TV{

	private int volume;
	
	public IgTV() {
		System.out.println("IgTV가 켜졌습니다.");
	}
	@Override
	public int volumeUp() {
		volume += 3;
		return volume;
	}

	@Override
	public int volumeDown() {
		volume -= 3;
		return volume;
	}
	public String toString() {
		return "IgTV의 현재 볼륨은 " + volume + "입니다.";
	}
}
