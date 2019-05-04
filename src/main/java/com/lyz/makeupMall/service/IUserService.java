package com.lyz.makeupMall.service;

import com.lyz.makeupMall.domain.PhoneCode;
import com.lyz.makeupMall.domain.User;

public interface IUserService {
	String checkUserLoginpwd(User user);
	String registerUser(User user,PhoneCode phoneCode);
	String registerCode_Send(User user) throws Exception;
	String checkCode_Send(User user) throws Exception;
	String checkCode(User user,PhoneCode phoneCode) throws Exception;
	String userDetail_Update(User user);
	User userDetail_Select(User user);
	User selectUserByUserPhone(String userPhone);
}
