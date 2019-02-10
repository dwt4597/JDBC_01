package com.biz.oracle.exec;

import com.biz.oracle.dao.*;

public class IolistExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Dao class를 사용하기 위해서 객체로 생성
		 */
		IolistDao dao = new IolistDao();
		
		/*
		 * (절차 중요)
		 * DB 연결
		 */
		dao.dbConnection();
		/*
		 * 데이터를 읽어서 console에 표시
		 */
		dao.selectIoList();
		
	}

}
