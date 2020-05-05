package com.test.doubleS.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.doubleS.vo.SampleProVO;

@RestController
public class SampleRestController {
//	@ResponseBody
//	@RequestMapping(value = "sample/doF",method = RequestMethod.GET)
//	public SampleProVO doF() {
//		return new SampleProVO("스마트폰", 80800); //jsonbind추가
//	}
	
	
	//어레이리스트로빼기
//	@ResponseBody
//	@RequestMapping(value = "sample/doF",method = RequestMethod.POST)
//	public List<SampleProVO> doF2(){
//		List<SampleProVO> sam = new ArrayList<SampleProVO>();
//		sam.add(new SampleProVO("힝", 200000));
//		sam.add(new SampleProVO("빙", 222));
//		return sam;
//	}
	//맵
	@ResponseBody
	@RequestMapping(value = "sample/doF",method = RequestMethod.POST)
	public Map<String, Double> doF2(){
		Map<String, Double> sam = new HashMap<String, Double>();
		sam.put("hi", (double) 20000);
		sam.put("hi2", (double) 30000);		
		return sam;
	}
}
