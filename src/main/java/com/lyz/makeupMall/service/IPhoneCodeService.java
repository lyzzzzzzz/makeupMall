package com.lyz.makeupMall.service;

import com.lyz.makeupMall.domain.User;

public interface IPhoneCodeService {
	String sendSms(User user, String templateCode);
}
