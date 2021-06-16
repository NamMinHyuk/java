package com.member.controller;

import java.util.List;
import java.util.Scanner;

import com.member.biz.MemberBiz;
import com.member.dto.MemberDto;

// 화면 제어
public class MemberController {

	private static Scanner sc = new Scanner(System.in);
	
	public static int getMenu() {
		StringBuffer sb = new StringBuffer();
		sb.append("********\n")
		.append("1.전체출력\n")
		.append("2.선택출력\n")
		.append("3.추   가\n")
		.append("4.수   정\n")
		.append("5.삭   제\n")
		.append("6.종   료\n")
		.append("input select\n");
		System.out.println(sb);
		int select = sc.nextInt();
		
		return select;
	}
	
	public static void main(String[] args) {
		MemberBiz biz = new MemberBiz();
		
		int select = 0; 
		
		while(select != 6) {
			select = getMenu();
			
			switch(select) {
			case 1:
				System.out.println("전체 출력!");
				List<MemberDto> list = biz.selectList();
				for(MemberDto dto : list) {
					System.out.println(dto);
				}
				break;
			case 2:
				System.out.println("선택 출력!");
				System.out.println("출력할 번호를 입력하시오.");
				int m_no = sc.nextInt();
				MemberDto selectOneDto = biz.selectOne(m_no);
				System.out.println(selectOneDto);
				break;
			case 3:
				System.out.println("추가!");
				// 이름,나이,성별,지역,직업,전화번호,이메일
				System.out.println("이름 : ");
				String m_name = sc.next();
				System.out.println("나이 : ");
				int m_age = sc.nextInt();
				System.out.println("성별 : ");
				String m_gender = sc.next();
				System.out.println("지역 : ");
				String m_location = sc.next();
				System.out.println("직업 : ");
				String m_job = sc.next();
				System.out.println("전화번호 : ");
				String m_tel = sc.next();
				System.out.println("이메일 : ");
				String m_email = sc.next();
				MemberDto insertDto = new MemberDto(0, m_name, m_age, m_gender,
													m_location, m_job, m_tel, m_email);
				int insertRes = biz.insert(insertDto);
				if (insertRes > 0) {
					System.out.println("추가 성공!");
				}else {
					System.out.println("추가 실패!");
				}
				
				break;
			case 4: 
				System.out.println("수정!");
				// 이름,나이,성별,지역,직업,전화번호,이메일
				System.out.println("수정할 번호 : ");
				int m_no1 = sc.nextInt();
				System.out.println("수정할 이름 : ");
				String m_name1 = sc.next();
				System.out.println("수정할 나이 : ");
				int m_age1 = sc.nextInt();
				System.out.println("수정할 성별 : ");
				String m_gender1 = sc.next();
				System.out.println("수정할 지역 : ");
				String m_location1 = sc.next();
				System.out.println("수정할 직업 : ");
				String m_job1 = sc.next();
				System.out.println("수정할 전화번호 : ");
				String m_tel1 = sc.next();
				System.out.println("수정할 이메일 : ");
				String m_email1 = sc.next();
				MemberDto updateDto = new MemberDto(m_no1, m_name1, m_age1, m_gender1, m_location1, m_job1, m_tel1, m_email1);
				int updateRes = biz.update(updateDto);
				if (updateRes > 0) {
					System.out.println("수정 성공!");
				}else {
					System.out.println("수정 실패!");
				}
				
				break;
			case 5:
				System.out.println("삭제!");
				System.out.println("삭제할 번호");
				int m_no2 = sc.nextInt();
				int deleteRes = biz.delete(m_no2);
				if(deleteRes > 0) {
					System.out.println("삭제 성공!");
				}else {
					System.out.println("삭제 실패!");
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다...");
				break;
			}
		}
	}
}
