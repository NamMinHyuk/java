package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest01 {
	
	public static void main(String[] args) {
		
		// 해당 경로에 fi 생성
		File fi = new File("c:/TEST_IO");
		
		if(fi.exists()) {
			System.out.println("exists!");
		}else {
			System.out.println("new!");
			fi.mkdirs();
		}
		
		// fi 밑에 AA 생성
		File aa = new File(fi,"AA");
		aa.mkdir();
		
		// fi 밑에 BB 생성
		File bb = new File("c:/TEST_IO", "BB");
		bb.mkdir();
		
		// AA 밑에 a.txt 생성
		File a = new File(aa, "a.txt");
		try {
			a.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
