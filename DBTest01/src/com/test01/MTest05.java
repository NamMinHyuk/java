package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest05 {
	// delete
	// 부서 번호 받아서, 삭제하자
	// DELETE FROM DEPT WHERE DEPTNO = ?
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = DriverManager.getConnection(url,user,password);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서 번호 : ");
		int deptno = sc.nextInt();
		
		String sql = " DELETE FROM DEPT WHERE DEPTNO = " + deptno;
		Statement stmt = con.createStatement();
		
		int res = stmt.executeUpdate(sql);
		if(res > 0) {
			System.out.println("DELETE 성공");
		}else {
			System.out.println("DELETE 실패");
		}
		stmt.close();
		con.close();
		
	}
}
