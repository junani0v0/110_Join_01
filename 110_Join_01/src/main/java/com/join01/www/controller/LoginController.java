package com.join01.www.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.join01.www.service.JoinService;

@Controller
public class LoginController {
	
	/**
	 * LoginController 빈등록 확인용
	 */
	
	public LoginController() {
		System.out.println("======================생성완료======================");
	}
	
	/**
	 * login.jsp 연결용
	 */
	@RequestMapping("/loginPage.do")
	public String loginPage() {
		return "login";
	}
	
	/**
	 * JoinService 의존성 주입
	 */
	@Autowired
	private JoinService joinService;
	
//	@RequestMapping("/join.do")
//	public String join(@RequestParam HashMap<String, String> params) {
//		System.out.println("<<<<<<<<<<<<<<<<"+params);
		//처음 jsp에서 controller로 param 넘어오는지 확인용
//		joinService.join(params);
//		return "login";
		
	/**
	 * LoginController 빈등록 확인용
	 * 
	 * @param custId 회원 ID
	 * @param passwd 회원 비밀번호
	 * @param email 회원 이메일
	 */	
	@RequestMapping("/join.do")
	public ModelAndView join(@RequestParam HashMap<String, String> params) {
		int result = joinService.join(params);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",result);
		String msg = (result == 1) ? "A가입 성공" : "B가입 실패";
		mv.addObject("msg",msg);
		mv.setViewName("login");
		return mv;

	}
	
}
