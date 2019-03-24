package com.lyz.makeupMall.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lyz.makeupMall.domain.User;
import com.lyz.makeupMall.mapper.UserMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lyz.makeupMall.component.ResultCode;
import com.lyz.makeupMall.component.SmsSend;
import com.lyz.makeupMall.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private SmsSend sms;

	@Override
	public List<User> selectAllUser() {
		List<User> userList = this.userMapper.selectAllUser();
		return userList;
	}

	@Override
	public List<User> selectUserByUserId(User user) {
		List<User> userList = this.userMapper.selectUserByUserId(user);
		return userList;
	}

	/*
	 * 配对用户密码是否一致
	 * @Param: User user
	 * @return: ResultCode
	 * @updateTime: 2019-03-24 12:20
	 **/
	@Override
	public String checkUserLoginpwd(User user) {
		String userLoginpwd = user.getUserLoginpwd();
		if (!this.userMapper.selectUserByUserPhone(user).isEmpty()) {
			List<User> userList = this.userMapper.selectUserByUserPhone(user);
			if (userList.get(0).getUserLoginpwd().matches(userLoginpwd)) {
				return ResultCode.SUCCESS;
			} else {
				return ResultCode.FAIL;
			}
		}
		return ResultCode.ERRORSYSTEM;
	}

	/*
	 * 插入用户数据
	 * @Param: User user
	 * @return: ResultCode
	 * @updateTime: 2019-03-24 12:20
	 **/
	@Override
	public String registerUser(User user) {
		if (this.userMapper.selectUserByUserPhone(user).isEmpty()) {
			if (this.userMapper.insertUser(user) != 0) {
				return ResultCode.SUCCESS;
			}
		}else {
			return ResultCode.FAIL;
		}
		return ResultCode.ERRORSYSTEM;
	}
	
	/*
	 * 注册短信验证码
	 * @Param: User user
	 * @return: ResultCode
	 * @updateTime: 2019-03-24 22:50
	 **/
	@Override
	public String registerCode(User user) throws Exception {
		String resultstr = sms.sendSms(user,"SMS_161593167");
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(resultstr);
		return jsonNode.findValue("Code").toString();
	}

}
