package com.lyz.makeupMall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyz.makeupMall.domain.User;
import com.lyz.makeupMall.mapper.UserMapper;
import com.lyz.makeupMall.service.IUserService;


@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public List<User> selectAllUser() {
		List<User> userList=this.userMapper.selectAllUser();
		return userList;
	}

}
