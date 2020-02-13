package com.wx.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@RequestMapping("getUser")
	@ResponseBody
	public List<String> getUser(){
		System.out.println("输出");
		List<String> list=new ArrayList<String>();
		list.add("阿偲");
		list.add("17");

		System.out.println("输出");
		list.add("傻瓜");
		//sdafasdf
		System.out.println("输出");
		return list;

	}
	
}
