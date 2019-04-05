package com.lyz.makeupMall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.alibaba.fastjson.JSON;
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
	@ResponseBody
	public String Login(@RequestBody Map<String, Object> userMap) {
		if(userMap.get("userPhone").toString().matches("^1[34578]\\d{9}$")) {
			User loginUser = new User();
			loginUser.setUserPhone(userMap.get("userPhone").toString());
			loginUser.setUserLoginpwd(userMap.get("userLoginpwd").toString());
			if(userService.checkUserLoginpwd(loginUser) == ResultCode.SUCCESS) {
				return ResultCode.LOGIN_SUCCESS;
			}
			if(userService.checkUserLoginpwd(loginUser) == ResultCode.FAIL) {
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
	@ResponseBody
	public String Register(@RequestBody Map<String, Object> userMap) throws Exception {
		User loginUser = new User();
		PhoneCode phoneCode = new PhoneCode();
		loginUser.setUserPhone(userMap.get("userPhone").toString());
		loginUser.setUserLoginpwd(userMap.get("userLoginpwd").toString());
		phoneCode.setPhoneCodeCode(userMap.get("phoneCodeCode").toString());
		phoneCode.setPhoneCodeTime(Long.valueOf(userMap.get("phoneCodeTime").toString()));
		return userService.registerUser(loginUser,phoneCode);
	}
	
	/*
	 * 注册短信验证码接口
	 * @Param: User loginUser
	 * @return: ResultCode
	 * @updateTime: 2019-03-25 23:30
	 **/
	@RequestMapping("user/registercode")
	@ResponseBody
	public String registerCode(@RequestBody Map<String, Object> userMap) throws Exception {
		User loginUser = new User();
		loginUser.setUserPhone(userMap.get("userPhone").toString());
		return userService.registerCode_Send(loginUser);
	}
	
	/*
	 * 身份短信验证码发送接口
	 * @Param: User loginUser
	 * @return: ResultCode
	 * @updateTime: 2019-04-01 23:00
	 **/
	@RequestMapping("user/sendcheckcode")
	@ResponseBody
	public String sendCheckCode(@RequestBody Map<String, Object> userMap) throws Exception {
		User loginUser = new User();
		loginUser.setUserPhone(userMap.get("userPhone").toString());
		return userService.checkCode_Send(loginUser);
	}
	
	/*
	 * 身份短信验证码验证接口
	 * @Param: User loginUser
	 * @return: ResultCode
	 * @updateTime: 2019-04-01 23:00
	 **/
	@RequestMapping("user/checkuser")
	@ResponseBody
	public String checkUser(@RequestBody Map<String, Object> userMap) throws Exception {
		User loginUser = new User();
		PhoneCode phoneCode = new PhoneCode();
		loginUser.setUserPhone(userMap.get("userPhone").toString());
		phoneCode.setPhoneCodeCode(userMap.get("phoneCodeCode").toString());
		phoneCode.setPhoneCodeTime(Long.valueOf(userMap.get("phoneCodeTime").toString()));
		return userService.checkCode(loginUser, phoneCode);
	}
	
	/*
	 * 个人信息修改接口
	 * @Param: User loginUser
	 * @return: ResultCode
	 * @updateTime: 2019-03-26 23:00
	 **/
	@RequestMapping("user/detailupdate")
	@ResponseBody
	public String userDetailUpdate(@RequestBody Map<String, Object> userMap) throws Exception {
		if(userMap.get("userPhone").toString()!=null) {
			User loginUser = new User();
			loginUser.setUserPhone(userMap.get("userPhone").toString());
			loginUser.setUserLoginpwd(userMap.get("userLoginpwd").toString());
			loginUser.setUserPaypwd(userMap.get("userPaypwd").toString());
			loginUser.setUserAddress(userMap.get("userAddress").toString());
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
	@ResponseBody
	public String userDetailSelect(@RequestBody Map<String, Object> userMap) throws Exception {
		User loginUser = new User();
		loginUser.setUserPhone(userMap.get("userPhone").toString());
		User resultUser = userService.userDetail_Select(loginUser);
		return JSON.toJSONString(resultUser);
	}
}
