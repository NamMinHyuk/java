package com.score.dao;

import java.util.List;

import com.score.dto.ScoreDto;

public interface ScoreDao {
	
	String SELECT_LIST_SQL = " SELECT S_NAME,S_KOR,S_ENG,S_MATH,S_SUM,S_AVG,S_GRADE "
			+ "	FROM SCORE "
			+ " ORDER BY S_AVG DESC ";
	String SELECT_ONE_SQL = " SELECT S_NAME,S_KOR,S_ENG,S_MATH,S_SUM,S_AVG,S_GRADE "
			+ " FROM SCORE "
			+ " WHERE S_NAME = ? ";
	String INSERT_SQL = " INSERT INTO SCORE "
			+ "	VALUES(?,?,?,?,?,?,?) ";
	String UPDATE_SQL = " UPDATE SCORE "
			+ " SET S_KOR = ? , S_ENG = ? , S_MATH = ? , S_SUM = ? , S_AVG = ? , S_GRADE = ? "
			+ "	WHERE S_NAME = ? ";
	String DELETE_SQL = " DELETE FROM SCORE WHERE S_NAME = ? ";
	
	String TOP_N_SQL = " SELECT R,S_NAME,S_KOR,S_ENG,S_MATH,S_SUM,S_AVG,S_GRADE "
					 + " FROM "
					 + " 	(SELECT ROWNUM AS R, S_NAME,S_KOR,S_ENG,S_MATH,S_SUM,S_AVG,S_GRADE "
					 + "	FROM "
					 + "			( "
					 + "			SELECT S_NAME,S_KOR,S_ENG,S_MATH,S_SUM,S_AVG,S_GRADE "
					 + "			FROM SCORE "
					 + "			ORDER BY S_AVG DESC "
					 + "			) A "
					 + "	) B "
					 + " WHERE R = ? ";
	
	public List<ScoreDto> selectList();
	public ScoreDto selectOne(String s_name);
	public int insert(ScoreDto dto);
	public int update(ScoreDto dto);
	public int delete(String s_name);
	
	public ScoreDto topNproc(int n);
}
