package com.test05;

public class SamsongTV implements TV{
	/* SamsongTv 클래스를 만들자.
	 * - private int volume; 만들고
	 * - volumeUp() 메소드에서는 현재 볼륨에 + 5;
	 * - volumeDown() 메소드에서는 현재 볼륨에 - 5;
	 * - toString() 메소드에서는 "SamsongTV의 현재 볼륨은 n 입니다."
	 * - 생성자가 호출될 시, "SamsongTV가 켜졌습니다."
	 */
	private int volume;
	
	public SamsongTV() {
		System.out.println("SamsongTV가 켜졌습니다.");
	}
	@Override
	public int volumeUp() {
		volume += 5;
		return volume;
	}

	@Override
	public int volumeDown() {
		volume -= 5;
		return volume;
	}

	public String toString() {
		return "SamsongTV의 현재 볼륨은 " + volume + "입니다.";
	}
}
