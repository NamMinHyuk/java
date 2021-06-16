package com.score.controller;

import java.util.List;
import java.util.Scanner;

import com.score.biz.ScoreBizImpl;
import com.score.dto.ScoreDto;

public class ScoreController {

	private static Scanner sc = new Scanner(System.in);
	
	public static int getmenu() {
		StringBuffer sb = new StringBuffer();
		sb.append("********\n")
		  .append("1.전체출력\n")
		  .append("2.선택출력\n")
		  .append("3.추  가\n")
		  .append("4.수  정\n")
		  .append("5.삭  제\n")
		  .append("6.1등출력\n")
		  .append("7.2등출력\n")
		  .append("8.3등출력\n")
		  .append("9.종  료\n)")
		  .append("input select");
		System.out.println(sb);
		int select = sc.nextInt();
		
		return select;
	}
	
	public static void main(String[] args) {
		ScoreBizImpl biz = new ScoreBizImpl();
		int select = 0;
		
		do {
			 
			select = getmenu();
			switch(select) {
			case 1:
				System.out.println("전체 출력!");
				List<ScoreDto> list = biz.selectList();
				for(ScoreDto dto : list) {
					System.out.println(dto);
				}
				break;
			case 2:
				System.out.println("선택 출력!");
				System.out.println("출력할 이름 : ");
				String select_s_name = sc.next();
				ScoreDto selectOneDto = biz.selectOne(select_s_name);
				System.out.println(selectOneDto);
				break;
			case 3:
				System.out.println("추가!");
				System.out.println("추가할 이름 : ");
				String insert_s_name = sc.next();
				System.out.println("국어점수 : ");
				int insert_s_kor = sc.nextInt();
				System.out.println("영어점수 : ");
				int insert_s_eng = sc.nextInt();
				System.out.println("수학점수 : ");
				int insert_s_math = sc.nextInt();
				ScoreDto insertDto = new ScoreDto(insert_s_name, insert_s_kor, insert_s_eng, insert_s_math);
				int insertRes = biz.insert(insertDto);
				if(insertRes > 0) {
					System.out.println("추가 성공");
				}else {
					System.out.println("추가 실패");
				}
				break;
			case 4:
				System.out.println("수정!");
				System.out.println("수정할 이름 : ");
				String update_s_name = sc.next();
				System.out.println("국어점수 : ");
				int update_s_kor = sc.nextInt();
				System.out.println("영어점수 : ");
				int update_s_eng = sc.nextInt();
				System.out.println("수학점수 : ");
				int update_s_math = sc.nextInt();
				ScoreDto updateDto = new ScoreDto(update_s_name, update_s_kor, update_s_eng, update_s_math);
				int updateRes = biz.update(updateDto);
				if(updateRes > 0) {
					System.out.println("수정 성공");
				}else {
					System.out.println("수정 실패");
				}
				break;
			case 5:
				System.out.println("삭제!");
				System.out.println("삭제할 이름 : ");
				String delete_s_name = sc.next();
				int deleteRes = biz.delete(delete_s_name);
				if(deleteRes > 0) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
				break;
			case 6:
				System.out.println("1등 출력!");
				ScoreDto fir = biz.topNproc(1);
				break;
			case 7:
				System.out.println("2등 출력!");
				System.out.println(biz.topNproc(2));
				break;
			case 8:
				System.out.println("3등 출력!");
				System.out.println(biz.topNproc(3));
				break;
			case 9: 
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}while(select != 9);
	}
	
}

