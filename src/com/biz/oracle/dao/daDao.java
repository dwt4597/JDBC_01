package com.biz.oracle.dao;

import java.sql.*;

public class daDao {
	Connection jbcrgs;
	
	public void dbcnt() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "myMem";
			String password = "1234";
			jbcrgs = DriverManager.getConnection(url, user, password);
			System.out.println("오오");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	public void scorelist() {
		String sql = "SELECT * FROM 일람표";
		PreparedStatement ps;
		
		try {
			ps=jbcrgs.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(true) {
				if(rs.next()==false) break;
				String strname = rs.getString("이름");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
