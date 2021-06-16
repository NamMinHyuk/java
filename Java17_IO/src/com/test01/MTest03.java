package com.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MTest03 {

	public static void main(String[] args) {
		File fi = new File("a.txt");
		
		MyOutput(fi);
		
		MyInput(fi);
	}
	// read
	private static void MyInput(File fi) {
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream(fi);
			int res = 0;
			while((res = fin.read()) != -1) {
				System.out.print((char)res);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	// write
	private static void MyOutput(File fi) {
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream(fi);
			for(int i=65;i<=90;i++) {
				fo.write(i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fo.close(); // 열었으면 꼭 닫기!!중요!!
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
