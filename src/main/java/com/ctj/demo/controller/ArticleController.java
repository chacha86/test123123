package com.ctj.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController {
	
	@RequestMapping("abc")
	@ResponseBody
	public String abc() {
		
		return "<h1 style='color:red'>abc</h1>";
	}
	
	ArrayList<Integer> nlist = new ArrayList<Integer>();
	
	@RequestMapping("addNumber")
	@ResponseBody
	public String addNumber(int num) {
		
		nlist.add(num);
		
		return "추가되었습니다.";
	}
	
	@RequestMapping("showAllValues")
	@ResponseBody
	public ArrayList<Integer> showAllValues() {
		return nlist;
	}

}
