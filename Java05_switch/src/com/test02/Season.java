package com.test02;

public class Season {
	
	public String prn(int i) {
		String result = null;
		switch(i) {
		case 12:
		case 1:
		case 2:
			result = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			result = "봄";
			break;
		case 6:
		case 7:
		case 8:
			result = "여름";
			break;
		case 9:
		case 10:
		case 11:
			result = "가을";
			break;
		}
		return result;
	}
}
