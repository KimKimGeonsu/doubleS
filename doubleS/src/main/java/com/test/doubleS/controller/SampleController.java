package com.test.doubleS.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.test.doubleS.vo.SampleProVO;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("sample/doA")
	public String doA(Model model) {
		logger.info("doA called.....");
		model.addAttribute("message", "방문을 환영합니다");
		
		return "sample/doB";		
	}
	
	@RequestMapping("sample/doB")
	public void doB() {
		logger.info("doB call....");
	}
	
	@RequestMapping("sample/doC")
	public ModelAndView doC() {
		logger.info("doC called....");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pro", new SampleProVO("연필", 10000));
		return new ModelAndView("sample/doC","map",map);
	}
	
	@RequestMapping("sample/doD")
	public String doD(RedirectAttributes red) {
		red.addAttribute("red", "리다이렉트꺼");
		return "redirect:/sample/doE";
	}
	
	
	@RequestMapping("sample/doE")
	public void doE(@RequestParam("red")String red) {
		System.out.println(red);
	}
	
//	@RequestMapping(value = "sample/doE",method = RequestMethod.GET)
//	public ModelAndView doE(@RequestParam("red")String red) {
//		System.out.println(red);
//		return new ModelAndView("sample/doE","red",red);
//	}
	

}
