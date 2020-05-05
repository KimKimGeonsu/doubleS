package com.test.doubleS.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.doubleS.service.MemberService;
import com.test.doubleS.vo.MemberVO;

@Controller
public class MemberController {
	@Inject
	MemberService service;

	@RequestMapping(value = "member/list.do", method = RequestMethod.GET)
	public ModelAndView memberList(ModelAndView mv) {
		List<MemberVO> list= service.memberList();
		mv.addObject("list", list);
		mv.setViewName("/member/member_list");
		return mv;
	}
}
