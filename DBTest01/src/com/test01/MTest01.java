package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MTest01 {	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1. driver 연결 (ojdbc.jar 잊지말자!!) .jar -> 라이브러리
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		// 중요!! 자바랑 db 연결할 수 있는 통로
		Connection con = DriverManager.getConnection(url, user, password);
		
		// 3. query 준비
		String sql = " SELECT EMPNO,ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO "
					+ " FROM EMP ";
		Statement stmt = con.createStatement(); 
		
		// 4. query 실행 및 리턴
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.printf("%6d %10s %10s %6d %10s %7.2f %7.2f %3d \n",
								rs.getInt("EMPNO"),
								rs.getString(2),
								rs.getString("JOB"),
								rs.getInt(4),
								rs.getDate("HIREDATE"),
								rs.getDouble(6),
								rs.getDouble("COMM"),
								rs.getInt(8));
		}
		
		// 5. db 종료
		rs.close();
		stmt.close();
		con.close();
		
	}
}
