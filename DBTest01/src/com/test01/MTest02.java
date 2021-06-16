package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest02 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		Connection con = DriverManager.getConnection(url, user, password);
		// 3. query 준비
		Scanner sc = new Scanner(System.in);
		int empno = sc.nextInt();
	 	String sql = " SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO " 
	 			   + " FROM EMP " 
	 			   + " WHERE EMPNO = " + empno;
	 	Statement stmt = con.createStatement();
		// 4. query 실행 및 리턴
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.printf("%6d %10s %10s %6d %10s %6d %4d %3d \n",
								rs.getInt("EMPNO"),
								rs.getString("ENAME"),
								rs.getString("JOB"),
								rs.getInt("MGR"),
								rs.getDate("HIREDATE"),
								rs.getInt("SAL"),
								rs.getInt("COMM"),
								rs.getInt("DEPTNO"));
		}
		// 5. db 종료
		rs.close();
		stmt.close();
		con.close();
	}
}
