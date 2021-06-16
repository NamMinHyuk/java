package com.cal02;
import java.util.Calendar;

//java.util.Calendar 사용하여, 달력만들기 -> 직접 다 만들어라.
public class CalendarUseApi {
	
	public void prn(int year, int month) {
		
		// Calendar cal = new Calendar;
		// singleton -> 객체를 단 한번만 생성
		Calendar cal = Calendar.getInstance();
		// 몇번을 호출해도 같은 것을 참조하고 있다. 새로만드는 것이 아니라
		// Calendar cal2 = Calendar.getInstance();
		System.out.printf("\t\t%d년 %d월\n", year,month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		// year년 month월 1일로 Calendar 객체 설정
		cal.set(year, month-1, 1);
		
		// year년 month월 1일의 요일 값 (1:일요일, 2:월요일, ... , 7:토요일)
		int start = cal.get(Calendar.DAY_OF_WEEK);
		
		// 요일 앞 공백
		for(int i=1;i<start;i++) {
			System.out.printf("\t");
		}
		
		// i : 1일부터 해당 연,월의 마지막 일까지 반복
		for(int i=1;i<=cal.getActualMaximum(Calendar.DATE);i++) {
			// 달력의 일 출력
			System.out.printf("%d\t", i);
			// 요일값 (1~7) 을 증가시키면서, 7의 배수가 되면 다음 줄로.
			if(start % 7 == 0) {
				System.out.println();
			}
			start++;
		}
	}
}
