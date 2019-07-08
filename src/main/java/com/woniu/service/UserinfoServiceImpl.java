package com.woniu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.common.MD5;
import com.woniu.entity.Userinfo;
import com.woniu.entity.UserinfoExample;
import com.woniu.entity.UserinfoExample.Criteria;
import com.woniu.mapper.UserinfoMapper;
import com.woniu.service.IUserinfoService;

@Service
public class UserinfoServiceImpl implements IUserinfoService{
	@Resource
	private UserinfoMapper userinfoMapper;

	@Override
	@Transactional
	public void save(Userinfo info) {
		// TODO Auto-generated method stub
		info.setUpass(MD5.md5s(info.getUpass()));
		userinfoMapper.insert(info);
	}

	@Override
	@Transactional
	public void update(Userinfo info) {
		// TODO Auto-generated method stub
		info.setUpass(MD5.md5s(info.getUpass()));
		userinfoMapper.updateByPrimaryKey(info);
	}

	@Override
	@Transactional
	public void delete(Userinfo info) {
		// TODO Auto-generated method stub
		userinfoMapper.deleteByPrimaryKey(info.getUid());
	}

	@Override
	@Transactional(readOnly=true)
	public Userinfo findById(Integer uid) {
		// TODO Auto-generated method stub
		return userinfoMapper.selectByPrimaryKey(uid);
	}

	@Override
	@Transactional(readOnly=true)
	public List findAll() {
		// TODO Auto-generated method stub
		return userinfoMapper.selectByExample(null);
	}

	@Override
	public Userinfo login(Userinfo info) {
		// TODO Auto-generated method stub
		UserinfoExample example = new UserinfoExample();
		Criteria c = example.createCriteria();
		c.andUnameEqualTo(info.getUname());
		c.andUpassEqualTo(MD5.md5s(info.getUpass()));
		
		List<Userinfo> list = userinfoMapper.selectByExample(example);
		if(list!=null&&list.size()>0)
			return list.get(0);
		return null;
	}

}
