package com.biz.oracle.exec;

import com.biz.oracle.dao.*;

public class scoreExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scoreDao dao = new scoreDao();
		dao.dbConnection();
		dao.selectScorelist();
		
		
	}

}
