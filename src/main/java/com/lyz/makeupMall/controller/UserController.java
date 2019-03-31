package com.lyz.makeupMall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lyz.makeupMall.component.ResultCode;
import com.lyz.makeupMall.domain.PhoneCode;
import com.lyz.makeupMall.domain.User;
import com.lyz.makeupMall.service.impl.UserServiceImpl;

@RestController
public class UserController {
	@Autowired
	private UserServiceImpl userService;

	/*
	 * 登录接口
	 * @Param: User loginUser
	 * @return: ResultCode
	 * @updateTime: 2019-03-24 12:20
	 **/
	@RequestMapping("user/login")
	public String Login(@RequestBody User loginUser) {
		if(loginUser.getUserPhone().matches("^1[34578]\\d{9}$")) {
			if(userService.checkUserLoginpwd(loginUser).matches(ResultCode.SUCCESS)) {
				return ResultCode.LOGIN_SUCCESS;
			}
			if(userService.checkUserLoginpwd(loginUser).matches(ResultCode.FAIL)) {
				return ResultCode.LOGINPWD_NOT_MATCHES;
			}
		}
		return ResultCode.ERRORSYSTEM;
	}

	/*
	 * 注册接口
	 * @Param: User loginUser
	 * @return: ResultCode
	 * @updateTime: 2019-03-24 12:20
	 **/
	@RequestMapping("user/register")
	public String Register(String jsonObj) throws Exception {
		User loginUser = new User();
		PhoneCode phoneCode = new PhoneCode();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(jsonObj);
		loginUser.setUserPhone(jsonNode.findValue("userPhone").toString().replace("\"", ""));
		loginUser.setUserLoginpwd(jsonNode.findValue("userLoginpwd").toString().replace("\"", ""));
		phoneCode.setPhoneCodePhone(loginUser.getUserPhone());
		phoneCode.setPhoneCodeCode(Integer.valueOf(jsonNode.findValue("phoneCodeCode").toString().replace("\"", "")));
		phoneCode.setPhoneCodeTime(Long.valueOf(jsonNode.findValue("phoneCodeTime").toString().replace("\"", "")));
		return userService.registerUser(loginUser,phoneCode);
	}
	
	/*
	 * 注册短信验证码接口
	 * @Param: User loginUser
	 * @return: ResultCode
	 * @updateTime: 2019-03-25 23:30
	 **/
	@RequestMapping("user/registercode")
	public String registerCode(@RequestBody User loginUser) throws Exception {
		return userService.registerCode_Send(loginUser);
	}
	
	/*
	 * 个人信息修改接口
	 * @Param: User loginUser
	 * @return: ResultCode
	 * @updateTime: 2019-03-26 23:00
	 **/
	@RequestMapping("user/detailupdate")
	public String userDetailUpdate(@RequestBody User loginUser) {
		if(loginUser.getUserPhone()!=null) {
			return userService.userDetail_Update(loginUser);
		}
		return ResultCode.ERRORSYSTEM;
	}
	
	/*
	 * 个人信息查询接口
	 * @Param: User loginUser
	 * @return: ResultCode
	 * @updateTime: 2019-03-26 23:00
	 **/
	@RequestMapping("user/detailselect")
	public String userDetailSelect(@RequestBody User loginUser) {
		return JSON.toJSONString(userService.userDetail_Select(loginUser));
	}
}
