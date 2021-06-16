package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mtest04 {
	
	public static void main(String[] args) {
		File fi = new File("a.txt");
		
		try {
			MyOutput(fi);
			MyInput(fi);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void MyInput(File fi) throws IOException {
		FileReader fr = new FileReader(fi);
		int ch;
		while ((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
	}

	// throws : 예외를 위임 -> "예외가 발생할 수 있는 명령문을 가진 메소드"를 호출한 메소드
	// throw  : 예외를 발생
	private static void MyOutput(File fi) throws IOException {
		FileWriter fw = new FileWriter(fi, true);
		
		//write와 append 차이점 write는 method chaining이 안되고 append는 된다.
		fw.write("abcdefg\n");
		fw.append("연습중입니다.").append("java.io 재밌다.\n\n");
		
		fw.close();
	}
}
