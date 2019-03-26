package com.lyz.makeupMall.mapper;

import java.util.List;

import com.lyz.makeupMall.domain.PhoneCode;
import tk.mybatis.mapper.common.Mapper;

public interface PhoneCodeMapper extends Mapper<PhoneCode> {
	List<PhoneCode> selectPhoneCodeByPhone(PhoneCode phoneCode);
	int insertPhoneCode(PhoneCode phoneCode);
}