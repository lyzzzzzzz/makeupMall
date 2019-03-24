package com.lyz.makeupMall.component;

import org.springframework.stereotype.Component;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.lyz.makeupMall.domain.User;

@Component
public class SmsSend {
	/*
	 * 发送短信验证码
	 * @Param: User user
	 * @return: ResultCode
	 * @updateTime: 2019-03-25 1:00
	 **/
	public String sendSms(User user,String templateCode) throws Exception {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIWzRk9rbydlA2", "e0XN5F3WVIpcQdHyujkvOA5sRFNzVj");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        //request.setProtocol(ProtocolType.HTTPS);
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", user.getUserPhone());
        request.putQueryParameter("SignName", "有间店");
        request.putQueryParameter("TemplateCode", templateCode);
        int code = (int)(Math.random()*9999)+100;
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");
        return client.getCommonResponse(request).getData();
    }
}
