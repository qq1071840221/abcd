package com.woniu.service;

import java.util.List;

import com.woniu.entity.Userinfo;

public interface IUserinfoService {
	public void save(Userinfo info);
	public Userinfo login(Userinfo info);
	public void update(Userinfo info);
	public void delete(Userinfo info);
	public Userinfo findById(Integer uid);
	public List findAll();
}
