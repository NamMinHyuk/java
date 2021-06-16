package ant;

import java.util.Scanner;

/*
	  1          -- 1
	  11		  -- 1이 한개
	  12         -- 1이 두개
	  1121       -- 1이 한개 2가 한개
	  122111	  -- 1이 두개 2가 한개 1이 한개
	  112213     -- 1이 한개 2가 두개 1이 세개
	  12221131   -- 1이 두개 2가 두개 1이 한개 3이 한개
	  새로운 숫자가 나오기 전까지만 읽어나간다.
 */
public class AntQuiz {
	
	public static void main(String[] args) {
		System.out.println("input stage : ");
		Scanner sc = new Scanner(System.in);
		antPrn(sc.nextInt());
	}
	
	public static void antPrn(int stage) {
		String start = "1";
		System.out.println(start);
		
		for(int i=1;i<stage;i++) {
			start = ant(start);
			System.out.println(start);
		}
	}
	
	public static String ant(String input) {
		String res = "";
		
		char index = input.charAt(0);
		int count = 1;
		
		for (int i = 1; i < input.length(); i++) {
			if (index == input.charAt(i)) {
				count++;
			} else {
				res = res + index + count;
				index = input.charAt(i);
				count = 1;
			}
		}
		res = res + index + count;
		
		return res;
	}

}

