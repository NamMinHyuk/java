package com.test03;

public class Score {
	
	static double getAvg(int kor, int eng, int math) {
		// double avg = (double)(kor+eng+math)/3; 한줄로 바로 리턴함
		return (double)(kor+eng+math)/3;
	}
	public static String getGrade(double i) {
		// switch((int)i / 10)도 가능
		String result = null;
		if(i>=90) {
			result = "A";
		}
		else if(i<90 && i>80){
			result = "B";
		}
		else if(i<80 && i>70) {
			result = "C";
		}
		else if(i<70 && i>60) {
			result = "D";
		}
		else {
			result = "F";
		}
		return result;
	}
}
