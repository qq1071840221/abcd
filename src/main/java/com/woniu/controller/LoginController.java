package com.woniu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Userinfo;
import com.woniu.service.IUserinfoService;
import com.woniu.service.UserinfoServiceImpl;

@Controller
public class LoginController {
	@Resource
	private IUserinfoService userinfoServiceImpl;
	@RequestMapping("/login")
	public String login(Userinfo info,ModelMap map) {
		info = userinfoServiceImpl.login(info);
		if(info==null) {
			map.put("error", "您的用户名密码不正确");
			return "forward:/index.jsp";
		}else {
			return "redirect:/admin/index.jsp";
		}
	}
}
