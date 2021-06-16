package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest04 {

	// update
	// UPDATE DEPT SET DNAME = ?, LOC =? WHERE DEPTNO = ?
	// 변경할 부서 번호, 변경할 부서 이름, 변경할 부서 위치를 입력받아서
	// UPDATE를 실행하고 결과를 리턴받자. (qclass -> kh / 강남 -> 서울)
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = DriverManager.getConnection(url,user,password);
		// 3. query 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.println("변경할 부서 이름 : ");
		String dname = sc.next();
		System.out.println("변경할 부서 위치 : ");
		String loc = sc.next();
		System.out.println("변경할 번호 : ");
		int deptno = sc.nextInt();
		String sql = " UPDATE DEPT SET DNAME = '" + dname + "', Loc = '" + loc + "' WHERE DEPTNO = " + deptno ;  
		Statement stmt = con.createStatement(); 
		int res = stmt.executeUpdate(sql);
		if(res > 0) {
			System.out.println("UPDATE 성공");
		}else {
			System.out.println("UPDATE 실패");
		}
		stmt.close();
		con.close();
		
	}
}
