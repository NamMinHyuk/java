package com.test01;

import java.io.IOException;

public class MTest01 {

	public static void main(String[] args) {
		// singleton
		Runtime rt = Runtime.getRuntime();
		
		String path = "notepad.exe";
		
		try {
			Process prc = rt.exec(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
