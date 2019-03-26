package com.lyz.makeupMall.component;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lyz.makeupMall.domain.PhoneCode;
import com.lyz.makeupMall.domain.User;
import com.lyz.makeupMall.mapper.PhoneCodeMapper;

@Component
public class SmsSend {
	@Autowired
	private PhoneCodeMapper phoneCodeMapper;

	private PhoneCode phoneCode = new PhoneCode();

	/*
	 * 发送短信验证码
	 * 
	 * @Param: User user
	 * 
	 * @return: ResultCode
	 * 
	 * @updateTime: 2019-03-25 23:30
	 **/
	public String sendSms(User user, String templateCode) throws Exception {
		DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIWzRk9rbydlA2",
				"e0XN5F3WVIpcQdHyujkvOA5sRFNzVj");
		IAcsClient client = new DefaultAcsClient(profile);

		CommonRequest request = new CommonRequest();
		// request.setProtocol(ProtocolType.HTTPS);
		request.setMethod(MethodType.POST);
		request.setDomain("dysmsapi.aliyuncs.com");
		request.setVersion("2017-05-25");
		request.setAction("SendSms");
		request.putQueryParameter("RegionId", "cn-hangzhou");
		request.putQueryParameter("PhoneNumbers", user.getUserPhone());
		request.putQueryParameter("SignName", "有间店");
		request.putQueryParameter("TemplateCode", templateCode);
		int code = (int) (Math.random() * 9999) + 100;
		request.putQueryParameter("TemplateParam", "{\"code\":\"" + code + "\"}");
		String resultstr = client.getCommonResponse(request).getData();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(resultstr);
		String str = jsonNode.findValue("Code").toString();
		if (str.matches("\"OK\"")) {
			// 验证信息发送成功，存入数据库
			Calendar c = Calendar.getInstance();
			this.phoneCode.setPhoneCodePhone(userPhone);
			this.phoneCode.setPhoneCodeCode(code);
			this.phoneCode.setPhoneCodeTime(c.getTimeInMillis());
			this.phoneCodeMapper.insertPhoneCode(this.phoneCode);
			return ResultCode.REGISTERCODE_SUCCESS;
		} else if (str.matches("\"isv.MOBILE_NUMBER_ILLEGAL\"")) {
			return ResultCode.REGISTERCODE_ILLEGAL;
		} else {
			return ResultCode.ERRORSYSTEM;
		}
	}
}
