package com.join01.www.dao;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JoinDao extends JdbcTemplate {
	
	public JoinDao() {}
	//기본생성자
	
	public JoinDao(DataSource dataSource) {
		super(dataSource);
		//JdbcTemplate에 dataSource값 전달
		System.out.println("------>>>>>>>>>>>>"+dataSource);
		//dataSource 확인
	}
	
	
	public int join(HashMap<String, String> params) {
		String sql = "INSERT INTO forum.`member` "
				+ "( member_id, passwd, member_nm, email, auth_yn, pwd_chng_dtm, join_dtm) "
				+ "VALUES( '" + params.get("userId")
				+ "', '" + params.get("passwd")
				+ "', '', '" + params.get("email")
				+ "', '', '', DATE_FORMAT(NOW()  ,'%Y%m%d%H%i%s')); ";
		return update(sql);
	}

}
