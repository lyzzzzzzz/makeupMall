package com.lyz.makeupMall.service;

import java.util.List;

import com.lyz.makeupMall.domain.User;

public interface IUserService {
	List<User> selectAllUser();
	List<User> selectUserByUserId(User user);
	String checkUserLoginpwd(User user);
	String registerUser(User user);
	String registerCode(User user) throws Exception;
}
