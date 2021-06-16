package com.point;
import java.util.Scanner;
public class PointLength {
	
	// java.lang.Math class 참고하자!
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x좌표 : ");
		int x = sc.nextInt();
		System.out.println("y좌표 : ");
		int y = sc.nextInt();

		System.out.printf("(0, 0) 부터 (%d,%d)까지의 거리는 %.2f 입니다.", x, y, pLength(x, y));
	}

	// x좌표와 y좌표를 입력받아
	// (0,0) 부터 (x,y)까지의 직선의 거리를 리턴하는
	// pLength() 메소드.
	public static double pLength(int x, int y) {
		double res = 0;
		// x^2 + y^2 = z^z Math.pow(x,2);
		// root : Math.sqrt(Math.pow(x,2),Math.pow(y,2))
		res = Math.hypot(x, y);
		
		return res;

	}
}
