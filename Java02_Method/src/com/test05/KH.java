package com.test05;

public class KH {

		public static void main(String[] args) {
			// 1. com.test05 패키지에 QClass라는 이름의 class를 만들자.
			
			// 2. QClass에다가 이름을 받아서 "안녕하세요 XX님" 을 리턴하는 
			// getName이라는 메소드를 만들자.
			// 어디서나 접근 가능하고, static영역에 저장되는 메소드
			
			// 3. QClass에다가 전화번호 가장 뒷 4자리를 받아서, 
			// "xxxx번호님 안녕하세요."를 리턴하는
			// getPhone 이라는 메소드를 만들자.
			// 상속인 경우 상속된 곳에서 / 아닌 경우 같은 패키지 내에서 접근 가능하고,
			// non-static 영역에 저장되는 메소드
			
			String name = "남민혁";
			int phone = 0111;
			// 4. name 변수와 phone 변수를 사용하여, 
			// QClass에 만들어 놓은 getName과 getPhone을 호출하고
			// 리턴받은 값들을 출력하자.
			String myName = QClass.getName(name);
			System.out.println(myName);
			
			QClass qclass = new QClass();
			System.out.println(qclass.getPhone(Integer.toString(phone)));
			
			
			
			
		}
}
