package com.member.biz;

import java.util.List;

import com.member.dao.MemberDao;
import com.member.dto.MemberDto;

// Biz : Business Logic
// 연산, 처리
public class MemberBiz {

	private MemberDao dao = new MemberDao();
	
	public List<MemberDto> selectList(){
		
		return dao.selectList();
	}
	public MemberDto selectOne(int m_no) {
	
		return dao.selectOne(m_no);
	}
	public int insert(MemberDto dto) {
		// M_GENDER -> M F
		// 입력된 값이 m 이라면 -> check 제약조건에 위배
		// m_gender에 저장된 값을 가지고 와서, 대문자로 바꿔서 다시 저장
		dto.setM_gender(dto.getM_gender().toUpperCase());
		
		return dao.insert(dto);
	}
	public int update(MemberDto dto) {
		dto.setM_gender(dto.getM_gender().toUpperCase());
		return dao.update(dto);
	}
	public int delete(int m_no) {
		
		return dao.delete(m_no);
	}
}
