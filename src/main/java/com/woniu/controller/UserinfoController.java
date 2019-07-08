package com.woniu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Userinfo;
import com.woniu.service.IUserinfoService;

@Controller
@RequestMapping("/admin/userinfo/")
public class UserinfoController {
	@Resource
	private IUserinfoService userinfoServiceImpl;
	
	@RequestMapping("save")
	public String save(Userinfo info) {
		userinfoServiceImpl.save(info);
		return "redirect:findAll";
	}
	@RequestMapping("update")
	public String update(Userinfo info) {
		userinfoServiceImpl.update(info);
		return "redirect:findAll";
	}
	@RequestMapping("delete")
	public String delete(Userinfo info) {
		userinfoServiceImpl.delete(info);
		return "redirect:findAll";
	}
	@RequestMapping("findAll")
	public String findAll(ModelMap map) {
		List list = userinfoServiceImpl.findAll();
		map.put("list", list);
		return "/admin/userinfo/list";
	}
	@RequestMapping("findById")
	public String findById(Integer uid,ModelMap map) {
		Userinfo info = userinfoServiceImpl.findById(uid);
		map.put("info", info);
		return "forward:goInput";
	}
	@RequestMapping("goInput")
	public String goInput() {
		return "/admin/userinfo/input";
	}
}
