package com.test04;

public class MTest {
	
	
	// 1. int형 아규먼트 3개를 전달하면, 해당 값들을 모두 더해서 리턴하는 
	// getSum 이라는 이름의 메소드를 만들자.
	// 해당 메소드는 어디서든 접근 가능하며, static 영역에 만들어진다.
	
	
	// 2. int형 아규먼트 1개를 전달하면, 해당 값을 3으로 나눠 실수형 결과값을
	// 리턴하는 getAvg 라는 이름의 메소드를 만들자.
	// 해당 메소드는 같은 패키지 내에서만 접근 가능하며, static 영역에 만들어진다.
	public static void main(String[] args) {
		// 3. main 메소드에서 위의 두 메소드를 호출하여, 총점과 평균을 출력하자.
		// 다중 선언
		int kor, eng, math;
		// 다중 초기화
		kor = eng = math = 0;
		
		kor = 100;
		eng = 40;
		math = 78;
		
		// 총점
		int sum;
		// 평균
		double avg;
		sum = getSum(kor, eng, math);
		System.out.printf("총점 : %d\n" ,sum);
		//avg = getAvg(sum);
		avg = getAvg(getSum(kor, eng, math));
		System.out.printf("평균 : %f",avg);
	}
	public static int getSum(int i, int j, int k) {
		int result = i+j+k;
		return result;
	}
	static double getAvg(int i) {
		double result = i/3;
		return result;
	}
}
