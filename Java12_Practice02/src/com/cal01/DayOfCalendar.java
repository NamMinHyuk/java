package com.cal01;

// java.util.Calendar 사용하지 않고, 달력만들기
public class DayOfCalendar {

	
		// 윤년 계산
		private static boolean isLeapYear(int year) {
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				return true;
			}
			return false;
		}

		//해당 월의 최고 일수 계산
		private static int getDates(int year, int month) {
			if(month == 1 || month == 3 || month == 5 || month == 7 ||
					month == 8 || month == 10 || month == 12) {
				return 31;
			}else if (month == 4 || month == 6 || month == 9 || month == 11) {
				return 30;
			}else if (month == 2) {
				return 29;
			} else {
				switch(month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					return 31;
				case 4: case 6: case 9: case 11:
					return 30;
				case 2:
					return 28;
				}
			}
			
			return 0;
		}

		// 해당 월의 1일의 요일 계산
		private static int whatDay(int year, int month) {
			int dayOfWeek = 0;

			// 1년 1월 1일 ~ year년 month월 1일까지의 총 합
			int sum = 0;

			// 1년 1월 1일 ~ year-1년 12월 31일까지의 합
			for (int i = 1; i < year; i++) {
				for (int j = 1; j < 13; i++) {
					sum += getDates(i, j);
				}
			}
			// year년 1월 1일 ~ year년 month-1월 마지막일 까지의 합
			for (int i = 1; i < month; i++) {
				sum += getDates(year, i);
			}
			// year년 month월 1일
			sum += 1;

			// 1년 1월 1일 ~ year년 month월 1일의 합 % 7 = 요일
			// 0: 일요일 / 1: 월요일 / 2: 화요일 / 3: 수요일 ... / 6: 토요일
			dayOfWeek = sum % 7;
			
			return dayOfWeek;
		}

		// 출력
		public static void prn(int year, int month) {
			// 윗부분
			System.out.printf("\t\t%d년 %d월\n", year, month);
			System.out.printf("일\t월\t화\t수\t목\t금\t토\n");

			// 시작요일
			int start = whatDay(year, month);
			// 마지막 날짜
			int last = getDates(year, month);

			// 해당 요일만큼 빈 공간
			for (int i = 0; i < start; i++) {
				System.out.printf("\t");
			}

			for (int i = 1; i <= last; i++) {
				System.out.printf("%d\t", i);
				start++;
				if (start % 7 == 0) {
					System.out.println();
				}
			}
		}
}