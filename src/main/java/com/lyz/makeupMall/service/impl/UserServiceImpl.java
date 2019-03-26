package com.lyz.makeupMall.service.impl;

import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyz.makeupMall.domain.PhoneCode;
import com.lyz.makeupMall.domain.User;
import com.lyz.makeupMall.mapper.PhoneCodeMapper;
import com.lyz.makeupMall.mapper.UserMapper;
import com.lyz.makeupMall.component.ResultCode;
import com.lyz.makeupMall.component.SmsSend;
import com.lyz.makeupMall.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private PhoneCodeMapper phoneCodeMapper;
	
	@Autowired
	private SmsSend sms;

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
	 * 注册处理
	 * @Param: User user
	 * @return: ResultCode
	 * @updateTime: 2019-03-26 22:00
	 **/
	@Override
	public String registerUser(User user,PhoneCode phoneCode) {
		List<PhoneCode> phoneCodesLits = phoneCodeMapper.selectPhoneCodeByPhone(phoneCode);
		if(!phoneCodesLits.isEmpty() || phoneCodesLits.get(0).getPhoneCodePhone().matches(user.getUserPhone())) {
			Calendar c = Calendar.getInstance();
			if((c.getTimeInMillis() - phoneCodesLits.get(0).getPhoneCodeTime()) < 300000) {
				if (this.userMapper.selectUserByUserPhone(user).isEmpty()) {
					if (this.userMapper.insertUser(user) != 0) {
						return ResultCode.SUCCESS;
					}else {
						return ResultCode.ERRORSYSTEM;
					}
				}else {
					return ResultCode.PHONE_NOT_EXIST;
				}
			}else {
				return ResultCode.PHONECODE_OVERTIME;
			}
		}
		return ResultCode.ERRORSYSTEM;
	}
	
	/*
	 * 注册短信验证码发送
	 * @Param: User user
	 * @return: ResultCode
	 * @updateTime: 2019-03-24 22:50
	 **/
	@Override
	public String registerCode_Send(User user) throws Exception {
		return sms.sendSms(user,"SMS_161593167");
	}
	
	/*
	 * 个人信息修改
	 * @Param: User loginUser
	 * @return: ResultCode
	 * @updateTime: 2019-03-26 23:00
	 **/
	@Override
	public String userDetail_Update(User loginUser) {
		if(this.userMapper.updateUser(loginUser) > 0) {
			return ResultCode.SUCCESS;
		}
		return ResultCode.FAIL;
	}
	
	/*
	 * 个人信息查询
	 * @Param: User loginUser
	 * @return: ResultCode
	 * @updateTime: 2019-03-26 23:00
	 **/
	@Override
	public User userDetail_Select(User loginUser) {
		List<User> userList = this.userMapper.selectUserByUserPhone(loginUser);
		if(!userList.isEmpty()) {
			return userList.get(0);
		}
		return null;
	}

}
