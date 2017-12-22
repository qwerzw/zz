package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value="lo")
@Controller
public class Action {
	@RequestMapping(value="login")
	public ModelAndView login(String username,String password,ModelAndView model){
		if("zhangsan".equals(username)&&"123".equals(password)){
			model.setViewName("index");
		}else {
			model.setViewName("login");
		}
		return model;
	}
}
