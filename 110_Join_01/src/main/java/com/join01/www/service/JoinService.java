package com.join01.www.service;

import java.util.HashMap;

import com.join01.www.dao.JoinDao;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class JoinService {
	
	/**
	 * 회원가입시 회원 비밀번호 암호화
	 * 
	 * @param custId 회원 ID
	 * @param passwd 회원 비밀번호
	 * @param email 회원 이메일
	 * 
	 * @return 회원 비밀번호 암호화하여 param값에 담아 리턴
	 */	
	public int join(HashMap<String, String> params) {
//		System.out.println(params);
		
		String passwd = params.get("passwd");
		String encPasswd = BCrypt.withDefaults().hashToString(12, passwd.toCharArray());
		System.out.println("encPasswd >>>>>>>>>-------------- " + encPasswd);
		BCrypt.Result result = BCrypt.verifyer().verify(passwd.toCharArray(), encPasswd);
		System.out.println("result.verified >>>>>>>----------- " + result.verified);
		
		params.put("passwd", encPasswd);
		
		
		return joinDao.join(params);
		
	}
	
	/**
	 * JoinDao 연결 확인 & joinDao로 값 전달 
	 */	
	private JoinDao joinDao;
	public void setJoinDao(JoinDao joinDao) {
		System.out.println(">>>>>>>>----"+joinDao+ "<<< in joinService");
		this.joinDao = joinDao;
	}

}
