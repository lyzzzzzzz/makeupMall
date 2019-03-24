package com.lyz.makeupMall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.mockito.internal.stubbing.answers.ReturnsElementsOf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.lyz.makeupMall.component.ResultCode;
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
	public String Register(@RequestBody User loginUser) {
		if(loginUser.getUserPhone().matches("^1[34578]\\d{9}$")) {
			if(userService.registerUser(loginUser).matches(ResultCode.SUCCESS)) {
				return ResultCode.REGISTER_SUCCESS;
			}
			if(userService.registerUser(loginUser).matches(ResultCode.FAIL)) {
				return ResultCode.REGISTERPHONE_EXIST;
			}
		}
		return ResultCode.REGISTERPHONE_NOT_MATCHES;
	}
	
	/*
	 * 注册短信验证码接口
	 * @Param: User loginUser
	 * @return: success(注册成功)/fail(用户已存在)/error(未知错误)
	 * @updateTime: 2019-03-24 22:30
	 **/
	@RequestMapping("user/register")
	public String RegisterCode(@RequestBody User loginUser) throws Exception {
		String registerResult = userService.registerCode(loginUser);
		return registerResult;
	}
}
