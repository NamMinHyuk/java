package com.test01;

public class MTest02 {

	public static void main(String[] args) {
		// static : Class.method();
		MTest01.publicMethod();
		MTest01.protectedMethod();
		MTest01.defaultMethod();
		//MTest01.privateMethod();
		System.out.println("-----------------");
		
		// non-static : Class 변수 = new Class();
		//              변수.method();
		MTest01 nonStatic = new MTest01();
		nonStatic.nonStaticMethod();
	}
}
