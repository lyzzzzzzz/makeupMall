package com.lyz.makeupMall.component;

import org.springframework.stereotype.Component;

@Component
public class ResultCode {
	//通用返回码
	public static String SUCCESS = "{\"code\":\"1\",\"msg\":\"成功\"}";
	public static String FAIL = "{\"code\":\"0\",\"msg\":\"失败\"}";
	public static String ERRORSYSTEM = "{\"code\":\"-1\",\"msg\":\"系统错误\"}";
	
	//登录
	public static String LOGIN_SUCCESS = "{\"code\":\"101\",\"msg\":\"登录成功\"}";
	public static String LOGINPWD_NOT_MATCHES = "{\"code\":\"102\",\"msg\":\"用户名或密码错误\"}";
	
	//注册
	public static String REGISTER_SUCCESS = "{\"code\":\"103\",\"msg\":\"注册成功\"}";
	public static String REGISTERPHONE_NOT_MATCHES = "{\"code\":\"104\",\"msg\":\"手机格式错误\"}";
	public static String REGISTERPHONE_EXIST = "{\"code\":\"105\",\"msg\":\"用户已存在\"}";
}