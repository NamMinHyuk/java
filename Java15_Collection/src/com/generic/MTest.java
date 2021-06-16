package com.generic;

public class MTest {
	
	public static void main(String[] args) {
		
		Emp emp01 = new Emp();
		emp01.setEmpno("a111");
		emp01.setEname("홍길동");
		System.out.println(emp01);
		
		Emp emp02 = new Emp();
		emp02.setEmpno(222);
		emp02.setEname("김선달");
		System.out.println(emp02);
		
		//emp01.setEmpno((int)emp01.getEmpno() + 1);
		emp02.setEmpno((int)emp02.getEmpno() + 1);
		
		System.out.println(emp01);
		System.out.println(emp02);
		
		System.out.println("------------------");
		
		Emp<Integer> emp03 = new Emp<Integer>();
		//emp03.setEmpno("111");
		emp03.setEmpno(111);
		System.out.println(emp03);
		
		Emp<Integer> emp04 = new Emp<Integer>(113,"이순신");
		System.out.println(emp04);
	}
}
