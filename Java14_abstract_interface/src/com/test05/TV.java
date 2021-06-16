package com.test05;

public interface TV {
	
	int volumeUp();
	int volumeDown();
	public String toString();
	/*
	 * IgTV 클래스를 만들자.
	 * - private int volume; 만들고
	 * - volumeUp() 메소드에서는 현재 볼륨에 + 3;
	 * - volumeDown() 메소드에서는 현재 볼륨에 - 3;
	 * - toString() 메소드에서는 "IgTV의 현재 볼륨은 n 입니다."
	 * - 생성자가 호출될 시, "IgTV가 켜졌습니다."
	 * 
	 * SamsongTv 클래스를 만들자.
	 * - private int volume; 만들고
	 * - volumeUp() 메소드에서는 현재 볼륨에 + 5;
	 * - volumeDown() 메소드에서는 현재 볼륨에 - 5;
	 * - toString() 메소드에서는 "SamsongTV의 현재 볼륨은 n 입니다."
	 * - 생성자가 호출될 시, "SamsongTV가 켜졌습니다."
	 */
}
