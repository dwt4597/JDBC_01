package com.biz.oracle.dao;

import java.sql.*;

public class scoreDao {
	Connection Conn;
	
	public void dbConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "myMem";
			String password = "1234";
			Conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결됨ㅎㅎ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectScorelist() {
		String sql = "SELECT * FROM 성적일람표";
		PreparedStatement ps;
		try {
			ps=Conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(true) {
				if(rs.next()==false) break;
				String strName = rs.getString("이름");
				int intKor = rs.getInt("국어");
				int intMath = rs.getInt("수학");
				int intEng = rs.getInt("영어");
				int intSci = rs.getInt("과학");
				int intArt = rs.getInt("미술");
				int intHis = rs.getInt("국사");
				
				System.out.print(strName+"\t");
				System.out.print(intKor+"\t");
				System.out.print(intMath+"\t");
				System.out.print(intEng+"\t");
				System.out.print(intSci+"\t");
				System.out.print(intArt+"\t");
				System.out.print(intHis+"\n");
				
				
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
