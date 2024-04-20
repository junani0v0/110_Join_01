package com.join01.www.dao;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JoinDao extends JdbcTemplate {
	/**
	 * JdbcTemplate에 필요한 형식으로 만듦 (JdbcTemplate ctrl눌러서 들어가보면 나옴)
	 */	
	public JoinDao() {}
	//기본생성자
	
	public JoinDao(DataSource dataSource) {
		super(dataSource);
		//JdbcTemplate에 dataSource값 전달
		System.out.println("------>>>>>>>>>>>>"+dataSource);
		//dataSource 확인
	}
	
	/**
	 * DB에 값을 넣어주기 위한 sql문 
	 * member_id = params.get("userId")
	 * passwd = params.get("passwd")
	 * email = params.get("email")
	 * join_dtm = DATE_FORMAT(NOW()  ,'%Y%m%d%H%i%s') (현재시간, 뒤에는 어떤형식인지 입력 이건 ''안써도 된다)
	 */	
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
